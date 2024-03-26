# RerankApi

All URIs are relative to *https://api.jina.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pairRanking**](RerankApi.md#pairRanking) | **POST** /v1/rerank | Rank |


<a name="pairRanking"></a>
# **pairRanking**
> RankingOutput pairRanking(textRankInput).execute();

Rank

Rank pairs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.JinaAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RerankApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.jina.ai";
    
    // Configure HTTP bearer authorization: HTTPBearer
    configuration.token = "BEARER TOKEN";
    JinaAi client = new JinaAi(configuration);
    String model = "model_example"; // The identifier of the model.  Available models and corresponding param size and dimension: - `jina-embedding-t-en-v1`, 14m, 312 - `jina-embedding-s-en-v1`, 35m, 512 (default) - `jina-embedding-b-en-v1`, 110m, 768 - `jina-embedding-l-en-v1`, 330, 1024  For more information, please checkout our [technical blog](https://arxiv.org/abs/2307.11224). 
    Object query = null;
    List<Object> documents = Arrays.asList(null);
    Integer topN = 56; // The number of most relevant documents or indices to return, defaults to the length of `documents`
    Boolean returnDocuments = true; // If false, returns results without the doc text - the api will return a list of {index, relevance score} where index is inferred from the list passed into the request. If true, returns results with the doc text passed in - the api will return an ordered list of {index, text, relevance score} where index + text refers to the list passed into the request. Defaults to true
    try {
      RankingOutput result = client
              .rerank
              .pairRanking(model, query, documents)
              .topN(topN)
              .returnDocuments(returnDocuments)
              .execute();
      System.out.println(result);
      System.out.println(result.getModel());
      System.out.println(result.getResults());
      System.out.println(result.getUsage());
    } catch (ApiException e) {
      System.err.println("Exception when calling RerankApi#pairRanking");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RankingOutput> response = client
              .rerank
              .pairRanking(model, query, documents)
              .topN(topN)
              .returnDocuments(returnDocuments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RerankApi#pairRanking");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textRankInput** | [**TextRankInput**](TextRankInput.md)|  | |

### Return type

[**RankingOutput**](RankingOutput.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rank output |  -  |

