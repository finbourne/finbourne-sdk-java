# com.finbourne.sdk.services.lusid.model.UpsertResultValuesDataRequest
classname UpsertResultValuesDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentId** | [**StructuredResultDataId**](StructuredResultDataId.md) |  | [default to StructuredResultDataId]
**key** | **Map&lt;String, String&gt;** | The structured unit result data key. | [optional] [default to Map<String, String>]
**dataAddress** | **String** | The address of the piece of unit result data | [optional] [default to String]
**resultValue** | [**ResultValue**](ResultValue.md) |  | [optional] [default to ResultValue]

```java
import com.finbourne.sdk.services.lusid.model.UpsertResultValuesDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

StructuredResultDataId documentId = new StructuredResultDataId();
@javax.annotation.Nullable Map<String, String> key = new Map<String, String>();
@javax.annotation.Nullable String dataAddress = "example dataAddress";
ResultValue resultValue = new ResultValue();


UpsertResultValuesDataRequest upsertResultValuesDataRequestInstance = new UpsertResultValuesDataRequest()
    .documentId(documentId)
    .key(key)
    .dataAddress(dataAddress)
    .resultValue(resultValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)