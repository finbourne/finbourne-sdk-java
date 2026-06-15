# com.finbourne.sdk.services.lusid.model.LusidEntityResult
classname LusidEntityResult
Represents LUSID entity details for a data quality check result

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp for the entity | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective-at timestamp for the entity | [optional] [default to OffsetDateTime]
**entityType** | **String** | The type of the LUSID entity | [optional] [default to String]
**scope** | **String** | The scope of the entity | [optional] [default to String]
**code** | **String** | The code of the entity. Populated for scope+code entities (e.g. Portfolio). Null for identifier-based entities (e.g. Instrument). | [optional] [default to String]
**identifierKey** | **String** | The identifier key for the entity | [optional] [default to String]
**identifierValue** | **String** | The identifier value for the entity | [optional] [default to String]
**entityUniqueId** | **String** | The unique identifier for the entity | [optional] [default to String]
**displayName** | **String** | The display name of the entity | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.LusidEntityResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAt = OffsetDateTime.now();
OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String entityType = "example entityType";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String identifierKey = "example identifierKey";
@javax.annotation.Nullable String identifierValue = "example identifierValue";
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
@javax.annotation.Nullable String displayName = "example displayName";


LusidEntityResult lusidEntityResultInstance = new LusidEntityResult()
    .asAt(asAt)
    .effectiveAt(effectiveAt)
    .entityType(entityType)
    .scope(scope)
    .code(code)
    .identifierKey(identifierKey)
    .identifierValue(identifierValue)
    .entityUniqueId(entityUniqueId)
    .displayName(displayName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)