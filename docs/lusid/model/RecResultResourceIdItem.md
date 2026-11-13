# com.finbourne.sdk.services.lusid.model.RecResultResourceIdItem
classname RecResultResourceIdItem
An item within a rec result for one LUSID entity that a scope and a code identify: one entity on a side of a  LusidEntity rec. The itemType is the entity type. The entity unique id identifies it. The item also holds the  display name of the entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**entityUniqueId** | **String** | The unique id of the entity the run read. It identifies the entity across scopes. | [default to String]
**entityDisplayName** | **String** | The display name of the entity, as it stood at the dates the run read its side. | [optional] [default to String]
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction, SettlementActivity, RelationalDataPoint or the entity type of a LusidEntity rec. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, both transaction rec types produce Transaction items, and a relational dataset side produces RelationalDataPoint items whatever the rec type. A LusidEntity rec produces items of its entity type, for example Instrument items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding, RelationalDataPoint, Instrument, LegalEntity, Portfolio, CustomEntity. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]
**writebackSuggestions** | [**List&lt;WritebackSuggestion&gt;**](WritebackSuggestion.md) | The writebacks suggested against this item, as configured by the matching ruleset&#39;s writebackConfigurations. Only ever populated on target-side items. Suggestions only: a user is expected to review them before acting. Required, but may be empty. | [readonly] [default to List<WritebackSuggestion>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultResourceIdItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String entityUniqueId = "example entityUniqueId";
@javax.annotation.Nullable String entityDisplayName = "example entityDisplayName";
String itemType = "example itemType";
@javax.annotation.Nullable Map<String, String> ruleAndAttributeValues = new Map<String, String>();
List<WritebackSuggestion> writebackSuggestions = new List<WritebackSuggestion>();


RecResultResourceIdItem recResultResourceIdItemInstance = new RecResultResourceIdItem()
    .id(id)
    .entityUniqueId(entityUniqueId)
    .entityDisplayName(entityDisplayName)
    .itemType(itemType)
    .ruleAndAttributeValues(ruleAndAttributeValues)
    .writebackSuggestions(writebackSuggestions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)