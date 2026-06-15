# com.finbourne.sdk.services.access.model.AsAtPredicateContract
classname AsAtPredicateContract

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** |  | [optional] [default to String]
**dateTimeOffset** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.access.model.AsAtPredicateContract;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String value = "example value";
@javax.annotation.Nullable OffsetDateTime dateTimeOffset = OffsetDateTime.now();


AsAtPredicateContract asAtPredicateContractInstance = new AsAtPredicateContract()
    .value(value)
    .dateTimeOffset(dateTimeOffset);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)