# com.finbourne.sdk.services.lusid.model.UpdateReconciliationRequest
classname UpdateReconciliationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the scheduled reconciliation | [optional] [default to String]
**description** | **String** | A description of the scheduled reconciliation | [optional] [default to String]
**isPortfolioGroup** | **Boolean** | Specifies whether reconciliation is between portfolios or portfolio groups | [optional] [default to Boolean]
**left** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**right** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactions** | [**ReconciliationTransactions**](ReconciliationTransactions.md) |  | [optional] [default to ReconciliationTransactions]
**positions** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  | [optional] [default to ReconciliationConfiguration]
**valuations** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  | [optional] [default to ReconciliationConfiguration]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Reconciliation properties | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
Boolean isPortfolioGroup = true;
ResourceId left = new ResourceId();
ResourceId right = new ResourceId();
ReconciliationTransactions transactions = new ReconciliationTransactions();
ReconciliationConfiguration positions = new ReconciliationConfiguration();
ReconciliationConfiguration valuations = new ReconciliationConfiguration();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


UpdateReconciliationRequest updateReconciliationRequestInstance = new UpdateReconciliationRequest()
    .name(name)
    .description(description)
    .isPortfolioGroup(isPortfolioGroup)
    .left(left)
    .right(right)
    .transactions(transactions)
    .positions(positions)
    .valuations(valuations)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)