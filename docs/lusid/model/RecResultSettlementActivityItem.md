# com.finbourne.sdk.services.lusid.model.RecResultSettlementActivityItem
classname RecResultSettlementActivityItem
A settlement-activity item within a rec result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**activityId** | **String** | The settlement activity identifier. | [optional] [default to String]
**transactionId** | **String** | The transaction identifier. | [optional] [default to String]
**settlementInstructionId** | **String** | The settlement instruction identifier. | [optional] [default to String]
**holdingImpacts** | [**List&lt;RecResultHoldingImpact&gt;**](RecResultHoldingImpact.md) | The holdings, and where the source states them the tax lots, the item impacted. A distinct set ordered by holdingId then taxLotId; may be empty. An input transaction has not run the movements engine and impacts nothing yet. | [default to List<RecResultHoldingImpact>]
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction or SettlementActivity. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, and both transaction rec types produce Transaction items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]
**writebackSuggestions** | [**List&lt;WritebackSuggestion&gt;**](WritebackSuggestion.md) | The writebacks suggested against this item, as configured by the matching ruleset&#39;s writebackConfigurations. Only ever populated on target-side items. Suggestions only: a user is expected to review them before acting. Required, but may be empty. | [readonly] [default to List<WritebackSuggestion>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultSettlementActivityItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String activityId = "example activityId";
@javax.annotation.Nullable String transactionId = "example transactionId";
@javax.annotation.Nullable String settlementInstructionId = "example settlementInstructionId";
List<RecResultHoldingImpact> holdingImpacts = new List<RecResultHoldingImpact>();
String itemType = "example itemType";
@javax.annotation.Nullable Map<String, String> ruleAndAttributeValues = new Map<String, String>();
List<WritebackSuggestion> writebackSuggestions = new List<WritebackSuggestion>();


RecResultSettlementActivityItem recResultSettlementActivityItemInstance = new RecResultSettlementActivityItem()
    .portfolioId(portfolioId)
    .activityId(activityId)
    .transactionId(transactionId)
    .settlementInstructionId(settlementInstructionId)
    .holdingImpacts(holdingImpacts)
    .itemType(itemType)
    .ruleAndAttributeValues(ruleAndAttributeValues)
    .writebackSuggestions(writebackSuggestions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)