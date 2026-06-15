# com.finbourne.sdk.services.lusid.model.OrderRuleBreach
classname OrderRuleBreach

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breachTaskId** | **String** | Uniquely identifies this historical order breach workflow task. | [default to String]
**complianceState** | **String** | The compliance state of this order breach. Available values: Pending, Failed, Passed, ManuallyApproved, PartiallyOverridden, Warning. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.OrderRuleBreach;
import java.util.*;
import java.lang.System;
import java.net.URI;

String breachTaskId = "example breachTaskId";
String complianceState = "example complianceState";


OrderRuleBreach orderRuleBreachInstance = new OrderRuleBreach()
    .breachTaskId(breachTaskId)
    .complianceState(complianceState);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)