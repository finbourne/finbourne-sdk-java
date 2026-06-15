# com.finbourne.sdk.services.identity.model.ErrorDetail
classname ErrorDetail
Provides details about an entity error that occured

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id of the entity this error relates to | [optional] [default to String]
**type** | **String** | Error type | [optional] [default to String]
**detail** | **String** | Human readable description of the error | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.ErrorDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String detail = "example detail";


ErrorDetail errorDetailInstance = new ErrorDetail()
    .id(id)
    .type(type)
    .detail(detail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)