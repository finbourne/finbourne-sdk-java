# com.finbourne.sdk.services.lusid.model.RecDefRuleset
classname RecDefRuleset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recType** | **String** | The type of reconciliation this entry configures. Must be valid for the definitionType, and must match the reconciliationType of the referenced matching ruleset. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**matchingRulesetId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**relationalDataFilter** | **String** | Selects the slice of the relational dataset this definition draws from, e.g. \&quot;custodian eq &#39;NT&#39;\&quot;. Only permitted when the referenced ruleset declares a relational side, and combined with AND at run time with that ruleset&#39;s own filter for the side. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecDefRuleset;
import java.util.*;
import java.lang.System;
import java.net.URI;

String recType = "example recType";
ResourceId matchingRulesetId = new ResourceId();
@javax.annotation.Nullable String relationalDataFilter = "example relationalDataFilter";


RecDefRuleset recDefRulesetInstance = new RecDefRuleset()
    .recType(recType)
    .matchingRulesetId(matchingRulesetId)
    .relationalDataFilter(relationalDataFilter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)