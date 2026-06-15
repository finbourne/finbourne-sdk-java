# com.finbourne.sdk.services.lusid.model.ApplicableEntity
classname ApplicableEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of entity (e.g., Instrument, Portfolio) that this DataSeries applies to. | [default to String]
**entityScope** | **String** | The scope of the entity. | [optional] [default to String]
**identifierScope** | **String** | The scope of the identifier used to uniquely identify the entity. | [optional] [default to String]
**identifierType** | **String** | The type of identifier (e.g., Figi, Isin) used to uniquely identify the entity. | [optional] [default to String]
**identifierValue** | **String** | The value of the identifier used to uniquely identify the entity. | [optional] [default to String]
**subEntityId** | **String** | An optional sub-entity identifier, if applicable. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ApplicableEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
@javax.annotation.Nullable String entityScope = "example entityScope";
@javax.annotation.Nullable String identifierScope = "example identifierScope";
@javax.annotation.Nullable String identifierType = "example identifierType";
@javax.annotation.Nullable String identifierValue = "example identifierValue";
@javax.annotation.Nullable String subEntityId = "example subEntityId";


ApplicableEntity applicableEntityInstance = new ApplicableEntity()
    .entityType(entityType)
    .entityScope(entityScope)
    .identifierScope(identifierScope)
    .identifierType(identifierType)
    .identifierValue(identifierValue)
    .subEntityId(subEntityId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)