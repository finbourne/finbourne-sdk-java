# com.finbourne.sdk.services.lusid.model.TransactionType
classname TransactionType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List&lt;TransactionTypeAlias&gt;**](TransactionTypeAlias.md) | List of transaction types that map to this specific transaction configuration | [default to List<TransactionTypeAlias>]
**movements** | [**List&lt;TransactionTypeMovement&gt;**](TransactionTypeMovement.md) | Movement data for the transaction type | [default to List<TransactionTypeMovement>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties attached to the transaction type | [optional] [default to Map<String, PerpetualProperty>]
**calculations** | [**List&lt;TransactionTypeCalculation&gt;**](TransactionTypeCalculation.md) | Calculations to be performed for the transaction type | [optional] [default to List<TransactionTypeCalculation>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionType;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionTypeAlias> aliases = new List<TransactionTypeAlias>();
List<TransactionTypeMovement> movements = new List<TransactionTypeMovement>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable List<TransactionTypeCalculation> calculations = new List<TransactionTypeCalculation>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TransactionType transactionTypeInstance = new TransactionType()
    .aliases(aliases)
    .movements(movements)
    .properties(properties)
    .calculations(calculations)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)