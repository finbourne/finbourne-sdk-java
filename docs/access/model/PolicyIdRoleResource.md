# com.finbourne.sdk.services.access.model.PolicyIdRoleResource
classname PolicyIdRoleResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) |  | [optional] [default to List<PolicyId>]
**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) |  | [optional] [default to List<PolicyCollectionId>]

```java
import com.finbourne.sdk.services.access.model.PolicyIdRoleResource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<PolicyId> policies = new List<PolicyId>();
@javax.annotation.Nullable List<PolicyCollectionId> policyCollections = new List<PolicyCollectionId>();


PolicyIdRoleResource policyIdRoleResourceInstance = new PolicyIdRoleResource()
    .policies(policies)
    .policyCollections(policyCollections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)