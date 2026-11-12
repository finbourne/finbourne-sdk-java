# com.finbourne.sdk.services.lusid.model.RecResultRelationalDataItem
classname RecResultRelationalDataItem
A relational data point item within a rec result: one row of a relational dataset. The dataset and the unique  id of the data point identify the row. All rec types use this item shape. Also holds the display name of the  dataset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationalDatasetDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**relationalDatasetDefinitionDisplayName** | **String** | The display name of the relational dataset definition the item&#39;s row belongs to, as it stood at the asAt the run read its data. Null where the run did not read it. | [optional] [default to String]
**relationalDataPointUniqueId** | **String** | The unique id of the relational data point the run read, as minted by the relational dataset store. Opaque: compare it whole, do not parse it. | [default to String]
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction, SettlementActivity, RelationalDataPoint or the entity type of a LusidEntity rec. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, both transaction rec types produce Transaction items, and a relational dataset side produces RelationalDataPoint items whatever the rec type. A LusidEntity rec produces items of its entity type, for example Instrument items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding, RelationalDataPoint, Instrument, LegalEntity, Portfolio. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]
**writebackSuggestions** | [**List&lt;WritebackSuggestion&gt;**](WritebackSuggestion.md) | The writebacks suggested against this item, as configured by the matching ruleset&#39;s writebackConfigurations. Only ever populated on target-side items. Suggestions only: a user is expected to review them before acting. Required, but may be empty. | [readonly] [default to List<WritebackSuggestion>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultRelationalDataItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId relationalDatasetDefinitionId = new ResourceId();
@javax.annotation.Nullable String relationalDatasetDefinitionDisplayName = "example relationalDatasetDefinitionDisplayName";
String relationalDataPointUniqueId = "example relationalDataPointUniqueId";
String itemType = "example itemType";
@javax.annotation.Nullable Map<String, String> ruleAndAttributeValues = new Map<String, String>();
List<WritebackSuggestion> writebackSuggestions = new List<WritebackSuggestion>();


RecResultRelationalDataItem recResultRelationalDataItemInstance = new RecResultRelationalDataItem()
    .relationalDatasetDefinitionId(relationalDatasetDefinitionId)
    .relationalDatasetDefinitionDisplayName(relationalDatasetDefinitionDisplayName)
    .relationalDataPointUniqueId(relationalDataPointUniqueId)
    .itemType(itemType)
    .ruleAndAttributeValues(ruleAndAttributeValues)
    .writebackSuggestions(writebackSuggestions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)