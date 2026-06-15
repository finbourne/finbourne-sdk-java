# com.finbourne.sdk.services.access.model.AddToPolicyCollectionRequest
classname AddToPolicyCollectionRequest
Base properties to create or update a policy collection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) | The identifiers of the Policies to be added to the collection. | [optional] [default to List<PolicyId>]
**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) | The identifiers of the PolicyCollections to be added to the collection. | [optional] [default to List<PolicyCollectionId>]

```java
import com.finbourne.sdk.services.access.model.AddToPolicyCollectionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<PolicyId> policies = new List<PolicyId>();
@javax.annotation.Nullable List<PolicyCollectionId> policyCollections = new List<PolicyCollectionId>();


AddToPolicyCollectionRequest addToPolicyCollectionRequestInstance = new AddToPolicyCollectionRequest()
    .policies(policies)
    .policyCollections(policyCollections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)