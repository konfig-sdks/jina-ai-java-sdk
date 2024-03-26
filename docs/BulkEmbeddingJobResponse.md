

# BulkEmbeddingJobResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | The user ID of the user who created the job |  |
|**modelName** | **String** | The name of the model to use |  |
|**modelPackageArn** | **String** | The model package ARN |  [optional] |
|**status** | **BulkEmbeddingJobStatus** | The status of the job |  |
|**fileName** | **String** | The name of the input file |  |
|**userEmail** | **String** | The email of the user who created the job |  [optional] |
|**createdAt** | **OffsetDateTime** | Time of creation of the job. |  [optional] |
|**completedAt** | **OffsetDateTime** | Time of completion of the job. |  [optional] |
|**error** | **String** | The error message of the job |  [optional] |
|**id** | **String** | The ID of the job |  |
|**usedTokenCount** | **Integer** | The number of tokens used for the job |  [optional] |



