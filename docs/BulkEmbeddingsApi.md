# BulkEmbeddingsApi

All URIs are relative to *https://api.jina.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadResultPost**](BulkEmbeddingsApi.md#downloadResultPost) | **POST** /v1/bulk-embeddings/{job_id}/download-result | Download Result |
| [**getJob**](BulkEmbeddingsApi.md#getJob) | **GET** /v1/bulk-embeddings/{job_id} | Retrieve Job |
| [**uploadFileAndGetEmbeddings**](BulkEmbeddingsApi.md#uploadFileAndGetEmbeddings) | **POST** /v1/bulk-embeddings | Start Bulk Embedding |


<a name="downloadResultPost"></a>
# **downloadResultPost**
> DownloadResultResponse downloadResultPost(jobId).execute();

Download Result

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.JinaAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkEmbeddingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.jina.ai";
    JinaAi client = new JinaAi(configuration);
    String jobId = "jobId_example";
    try {
      DownloadResultResponse result = client
              .bulkEmbeddings
              .downloadResultPost(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDownloadUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEmbeddingsApi#downloadResultPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DownloadResultResponse> response = client
              .bulkEmbeddings
              .downloadResultPost(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEmbeddingsApi#downloadResultPost");
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
| **jobId** | **String**|  | |

### Return type

[**DownloadResultResponse**](DownloadResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download the result of a bulk embedding job |  -  |

<a name="getJob"></a>
# **getJob**
> BulkEmbeddingJobResponse getJob(jobId).execute();

Retrieve Job

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.JinaAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkEmbeddingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.jina.ai";
    JinaAi client = new JinaAi(configuration);
    String jobId = "jobId_example";
    try {
      BulkEmbeddingJobResponse result = client
              .bulkEmbeddings
              .getJob(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserId());
      System.out.println(result.getModelName());
      System.out.println(result.getModelPackageArn());
      System.out.println(result.getStatus());
      System.out.println(result.getFileName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getError());
      System.out.println(result.getId());
      System.out.println(result.getUsedTokenCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEmbeddingsApi#getJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkEmbeddingJobResponse> response = client
              .bulkEmbeddings
              .getJob(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEmbeddingsApi#getJob");
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
| **jobId** | **String**|  | |

### Return type

[**BulkEmbeddingJobResponse**](BulkEmbeddingJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get information about a bulk embedding job |  -  |

<a name="uploadFileAndGetEmbeddings"></a>
# **uploadFileAndGetEmbeddings**
> BulkEmbeddingJobResponse uploadFileAndGetEmbeddings(_file, model, bodyStartBulkEmbeddingV1BulkEmbeddingsPost).email(email).execute();

Start Bulk Embedding

Upload a file and get embeddings for each row

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.JinaAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkEmbeddingsApi;
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
    File _file = new File("/path/to/file");
    String model = "model_example";
    String email = "email_example";
    try {
      BulkEmbeddingJobResponse result = client
              .bulkEmbeddings
              .uploadFileAndGetEmbeddings(_file, model)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserId());
      System.out.println(result.getModelName());
      System.out.println(result.getModelPackageArn());
      System.out.println(result.getStatus());
      System.out.println(result.getFileName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getError());
      System.out.println(result.getId());
      System.out.println(result.getUsedTokenCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEmbeddingsApi#uploadFileAndGetEmbeddings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkEmbeddingJobResponse> response = client
              .bulkEmbeddings
              .uploadFileAndGetEmbeddings(_file, model)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkEmbeddingsApi#uploadFileAndGetEmbeddings");
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
| **_file** | **File**|  | |
| **model** | **String**|  | |
| **bodyStartBulkEmbeddingV1BulkEmbeddingsPost** | [**BodyStartBulkEmbeddingV1BulkEmbeddingsPost**](BodyStartBulkEmbeddingV1BulkEmbeddingsPost.md)|  | |
| **email** | **String**|  | [optional] |

### Return type

[**BulkEmbeddingJobResponse**](BulkEmbeddingJobResponse.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start a bulk embedding job |  -  |

