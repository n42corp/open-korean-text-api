package org.openkoreantext.api;

import static spark.Spark.get;
import static spark.Spark.path;
import static spark.Spark.post;

public class KoreanTextController {
    OpenKoreanTextHelper tokenizerResource = new OpenKoreanTextHelper();
    final String PARAM_TEXT = "text";

    public KoreanTextController() {
        path("/normalize", () -> {
            get("", (req, res) -> tokenizerResource.normalizeGet(req.queryParams(PARAM_TEXT)));
            post("", (req, res) -> tokenizerResource.normalizeGet(req.body()));
        });
        path("/tokenize", () -> {
            get("", (req, res) -> tokenizerResource.tokenizeGet(req.queryParams(PARAM_TEXT)));
            post("", (req, res) -> tokenizerResource.tokenizeGet(req.body()));
        });
        path("/extractPhrases", () -> {
            get("", (req, res) -> tokenizerResource.extractPhrasesGet(req.queryParams(PARAM_TEXT)));
            post("", (req, res) -> tokenizerResource.extractPhrasesGet(req.body()));
        });
    }
}
