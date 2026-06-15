# com.finbourne.sdk.services.lusid.model.ReconciledTransaction
classname ReconciledTransaction
Information about reconciled transactions.  At least one of Left and Right will be populated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**right** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**percentageMatch** | **java.math.BigDecimal** | How good a match this is considered to be. | [optional] [default to java.math.BigDecimal]
**mappingRuleSetResults** | **List&lt;Boolean&gt;** | The result of each individual mapping rule result.  Will only be present if both Left and Right are populated. | [optional] [default to List<Boolean>]

```java
import com.finbourne.sdk.services.lusid.model.ReconciledTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

Transaction left = new Transaction();
Transaction right = new Transaction();
java.math.BigDecimal percentageMatch = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<Boolean> mappingRuleSetResults = new List<Boolean>();


ReconciledTransaction reconciledTransactionInstance = new ReconciledTransaction()
    .left(left)
    .right(right)
    .percentageMatch(percentageMatch)
    .mappingRuleSetResults(mappingRuleSetResults);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)