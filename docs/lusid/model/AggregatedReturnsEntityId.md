# com.finbourne.sdk.services.lusid.model.AggregatedReturnsEntityId
classname AggregatedReturnsEntityId
Identifies an entity whose aggregated (time-weighted) returns are calculated: its scope, code and  type. Mirrors the valuation endpoint's entity identifier. Currently, supports only the  `Portfolio` entity type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]
**entityType** | **String** | Available values: Portfolio. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AggregatedReturnsEntityId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String entityType = "example entityType";


AggregatedReturnsEntityId aggregatedReturnsEntityIdInstance = new AggregatedReturnsEntityId()
    .scope(scope)
    .code(code)
    .entityType(entityType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)