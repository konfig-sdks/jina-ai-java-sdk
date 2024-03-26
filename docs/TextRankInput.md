

# TextRankInput

The input to the API for text embedding. OpenAI compatible

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | The identifier of the model.  Available models and corresponding param size and dimension: - &#x60;jina-embedding-t-en-v1&#x60;, 14m, 312 - &#x60;jina-embedding-s-en-v1&#x60;, 35m, 512 (default) - &#x60;jina-embedding-b-en-v1&#x60;, 110m, 768 - &#x60;jina-embedding-l-en-v1&#x60;, 330, 1024  For more information, please checkout our [technical blog](https://arxiv.org/abs/2307.11224).  |  |
|**query** | **Object** |  |  |
|**documents** | **List&lt;Object&gt;** |  |  |
|**topN** | **Integer** | The number of most relevant documents or indices to return, defaults to the length of &#x60;documents&#x60; |  [optional] |
|**returnDocuments** | **Boolean** | If false, returns results without the doc text - the api will return a list of {index, relevance score} where index is inferred from the list passed into the request. If true, returns results with the doc text passed in - the api will return an ordered list of {index, text, relevance score} where index + text refers to the list passed into the request. Defaults to true |  [optional] |



