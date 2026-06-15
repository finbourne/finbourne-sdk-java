# com.finbourne.sdk.services.lusid.model.CreateRelationshipRequest
classname CreateRelationshipRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceEntityId** | **Map&lt;String, String&gt;** | The identifier of the source entity. | [default to Map<String, String>]
**targetEntityId** | **Map&lt;String, String&gt;** | The identifier of the target entity. | [default to Map<String, String>]
**effectiveFrom** | **String** | The effective date of the relationship to be created | [optional] [default to String]
**effectiveUntil** | **String** | The effective datetime until which the relationship is valid. If not supplied this will be valid indefinitely. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateRelationshipRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> sourceEntityId = new Map<String, String>();
Map<String, String> targetEntityId = new Map<String, String>();
@javax.annotation.Nullable String effectiveFrom = "example effectiveFrom";
@javax.annotation.Nullable String effectiveUntil = "example effectiveUntil";


CreateRelationshipRequest createRelationshipRequestInstance = new CreateRelationshipRequest()
    .sourceEntityId(sourceEntityId)
    .targetEntityId(targetEntityId)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)