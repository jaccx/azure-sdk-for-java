// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifies some text and analysis components used to break that text into
 * tokens.
 */
@Fluent
public final class AnalyzeRequest {
    /*
     * The text to break into tokens.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * The name of the analyzer to use to break the given text. If this
     * parameter is not specified, you must specify a tokenizer instead. The
     * tokenizer and analyzer parameters are mutually exclusive. Possible
     * values include: 'ar.microsoft', 'ar.lucene', 'hy.lucene',
     * 'bn.microsoft', 'eu.lucene', 'bg.microsoft', 'bg.lucene',
     * 'ca.microsoft', 'ca.lucene', 'zh-Hans.microsoft', 'zh-Hans.lucene',
     * 'zh-Hant.microsoft', 'zh-Hant.lucene', 'hr.microsoft', 'cs.microsoft',
     * 'cs.lucene', 'da.microsoft', 'da.lucene', 'nl.microsoft', 'nl.lucene',
     * 'en.microsoft', 'en.lucene', 'et.microsoft', 'fi.microsoft',
     * 'fi.lucene', 'fr.microsoft', 'fr.lucene', 'gl.lucene', 'de.microsoft',
     * 'de.lucene', 'el.microsoft', 'el.lucene', 'gu.microsoft',
     * 'he.microsoft', 'hi.microsoft', 'hi.lucene', 'hu.microsoft',
     * 'hu.lucene', 'is.microsoft', 'id.microsoft', 'id.lucene', 'ga.lucene',
     * 'it.microsoft', 'it.lucene', 'ja.microsoft', 'ja.lucene',
     * 'kn.microsoft', 'ko.microsoft', 'ko.lucene', 'lv.microsoft',
     * 'lv.lucene', 'lt.microsoft', 'ml.microsoft', 'ms.microsoft',
     * 'mr.microsoft', 'nb.microsoft', 'no.lucene', 'fa.lucene',
     * 'pl.microsoft', 'pl.lucene', 'pt-BR.microsoft', 'pt-BR.lucene',
     * 'pt-PT.microsoft', 'pt-PT.lucene', 'pa.microsoft', 'ro.microsoft',
     * 'ro.lucene', 'ru.microsoft', 'ru.lucene', 'sr-cyrillic.microsoft',
     * 'sr-latin.microsoft', 'sk.microsoft', 'sl.microsoft', 'es.microsoft',
     * 'es.lucene', 'sv.microsoft', 'sv.lucene', 'ta.microsoft',
     * 'te.microsoft', 'th.microsoft', 'th.lucene', 'tr.microsoft',
     * 'tr.lucene', 'uk.microsoft', 'ur.microsoft', 'vi.microsoft',
     * 'standard.lucene', 'standardasciifolding.lucene', 'keyword', 'pattern',
     * 'simple', 'stop', 'whitespace'
     */
    @JsonProperty(value = "analyzer")
    private AnalyzerName analyzer;

    /*
     * The name of the tokenizer to use to break the given text. If this
     * parameter is not specified, you must specify an analyzer instead. The
     * tokenizer and analyzer parameters are mutually exclusive. Possible
     * values include: 'Classic', 'EdgeNGram', 'Keyword', 'Letter',
     * 'Lowercase', 'MicrosoftLanguageTokenizer',
     * 'MicrosoftLanguageStemmingTokenizer', 'NGram', 'PathHierarchy',
     * 'Pattern', 'Standard', 'UaxUrlEmail', 'Whitespace'
     */
    @JsonProperty(value = "tokenizer")
    private TokenizerName tokenizer;

    /*
     * An optional list of token filters to use when breaking the given text.
     * This parameter can only be set when using the tokenizer parameter.
     */
    @JsonProperty(value = "tokenFilters")
    private List<TokenFilterName> tokenFilters;

    /*
     * An optional list of character filters to use when breaking the given
     * text. This parameter can only be set when using the tokenizer parameter.
     */
    @JsonProperty(value = "charFilters")
    private List<CharFilterName> charFilters;

