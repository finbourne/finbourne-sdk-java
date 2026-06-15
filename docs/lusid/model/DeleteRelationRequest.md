# com.finbourne.sdk.services.lusid.model.DeleteRelationRequest
classname DeleteRelationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceEntityId** | **Map&lt;String, String&gt;** | The identifier of the source entity of the relation to be deleted. | [default to Map<String, String>]
**targetEntityId** | **Map&lt;String, String&gt;** | The identifier of the target entity of the relation to be deleted. | [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.DeleteRelationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> sourceEntityId = new Map<String, String>();
Map<String, String> targetEntityId = new Map<String, String>();


DeleteRelationRequest deleteRelationRequestInstance = new DeleteRelationRequest()
    .sourceEntityId(sourceEntityId)
    .targetEntityId(targetEntityId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)