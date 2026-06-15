# com.finbourne.sdk.services.access.model.PolicyCollectionResponse
classname PolicyCollectionResponse
A PolicyCollection encapsulating one or more Policies and PolicyCollections

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**PolicyCollectionId**](PolicyCollectionId.md) |  | [optional] [default to PolicyCollectionId]
**policies** | [**List&lt;PolicyId&gt;**](PolicyId.md) | The identifiers of the Policies in this collection | [optional] [default to List<PolicyId>]
**policyCollections** | [**List&lt;PolicyCollectionId&gt;**](PolicyCollectionId.md) | The identifiers of the PolicyCollections in this collection | [optional] [default to List<PolicyCollectionId>]
**description** | **String** | A description of this policy collection | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.access.model.PolicyCollectionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

PolicyCollectionId id = new PolicyCollectionId();
@javax.annotation.Nullable List<PolicyId> policies = new List<PolicyId>();
@javax.annotation.Nullable List<PolicyCollectionId> policyCollections = new List<PolicyCollectionId>();
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<Link> links = new List<Link>();


PolicyCollectionResponse policyCollectionResponseInstance = new PolicyCollectionResponse()
    .id(id)
    .policies(policies)
    .policyCollections(policyCollections)
    .description(description)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)