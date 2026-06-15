# com.finbourne.sdk.services.lusid.model.ReconciliationSideConfiguration
classname ReconciliationSideConfiguration
Specification for one side of a valuations/positions scheduled reconciliation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**currency** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReconciliationSideConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String currency = "example currency";


ReconciliationSideConfiguration reconciliationSideConfigurationInstance = new ReconciliationSideConfiguration()
    .recipeId(recipeId)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)