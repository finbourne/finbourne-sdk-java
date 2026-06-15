# com.finbourne.sdk.services.identity.model.LogTransaction
classname LogTransaction
Represents a LogTransaction resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**id** | **String** |  | [optional] [default to String]
**detail** | **Map&lt;String, Object&gt;** |  | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.identity.model.LogTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable Map<String, Object> detail = new Map<String, Object>();


LogTransaction logTransactionInstance = new LogTransaction()
    .type(type)
    .id(id)
    .detail(detail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)