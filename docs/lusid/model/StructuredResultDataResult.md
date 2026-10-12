# com.finbourne.sdk.services.lusid.model.StructuredResultDataResult
classname StructuredResultDataResult
Represents structured result data document and row details for a data quality check result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity, e.g. \&quot;SrsRow\&quot;. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp the document was read at | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective-at timestamp the document was read at | [optional] [default to OffsetDateTime]
**documentEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the upload the row was read from: the latest upload at or before effectiveAt | [optional] [default to OffsetDateTime]
**scope** | **String** | The scope of the document | [optional] [default to String]
**code** | **String** | The code of the document | [optional] [default to String]
**source** | **String** | The platform or vendor that provided the document | [optional] [default to String]
**resultType** | **String** | The document&#39;s result type | [optional] [default to String]
**rowIdentifiers** | **Map&lt;String, String&gt;** | The row&#39;s identifier columns, keyed by address key. Populated when entityType is \&quot;SrsRow\&quot;. | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.StructuredResultDataResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String entityType = "example entityType";
OffsetDateTime asAt = OffsetDateTime.now();
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime documentEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String source = "example source";
@javax.annotation.Nullable String resultType = "example resultType";
@javax.annotation.Nullable Map<String, String> rowIdentifiers = new Map<String, String>();


StructuredResultDataResult structuredResultDataResultInstance = new StructuredResultDataResult()
    .entityType(entityType)
    .asAt(asAt)
    .effectiveAt(effectiveAt)
    .documentEffectiveAt(documentEffectiveAt)
    .scope(scope)
    .code(code)
    .source(source)
    .resultType(resultType)
    .rowIdentifiers(rowIdentifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)