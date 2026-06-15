# com.finbourne.sdk.services.horizon.model.LusidEntity
classname LusidEntity
Information about the LUSID entity this data can be used with

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The entity type | [default to String]
**entityTypeDisplayName** | **String** | The display name for the entity type. | [default to String]
**entitySubType** | **String** | The entity sub-type | [optional] [default to String]
**entitySubTypeDisplayName** | **String** | Display name for the entity sub-type | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.LusidEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
String entityTypeDisplayName = "example entityTypeDisplayName";
@javax.annotation.Nullable String entitySubType = "example entitySubType";
@javax.annotation.Nullable String entitySubTypeDisplayName = "example entitySubTypeDisplayName";


LusidEntity lusidEntityInstance = new LusidEntity()
    .entityType(entityType)
    .entityTypeDisplayName(entityTypeDisplayName)
    .entitySubType(entitySubType)
    .entitySubTypeDisplayName(entitySubTypeDisplayName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)