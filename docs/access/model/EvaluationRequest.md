# com.finbourne.sdk.services.access.model.EvaluationRequest
classname EvaluationRequest
Specification for a server side evaluation of entitlement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**RequestDetails**](RequestDetails.md) |  | [default to RequestDetails]
**resource** | [**ResourceDetails**](ResourceDetails.md) |  | [default to ResourceDetails]

```java
import com.finbourne.sdk.services.access.model.EvaluationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

RequestDetails request = new RequestDetails();
ResourceDetails resource = new ResourceDetails();


EvaluationRequest evaluationRequestInstance = new EvaluationRequest()
    .request(request)
    .resource(resource);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)