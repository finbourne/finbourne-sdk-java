# com.finbourne.sdk.services.lusid.model.LusidEntityDataset
classname LusidEntityDataset
Contains the run-time parameters that are appropriate for check definitions  with datasetSchema.type = \"LusidEntity\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**scope** | **String** | The scope of the entities to check. Required for scoped entity types (Instrument, Portfolio).  Must not be provided for unscoped entity types (LegalEntity). | [optional] [default to String]
**asAtModifiedSince** | [**OffsetDateTime**](OffsetDateTime.md) | Nullable. Filters the dataset for version.asAtModified greater than or equal to this value. | [optional] [default to OffsetDateTime]
**selectorAttribute** | **String** | An attribute (field name, propertyKey or identifierKey) to use to sub-divide the dataset. | [optional] [default to String]
**selectorValue** | **String** | The value of the above attribute used to sub-divide the dataset. | [optional] [default to String]
**returnIdentifierKey** | **String** | The preferred identifier to return for entities with multiple external identifiers. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.LusidEntityDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable OffsetDateTime asAtModifiedSince = OffsetDateTime.now();
@javax.annotation.Nullable String selectorAttribute = "example selectorAttribute";
@javax.annotation.Nullable String selectorValue = "example selectorValue";
@javax.annotation.Nullable String returnIdentifierKey = "example returnIdentifierKey";


LusidEntityDataset lusidEntityDatasetInstance = new LusidEntityDataset()
    .asAt(asAt)
    .effectiveAt(effectiveAt)
    .scope(scope)
    .asAtModifiedSince(asAtModifiedSince)
    .selectorAttribute(selectorAttribute)
    .selectorValue(selectorValue)
    .returnIdentifierKey(returnIdentifierKey);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)