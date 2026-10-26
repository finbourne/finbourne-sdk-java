# com.finbourne.sdk.services.lusid.model.LusidEntityRecDefinitionDetails
classname LusidEntityRecDefinitionDetails
A definition that reconciles one type of LUSID entity. A filter selects the population of each side, and a single  matching ruleset of that entity type drives the definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of LUSID entity to reconcile, which is also the rec type of the results. Supported types: Instrument. Must equal the reconciliationType of the matching ruleset. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity, External, Instrument. | [default to String]
**matchingRulesetId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**leftFilter** | **String** | Optional filter that selects the population of the left side, e.g. \&quot;scope eq &#39;default&#39;\&quot;. It resolves against the left side entity fields. Null reads the whole population of the side. | [optional] [default to String]
**rightFilter** | **String** | Optional filter that selects the population of the right side. It resolves against the right side entity fields. Null reads the whole population of the side. | [optional] [default to String]
**definitionType** | **String** | What this definition reconciles, and so which shape of details it carries. Available values: PortfolioContents, LusidEntity, External. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.LusidEntityRecDefinitionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
ResourceId matchingRulesetId = new ResourceId();
@javax.annotation.Nullable String leftFilter = "example leftFilter";
@javax.annotation.Nullable String rightFilter = "example rightFilter";
String definitionType = "example definitionType";


LusidEntityRecDefinitionDetails lusidEntityRecDefinitionDetailsInstance = new LusidEntityRecDefinitionDetails()
    .entityType(entityType)
    .matchingRulesetId(matchingRulesetId)
    .leftFilter(leftFilter)
    .rightFilter(rightFilter)
    .definitionType(definitionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)