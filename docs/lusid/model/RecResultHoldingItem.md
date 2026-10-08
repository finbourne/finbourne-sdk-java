# com.finbourne.sdk.services.lusid.model.RecResultHoldingItem
classname RecResultHoldingItem
A holding-shaped item within a rec result: the holding a Holding or CashHolding rec reconciled  (itemType Holding), or the one a Valuation rec valued (itemType ValuedHolding).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingId** | **String** | The holding identifier, at holding level: the same id whichever granularity the holding was read at, so that items of different rec types over one holding name it alike. | [optional] [default to String]
**taxLotId** | **String** | The tax lot the item is, where the source row was a single lot: a lot of a position read by tax lot, or a cash commitment. Null for an aggregated position and for a cash balance. Opaque: compare it whole, do not parse it. | [optional] [default to String]
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction or SettlementActivity. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, and both transaction rec types produce Transaction items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]
**writebackSuggestions** | [**List&lt;WritebackSuggestion&gt;**](WritebackSuggestion.md) | The writebacks suggested against this item, as configured by the matching ruleset&#39;s writebackConfigurations. Only ever populated on target-side items. Suggestions only: a user is expected to review them before acting. Required, but may be empty. | [readonly] [default to List<WritebackSuggestion>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultHoldingItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String taxLotId = "example taxLotId";
String itemType = "example itemType";
@javax.annotation.Nullable Map<String, String> ruleAndAttributeValues = new Map<String, String>();
List<WritebackSuggestion> writebackSuggestions = new List<WritebackSuggestion>();


RecResultHoldingItem recResultHoldingItemInstance = new RecResultHoldingItem()
    .portfolioId(portfolioId)
    .holdingId(holdingId)
    .taxLotId(taxLotId)
    .itemType(itemType)
    .ruleAndAttributeValues(ruleAndAttributeValues)
    .writebackSuggestions(writebackSuggestions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)