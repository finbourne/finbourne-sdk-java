# com.finbourne.sdk.services.lusid.model.RecResultItem
classname RecResultItem
An individual item that makes up (one side of) a rec result. Polymorphic by rec type / item type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemType** | **String** | The polymorphic item-type discriminator (e.g. SettlementActivity, Holding, Transaction). Available values: SettlementActivity, Holding, Transaction. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [readonly] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String itemType = "example itemType";
@javax.annotation.Nullable Map<String, String> ruleAndAttributeValues = new Map<String, String>();


RecResultItem recResultItemInstance = new RecResultItem()
    .itemType(itemType)
    .ruleAndAttributeValues(ruleAndAttributeValues);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)