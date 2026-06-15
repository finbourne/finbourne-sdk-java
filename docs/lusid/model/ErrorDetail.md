# com.finbourne.sdk.services.lusid.model.ErrorDetail
classname ErrorDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the failed item that this error relates to. | [optional] [default to String]
**type** | **String** | The type of failure that occurred. | [optional] [default to String]
**detail** | **String** | Description of the failure that occurred. | [optional] [default to String]
**errorDetails** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) | Information about the particular instance of the failure (supplied information depends on the type of failure). | [optional] [default to List<Map<String, String>>]

```java
import com.finbourne.sdk.services.lusid.model.ErrorDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String detail = "example detail";
@javax.annotation.Nullable List<Map<String, String>> errorDetails = new List<Map<String, String>>();


ErrorDetail errorDetailInstance = new ErrorDetail()
    .id(id)
    .type(type)
    .detail(detail)
    .errorDetails(errorDetails);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)