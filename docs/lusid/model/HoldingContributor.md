# com.finbourne.sdk.services.lusid.model.HoldingContributor
classname HoldingContributor
A list of transactions contributed to a holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction** | [**Transaction**](Transaction.md) |  | [default to Transaction]
**holdingId** | **Long** | The unique holding identifier | [optional] [default to Long]
**movements** | [**List&lt;MovementSettlementSummary&gt;**](MovementSettlementSummary.md) | Movements contributed to holding | [optional] [default to List<MovementSettlementSummary>]

```java
import com.finbourne.sdk.services.lusid.model.HoldingContributor;
import java.util.*;
import java.lang.System;
import java.net.URI;

Transaction transaction = new Transaction();
@javax.annotation.Nullable Long holdingId = new Long("100.00");
@javax.annotation.Nullable List<MovementSettlementSummary> movements = new List<MovementSettlementSummary>();


HoldingContributor holdingContributorInstance = new HoldingContributor()
    .transaction(transaction)
    .holdingId(holdingId)
    .movements(movements);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)