# com.finbourne.sdk.services.lusid.model.StagedModificationSourceEntity
classname StagedModificationSourceEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the source entity. | [optional] [default to String]
**scope** | **String** | The scope of the source entity. | [optional] [default to String]
**entityUniqueId** | **String** | The unique Id of the source entity. | [optional] [default to String]
**displayName** | **String** | The display name of the source entity. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.StagedModificationSourceEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String entityType = "example entityType";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
@javax.annotation.Nullable String displayName = "example displayName";


StagedModificationSourceEntity stagedModificationSourceEntityInstance = new StagedModificationSourceEntity()
    .entityType(entityType)
    .scope(scope)
    .entityUniqueId(entityUniqueId)
    .displayName(displayName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)