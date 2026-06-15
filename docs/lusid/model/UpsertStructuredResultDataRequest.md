# com.finbourne.sdk.services.lusid.model.UpsertStructuredResultDataRequest
classname UpsertStructuredResultDataRequest
The details of the structured unit result data item to upsert into Lusid.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**StructuredResultDataId**](StructuredResultDataId.md) |  | [default to StructuredResultDataId]
**data** | [**StructuredResultData**](StructuredResultData.md) |  | [optional] [default to StructuredResultData]

```java
import com.finbourne.sdk.services.lusid.model.UpsertStructuredResultDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

StructuredResultDataId id = new StructuredResultDataId();
StructuredResultData data = new StructuredResultData();


UpsertStructuredResultDataRequest upsertStructuredResultDataRequestInstance = new UpsertStructuredResultDataRequest()
    .id(id)
    .data(data);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)