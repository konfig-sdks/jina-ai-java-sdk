# MultiEmbeddingsApi

All URIs are relative to *https://api.jina.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateEmbeddings**](MultiEmbeddingsApi.md#generateEmbeddings) | **POST** /v1/multi-embeddings | Create Multi Embeddings |


<a name="generateEmbeddings"></a>
# **generateEmbeddings**
> ColbertModelEmbeddingsOutput generateEmbeddings(apiSchemasMultiEmbeddingsTextEmbeddingInput).execute();

Create Multi Embeddings

Create embedding representations of the given input texts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.JinaAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MultiEmbeddingsApi;
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
    Object input = null;
    String inputType = "query"; // Type of the embedding to compute, query or document
    String encodingFormat = "float"; // The format in which you want the embeddings to be returned.Possible value are `float` and `base64`. Defaults to `float`
    try {
      ColbertModelEmbeddingsOutput result = client
              .multiEmbeddings
              .generateEmbeddings(model, input)
              .inputType(inputType)
              .encodingFormat(encodingFormat)
              .execute();
      System.out.println(result);
      System.out.println(result.getModel());
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getUsage());
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiEmbeddingsApi#generateEmbeddings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ColbertModelEmbeddingsOutput> response = client
              .multiEmbeddings
              .generateEmbeddings(model, input)
              .inputType(inputType)
              .encodingFormat(encodingFormat)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiEmbeddingsApi#generateEmbeddings");
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
| **apiSchemasMultiEmbeddingsTextEmbeddingInput** | [**ApiSchemasMultiEmbeddingsTextEmbeddingInput**](ApiSchemasMultiEmbeddingsTextEmbeddingInput.md)|  | |

### Return type

[**ColbertModelEmbeddingsOutput**](ColbertModelEmbeddingsOutput.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create embeddings |  -  |

