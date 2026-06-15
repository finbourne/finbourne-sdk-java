# com.finbourne.sdk.services.lusid.model.CustomEntityId
classname CustomEntityId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierScope** | **String** | The scope the identifier resides in (the scope of the identifier property definition). | [default to String]
**identifierType** | **String** | What the identifier represents (the code of the identifier property definition). | [default to String]
**identifierValue** | **String** | The value of the identifier for this entity. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the identifier is valid. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the identifier is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveFrom&#39; datetime of the identifier. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CustomEntityId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String identifierScope = "example identifierScope";
String identifierType = "example identifierType";
String identifierValue = "example identifierValue";
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveUntil = OffsetDateTime.now();


CustomEntityId customEntityIdInstance = new CustomEntityId()
    .identifierScope(identifierScope)
    .identifierType(identifierType)
    .identifierValue(identifierValue)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)