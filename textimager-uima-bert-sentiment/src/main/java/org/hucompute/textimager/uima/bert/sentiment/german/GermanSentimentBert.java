package org.hucompute.textimager.uima.bert.sentiment.german;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.hucompute.textimager.uima.sentiment.base.SentimentBase;
import org.hucompute.textimager.uima.type.Sentiment;
import org.json.JSONArray;
import org.json.JSONObject;
import org.texttechnologylab.annotation.AnnotationComment;

public class GermanSentimentBert extends SentimentBase {
    static final String MODEL_NAME = "oliverguhr/german-sentiment-bert";

    @Override
    protected String getDefaultDockerImage() {
        return "textimager-uima-service-bert-sentiment";
    }

    @Override
    protected String getDefaultDockerImageTag() {
        return "0.5";
    }

    @Override
    protected int getDefaultDockerPort() {
        return 8000;
    }

    @Override
    protected String getRestRoute() {
        return "/process";
    }

    @Override
    protected String getAnnotatorVersion() {
        return "0.0.1";
    }

    @Override
    protected void updateCAS(JCas aJCas, JSONObject jsonResult) throws AnalysisEngineProcessException {
        if (jsonResult.has("selections")) {
            for (Object sels : jsonResult.getJSONArray("selections")) {
                JSONObject selection = (JSONObject) sels;
                String selectionAnnotation = selection.getString("selection");
                JSONArray sentences = selection.getJSONArray("sentences");
                for (Object sen : sentences) {
                    JSONObject sentence = (JSONObject) sen;

                    int begin = sentence.getJSONObject("sentence").getInt("begin");
                    int end = sentence.getJSONObject("sentence").getInt("end");

                    Sentiment sentiment = new Sentiment(aJCas, begin, end);
                    sentiment.setSentiment(sentence.getDouble("sentiment"));
                    sentiment.addToIndexes();

                    AnnotationComment comment = new AnnotationComment(aJCas);
                    comment.setReference(sentiment);
                    comment.setKey("selection");
                    comment.setValue(selectionAnnotation);
                    comment.addToIndexes();

                    AnnotationComment bertModel = new AnnotationComment(aJCas);
                    bertModel.setReference(sentiment);
                    bertModel.setKey("bert_model");
                    bertModel.setValue(MODEL_NAME);
                    bertModel.addToIndexes();

                    addAnnotatorComment(aJCas, sentiment);
                }
            }
        }
    }
}
