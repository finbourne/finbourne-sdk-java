# com.finbourne.sdk.services.lusid.model.DeleteRelationshipRequest
classname DeleteRelationshipRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceEntityId** | **Map&lt;String, String&gt;** | The identifier of the source entity of the relationship to be deleted. | [default to Map<String, String>]
**targetEntityId** | **Map&lt;String, String&gt;** | The identifier of the target entity of the relationship to be deleted. | [default to Map<String, String>]
**effectiveFrom** | **String** | The effective date of the relationship to be deleted | [optional] [default to String]
**effectiveUntil** | **String** | The effective datetime until which the relationship will be deleted. If not supplied the deletion will be permanent. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DeleteRelationshipRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> sourceEntityId = new Map<String, String>();
Map<String, String> targetEntityId = new Map<String, String>();
@javax.annotation.Nullable String effectiveFrom = "example effectiveFrom";
@javax.annotation.Nullable String effectiveUntil = "example effectiveUntil";


DeleteRelationshipRequest deleteRelationshipRequestInstance = new DeleteRelationshipRequest()
    .sourceEntityId(sourceEntityId)
    .targetEntityId(targetEntityId)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)