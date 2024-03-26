<div align="center">

[![Visit Jina ai](./header.png)](https://jina.ai)

# [Jina ai](https://jina.ai)

This is the UniversalAPI to access all the Jina embedding models

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Jina%20AI&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>jina-ai-java-sdk</artifactId>
  <version>0.0.86</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:jina-ai-java-sdk:0.0.86"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/jina-ai-java-sdk-0.0.86.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.jina.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BulkEmbeddingsApi* | [**downloadResultPost**](docs/BulkEmbeddingsApi.md#downloadResultPost) | **POST** /v1/bulk-embeddings/{job_id}/download-result | Download Result
*BulkEmbeddingsApi* | [**getJob**](docs/BulkEmbeddingsApi.md#getJob) | **GET** /v1/bulk-embeddings/{job_id} | Retrieve Job
*BulkEmbeddingsApi* | [**uploadFileAndGetEmbeddings**](docs/BulkEmbeddingsApi.md#uploadFileAndGetEmbeddings) | **POST** /v1/bulk-embeddings | Start Bulk Embedding
*EmbeddingsApi* | [**createRepresentation**](docs/EmbeddingsApi.md#createRepresentation) | **POST** /v1/embeddings | Create Embedding
*HealthApi* | [**checkStatus**](docs/HealthApi.md#checkStatus) | **GET** / | Get the health of Universal API service
*MultiEmbeddingsApi* | [**generateEmbeddings**](docs/MultiEmbeddingsApi.md#generateEmbeddings) | **POST** /v1/multi-embeddings | Create Multi Embeddings
*RerankApi* | [**pairRanking**](docs/RerankApi.md#pairRanking) | **POST** /v1/rerank | Rank


## Documentation for Models

 - [ApiSchemasEmbeddingTextDoc](docs/ApiSchemasEmbeddingTextDoc.md)
 - [ApiSchemasEmbeddingTextEmbeddingInput](docs/ApiSchemasEmbeddingTextEmbeddingInput.md)
 - [ApiSchemasEmbeddingUsage](docs/ApiSchemasEmbeddingUsage.md)
 - [ApiSchemasMultiEmbeddingsTextEmbeddingInput](docs/ApiSchemasMultiEmbeddingsTextEmbeddingInput.md)
 - [ApiSchemasRankTextDoc](docs/ApiSchemasRankTextDoc.md)
 - [ApiSchemasRankUsage](docs/ApiSchemasRankUsage.md)
 - [BodyStartBulkEmbeddingV1BulkEmbeddingsPost](docs/BodyStartBulkEmbeddingV1BulkEmbeddingsPost.md)
 - [BulkEmbeddingJobResponse](docs/BulkEmbeddingJobResponse.md)
 - [BulkEmbeddingJobStatus](docs/BulkEmbeddingJobStatus.md)
 - [ColbertModelEmbeddingsOutput](docs/ColbertModelEmbeddingsOutput.md)
 - [DownloadResultResponse](docs/DownloadResultResponse.md)
 - [ImageDoc](docs/ImageDoc.md)
 - [ImageEmbeddingInput](docs/ImageEmbeddingInput.md)
 - [ModelEmbeddingOutput](docs/ModelEmbeddingOutput.md)
 - [RankingOutput](docs/RankingOutput.md)
 - [TIEmbeddingInput](docs/TIEmbeddingInput.md)
 - [TextRankInput](docs/TextRankInput.md)
 - [ValidationError](docs/ValidationError.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
