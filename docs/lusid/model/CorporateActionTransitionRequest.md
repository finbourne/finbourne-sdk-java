# com.finbourne.sdk.services.lusid.model.CorporateActionTransitionRequest
classname CorporateActionTransitionRequest
A 'transition' within a corporate action, representing a set of output movements paired to a single input position

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputTransition** | [**CorporateActionTransitionComponentRequest**](CorporateActionTransitionComponentRequest.md) |  | [optional] [default to CorporateActionTransitionComponentRequest]
**outputTransitions** | [**List&lt;CorporateActionTransitionComponentRequest&gt;**](CorporateActionTransitionComponentRequest.md) |  | [optional] [default to List<CorporateActionTransitionComponentRequest>]

```java
import com.finbourne.sdk.services.lusid.model.CorporateActionTransitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CorporateActionTransitionComponentRequest inputTransition = new CorporateActionTransitionComponentRequest();
@javax.annotation.Nullable List<CorporateActionTransitionComponentRequest> outputTransitions = new List<CorporateActionTransitionComponentRequest>();


CorporateActionTransitionRequest corporateActionTransitionRequestInstance = new CorporateActionTransitionRequest()
    .inputTransition(inputTransition)
    .outputTransitions(outputTransitions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)