    /**
     * Get the text property: The text to break into tokens.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text to break into tokens.
     *
     * @param text the text value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the analyzer property: The name of the analyzer to use to break the
     * given text. If this parameter is not specified, you must specify a
     * tokenizer instead. The tokenizer and analyzer parameters are mutually
     * exclusive. Possible values include: 'ar.microsoft', 'ar.lucene',
     * 'hy.lucene', 'bn.microsoft', 'eu.lucene', 'bg.microsoft', 'bg.lucene',
     * 'ca.microsoft', 'ca.lucene', 'zh-Hans.microsoft', 'zh-Hans.lucene',
     * 'zh-Hant.microsoft', 'zh-Hant.lucene', 'hr.microsoft', 'cs.microsoft',
     * 'cs.lucene', 'da.microsoft', 'da.lucene', 'nl.microsoft', 'nl.lucene',
     * 'en.microsoft', 'en.lucene', 'et.microsoft', 'fi.microsoft',
     * 'fi.lucene', 'fr.microsoft', 'fr.lucene', 'gl.lucene', 'de.microsoft',
     * 'de.lucene', 'el.microsoft', 'el.lucene', 'gu.microsoft',
     * 'he.microsoft', 'hi.microsoft', 'hi.lucene', 'hu.microsoft',
     * 'hu.lucene', 'is.microsoft', 'id.microsoft', 'id.lucene', 'ga.lucene',
     * 'it.microsoft', 'it.lucene', 'ja.microsoft', 'ja.lucene',
     * 'kn.microsoft', 'ko.microsoft', 'ko.lucene', 'lv.microsoft',
     * 'lv.lucene', 'lt.microsoft', 'ml.microsoft', 'ms.microsoft',
     * 'mr.microsoft', 'nb.microsoft', 'no.lucene', 'fa.lucene',
     * 'pl.microsoft', 'pl.lucene', 'pt-BR.microsoft', 'pt-BR.lucene',
     * 'pt-PT.microsoft', 'pt-PT.lucene', 'pa.microsoft', 'ro.microsoft',
     * 'ro.lucene', 'ru.microsoft', 'ru.lucene', 'sr-cyrillic.microsoft',
     * 'sr-latin.microsoft', 'sk.microsoft', 'sl.microsoft', 'es.microsoft',
     * 'es.lucene', 'sv.microsoft', 'sv.lucene', 'ta.microsoft',
     * 'te.microsoft', 'th.microsoft', 'th.lucene', 'tr.microsoft',
     * 'tr.lucene', 'uk.microsoft', 'ur.microsoft', 'vi.microsoft',
     * 'standard.lucene', 'standardasciifolding.lucene', 'keyword', 'pattern',
     * 'simple', 'stop', 'whitespace'.
     *
     * @return the analyzer value.
     */
    public AnalyzerName getAnalyzer() {
        return this.analyzer;
    }

