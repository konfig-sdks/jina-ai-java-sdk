/*
 * The Jina Embedding Serving API
 * This is the UniversalAPI to access all the Jina embedding models
 *
 * The version of the OpenAPI document: 0.0.86
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.RankingOutput;
import com.konfigthis.client.model.TextRankInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RerankApi
 */
@Disabled
public class RerankApiTest {

    private static RerankApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new RerankApi(apiClient);
    }

    /**
     * Rank
     *
     * Rank pairs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pairRankingTest() throws ApiException {
        String model = null;
        Object query = null;
        List<Object> documents = null;
        Integer topN = null;
        Boolean returnDocuments = null;
        RankingOutput response = api.pairRanking(model, query, documents)
                .topN(topN)
                .returnDocuments(returnDocuments)
                .execute();
        // TODO: test validations
    }

}
