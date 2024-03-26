

# RankingOutput

Output of the embedding service

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | The identifier of the model.  Available models and corresponding param size and dimension: - &#x60;jina-embedding-t-en-v1&#x60;, 14m, 312 - &#x60;jina-embedding-s-en-v1&#x60;, 35m, 512 (default) - &#x60;jina-embedding-b-en-v1&#x60;, 110m, 768 - &#x60;jina-embedding-l-en-v1&#x60;, 330, 1024  For more information, please checkout our [technical blog](https://arxiv.org/abs/2307.11224).  |  |
|**results** | **List&lt;Object&gt;** | An ordered list of ranked documents |  |
|**usage** | [**ApiSchemasRankUsage**](ApiSchemasRankUsage.md) | Total usage of the request. |  |



