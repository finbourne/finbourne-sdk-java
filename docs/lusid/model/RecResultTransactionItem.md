# com.finbourne.sdk.services.lusid.model.RecResultTransactionItem
classname RecResultTransactionItem
A transaction item within a rec result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**transactionId** | **String** | The transaction identifier. | [optional] [default to String]
**holdingImpacts** | [**List&lt;RecResultHoldingImpact&gt;**](RecResultHoldingImpact.md) | The holdings, and where the source states them the tax lots, the item impacted. A distinct set ordered by holdingId then taxLotId; may be empty. An input transaction has not run the movements engine and impacts nothing yet. | [default to List<RecResultHoldingImpact>]
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction or SettlementActivity. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, and both transaction rec types produce Transaction items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultTransactionItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String transactionId = "example transactionId";
List<RecResultHoldingImpact> holdingImpacts = new List<RecResultHoldingImpact>();
String itemType = "example itemType";
@javax.annotation.Nullable Map<String, String> ruleAndAttributeValues = new Map<String, String>();


RecResultTransactionItem recResultTransactionItemInstance = new RecResultTransactionItem()
    .portfolioId(portfolioId)
    .transactionId(transactionId)
    .holdingImpacts(holdingImpacts)
    .itemType(itemType)
    .ruleAndAttributeValues(ruleAndAttributeValues);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)