

# ImageEmbeddingInput

The input to the API for text embedding. OpenAI compatible

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | The identifier of the model.  Available models and corresponding param size and dimension: - &#x60;jina-embedding-t-en-v1&#x60;, 14m, 312 - &#x60;jina-embedding-s-en-v1&#x60;, 35m, 512 (default) - &#x60;jina-embedding-b-en-v1&#x60;, 110m, 768 - &#x60;jina-embedding-l-en-v1&#x60;, 330, 1024  For more information, please checkout our [technical blog](https://arxiv.org/abs/2307.11224).  |  |
|**input** | **Object** |  |  |
|**encodingFormat** | [**EncodingFormatEnum**](#EncodingFormatEnum) | The format in which you want the embeddings to be returned.Possible value are &#x60;float&#x60; and &#x60;base64&#x60;. Defaults to &#x60;float&#x60; |  [optional] |



## Enum: EncodingFormatEnum

| Name | Value |
|---- | -----|
| FLOAT | &quot;float&quot; |
| BASE64 | &quot;base64&quot; |



