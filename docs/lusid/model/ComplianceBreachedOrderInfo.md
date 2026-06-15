# com.finbourne.sdk.services.lusid.model.ComplianceBreachedOrderInfo
classname ComplianceBreachedOrderInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**listRuleResult** | [**List&lt;ComplianceRuleResult&gt;**](ComplianceRuleResult.md) | The Rule Results for a particular compliance run | [default to List<ComplianceRuleResult>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceBreachedOrderInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
List<ComplianceRuleResult> listRuleResult = new List<ComplianceRuleResult>();


ComplianceBreachedOrderInfo complianceBreachedOrderInfoInstance = new ComplianceBreachedOrderInfo()
    .orderId(orderId)
    .listRuleResult(listRuleResult);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)