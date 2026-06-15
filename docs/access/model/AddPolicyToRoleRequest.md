# com.finbourne.sdk.services.access.model.AddPolicyToRoleRequest
classname AddPolicyToRoleRequest
Request body used to add Policies to a Role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) | Identifiers of policies to add to a role | [default to List<PolicyId>]

```java
import com.finbourne.sdk.services.access.model.AddPolicyToRoleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PolicyId> policies = new List<PolicyId>();


AddPolicyToRoleRequest addPolicyToRoleRequestInstance = new AddPolicyToRoleRequest()
    .policies(policies);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)