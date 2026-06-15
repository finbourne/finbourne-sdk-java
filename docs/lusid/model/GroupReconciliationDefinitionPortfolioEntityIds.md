# com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinitionPortfolioEntityIds
classname GroupReconciliationDefinitionPortfolioEntityIds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | Portfolio Entity Id of the left side of a reconciliation | [default to List<PortfolioEntityId>]
**right** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | Portfolio Entity Id of the right side of a reconciliation | [default to List<PortfolioEntityId>]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinitionPortfolioEntityIds;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PortfolioEntityId> left = new List<PortfolioEntityId>();
List<PortfolioEntityId> right = new List<PortfolioEntityId>();


GroupReconciliationDefinitionPortfolioEntityIds groupReconciliationDefinitionPortfolioEntityIdsInstance = new GroupReconciliationDefinitionPortfolioEntityIds()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)