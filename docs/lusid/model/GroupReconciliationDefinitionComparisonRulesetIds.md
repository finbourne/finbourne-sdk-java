# com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinitionComparisonRulesetIds
classname GroupReconciliationDefinitionComparisonRulesetIds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionReconciliation** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**holdingReconciliation** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**valuationReconciliation** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**cashHoldingReconciliation** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinitionComparisonRulesetIds;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId transactionReconciliation = new ResourceId();
ResourceId holdingReconciliation = new ResourceId();
ResourceId valuationReconciliation = new ResourceId();
ResourceId cashHoldingReconciliation = new ResourceId();


GroupReconciliationDefinitionComparisonRulesetIds groupReconciliationDefinitionComparisonRulesetIdsInstance = new GroupReconciliationDefinitionComparisonRulesetIds()
    .transactionReconciliation(transactionReconciliation)
    .holdingReconciliation(holdingReconciliation)
    .valuationReconciliation(valuationReconciliation)
    .cashHoldingReconciliation(cashHoldingReconciliation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)