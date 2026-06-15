# com.finbourne.sdk.services.access.model.AddPolicyCollectionToRoleRequest
classname AddPolicyCollectionToRoleRequest
Request body used to add Policy Collections to a Role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) | Identifiers of policy collections to add to a role | [default to List<PolicyCollectionId>]

```java
import com.finbourne.sdk.services.access.model.AddPolicyCollectionToRoleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PolicyCollectionId> policyCollections = new List<PolicyCollectionId>();


AddPolicyCollectionToRoleRequest addPolicyCollectionToRoleRequestInstance = new AddPolicyCollectionToRoleRequest()
    .policyCollections(policyCollections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)