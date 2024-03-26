

# ImageDoc

BaseDoc is the base class for all Documents. This class should be subclassed to create new Document types with a specific schema.  The schema of a Document is defined by the fields of the class.  Example: ```python from docarray import BaseDoc from docarray.typing import NdArray, ImageUrl import numpy as np   class MyDoc(BaseDoc):     embedding: NdArray[512]     image: ImageUrl   doc = MyDoc(embedding=np.zeros(512), image='https://example.com/image.jpg') ```   BaseDoc is a subclass of [pydantic.BaseModel](https://docs.pydantic.dev/usage/models/) and can be used in a similar way.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the BaseDoc. This is useful for indexing in vector stores. If not set by user, it will automatically be assigned a random value |  [optional] |
|**url** | **URI** | URL of an image file |  [optional] |
|**bytes** | **File** | Bytes representation of the Image. |  [optional] |