    /**
     * Set the analyzer property: The name of the analyzer to use to break the
     * given text. If this parameter is not specified, you must specify a
     * tokenizer instead. The tokenizer and analyzer parameters are mutually
     * exclusive. Possible values include: 'ar.microsoft', 'ar.lucene',
     * 'hy.lucene', 'bn.microsoft', 'eu.lucene', 'bg.microsoft', 'bg.lucene',
     * 'ca.microsoft', 'ca.lucene', 'zh-Hans.microsoft', 'zh-Hans.lucene',
     * 'zh-Hant.microsoft', 'zh-Hant.lucene', 'hr.microsoft', 'cs.microsoft',
     * 'cs.lucene', 'da.microsoft', 'da.lucene', 'nl.microsoft', 'nl.lucene',
     * 'en.microsoft', 'en.lucene', 'et.microsoft', 'fi.microsoft',
     * 'fi.lucene', 'fr.microsoft', 'fr.lucene', 'gl.lucene', 'de.microsoft',
     * 'de.lucene', 'el.microsoft', 'el.lucene', 'gu.microsoft',
     * 'he.microsoft', 'hi.microsoft', 'hi.lucene', 'hu.microsoft',
     * 'hu.lucene', 'is.microsoft', 'id.microsoft', 'id.lucene', 'ga.lucene',
     * 'it.microsoft', 'it.lucene', 'ja.microsoft', 'ja.lucene',
     * 'kn.microsoft', 'ko.microsoft', 'ko.lucene', 'lv.microsoft',
     * 'lv.lucene', 'lt.microsoft', 'ml.microsoft', 'ms.microsoft',
     * 'mr.microsoft', 'nb.microsoft', 'no.lucene', 'fa.lucene',
     * 'pl.microsoft', 'pl.lucene', 'pt-BR.microsoft', 'pt-BR.lucene',
     * 'pt-PT.microsoft', 'pt-PT.lucene', 'pa.microsoft', 'ro.microsoft',
     * 'ro.lucene', 'ru.microsoft', 'ru.lucene', 'sr-cyrillic.microsoft',
     * 'sr-latin.microsoft', 'sk.microsoft', 'sl.microsoft', 'es.microsoft',
     * 'es.lucene', 'sv.microsoft', 'sv.lucene', 'ta.microsoft',
     * 'te.microsoft', 'th.microsoft', 'th.lucene', 'tr.microsoft',
     * 'tr.lucene', 'uk.microsoft', 'ur.microsoft', 'vi.microsoft',
     * 'standard.lucene', 'standardasciifolding.lucene', 'keyword', 'pattern',
     * 'simple', 'stop', 'whitespace'.
     *
     * @param analyzer the analyzer value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setAnalyzer(AnalyzerName analyzer) {
        this.analyzer = analyzer;
        return this;
    }

    /**
     * Get the tokenizer property: The name of the tokenizer to use to break
     * the given text. If this parameter is not specified, you must specify an
     * analyzer instead. The tokenizer and analyzer parameters are mutually
     * exclusive. Possible values include: 'Classic', 'EdgeNGram', 'Keyword',
     * 'Letter', 'Lowercase', 'MicrosoftLanguageTokenizer',
     * 'MicrosoftLanguageStemmingTokenizer', 'NGram', 'PathHierarchy',
     * 'Pattern', 'Standard', 'UaxUrlEmail', 'Whitespace'.
     *
     * @return the tokenizer value.
     */
    public TokenizerName getTokenizer() {
        return this.tokenizer;
    }

    /**
     * Set the tokenizer property: The name of the tokenizer to use to break
     * the given text. If this parameter is not specified, you must specify an
     * analyzer instead. The tokenizer and analyzer parameters are mutually
     * exclusive. Possible values include: 'Classic', 'EdgeNGram', 'Keyword',
     * 'Letter', 'Lowercase', 'MicrosoftLanguageTokenizer',
     * 'MicrosoftLanguageStemmingTokenizer', 'NGram', 'PathHierarchy',
     * 'Pattern', 'Standard', 'UaxUrlEmail', 'Whitespace'.
     *
     * @param tokenizer the tokenizer value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setTokenizer(TokenizerName tokenizer) {
        this.tokenizer = tokenizer;
        return this;
    }

    /**
     * Get the tokenFilters property: An optional list of token filters to use
     * when breaking the given text. This parameter can only be set when using
     * the tokenizer parameter.
     *
     * @return the tokenFilters value.
     */
    public List<TokenFilterName> getTokenFilters() {
        return this.tokenFilters;
    }

    /**
     * Set the tokenFilters property: An optional list of token filters to use
     * when breaking the given text. This parameter can only be set when using
     * the tokenizer parameter.
     *
     * @param tokenFilters the tokenFilters value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setTokenFilters(List<TokenFilterName> tokenFilters) {
        this.tokenFilters = tokenFilters;
        return this;
    }

    /**
     * Get the charFilters property: An optional list of character filters to
     * use when breaking the given text. This parameter can only be set when
     * using the tokenizer parameter.
     *
     * @return the charFilters value.
     */
    public List<CharFilterName> getCharFilters() {
        return this.charFilters;
    }

    /**
     * Set the charFilters property: An optional list of character filters to
     * use when breaking the given text. This parameter can only be set when
     * using the tokenizer parameter.
     *
     * @param charFilters the charFilters value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setCharFilters(List<CharFilterName> charFilters) {
        this.charFilters = charFilters;
        return this;
    }
}
