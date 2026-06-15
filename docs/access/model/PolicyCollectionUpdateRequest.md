# com.finbourne.sdk.services.access.model.PolicyCollectionUpdateRequest
classname PolicyCollectionUpdateRequest
Update an existing PolicyCollection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) | The identifiers of the Policies in this collection | [optional] [default to List<PolicyId>]
**metadata** | [**Map&lt;String, List&lt;EntitlementMetadata&gt;&gt;**](List.md) | Any relevant metadata associated with this resource for controlling access to this resource | [optional] [default to Map<String, List<EntitlementMetadata>>]
**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) | The identifiers of the PolicyCollections in this collection | [optional] [default to List<PolicyCollectionId>]
**description** | **String** | A description of this policy collection | [optional] [default to String]

```java
import com.finbourne.sdk.services.access.model.PolicyCollectionUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<PolicyId> policies = new List<PolicyId>();
@javax.annotation.Nullable Map<String, List<EntitlementMetadata>> metadata = new Map<String, List<EntitlementMetadata>>();
@javax.annotation.Nullable List<PolicyCollectionId> policyCollections = new List<PolicyCollectionId>();
@javax.annotation.Nullable String description = "example description";


PolicyCollectionUpdateRequest policyCollectionUpdateRequestInstance = new PolicyCollectionUpdateRequest()
    .policies(policies)
    .metadata(metadata)
    .policyCollections(policyCollections)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)