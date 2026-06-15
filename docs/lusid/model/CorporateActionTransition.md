# com.finbourne.sdk.services.lusid.model.CorporateActionTransition
classname CorporateActionTransition
A 'transition' within a corporate action, representing a set of output movements paired to a single input position

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputTransition** | [**CorporateActionTransitionComponent**](CorporateActionTransitionComponent.md) |  | [optional] [default to CorporateActionTransitionComponent]
**outputTransitions** | [**List&lt;CorporateActionTransitionComponent&gt;**](CorporateActionTransitionComponent.md) | What will be generated relative to the input transition | [optional] [default to List<CorporateActionTransitionComponent>]

```java
import com.finbourne.sdk.services.lusid.model.CorporateActionTransition;
import java.util.*;
import java.lang.System;
import java.net.URI;

CorporateActionTransitionComponent inputTransition = new CorporateActionTransitionComponent();
@javax.annotation.Nullable List<CorporateActionTransitionComponent> outputTransitions = new List<CorporateActionTransitionComponent>();


CorporateActionTransition corporateActionTransitionInstance = new CorporateActionTransition()
    .inputTransition(inputTransition)
    .outputTransitions(outputTransitions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)