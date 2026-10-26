# com.finbourne.sdk.services.lusid.model.ExternalRecDefinitionDetails
classname ExternalRecDefinitionDetails
A definition reconciling relational data on both sides, driven by a single External matching ruleset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchingRulesetId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**leftFilter** | **String** | Optional filter over the left dataset&#39;s rows, in the dataset&#39;s own grammar, e.g. \&quot;Values[custodian] eq &#39;something&#39;\&quot;. | [optional] [default to String]
**rightFilter** | **String** | Optional filter over the right dataset&#39;s rows, in the dataset&#39;s own grammar. | [optional] [default to String]
**definitionType** | **String** | What this definition reconciles, and so which shape of details it carries. Available values: PortfolioContents, LusidEntity, External. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ExternalRecDefinitionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId matchingRulesetId = new ResourceId();
@javax.annotation.Nullable String leftFilter = "example leftFilter";
@javax.annotation.Nullable String rightFilter = "example rightFilter";
String definitionType = "example definitionType";


ExternalRecDefinitionDetails externalRecDefinitionDetailsInstance = new ExternalRecDefinitionDetails()
    .matchingRulesetId(matchingRulesetId)
    .leftFilter(leftFilter)
    .rightFilter(rightFilter)
    .definitionType(definitionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)