# com.finbourne.sdk.services.lusid.model.UpdateRecDefinitionRequest
classname UpdateRecDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the rec definition. | [default to String]
**description** | **String** | A description of the rec definition. | [optional] [default to String]
**definitionType** | **String** | What this definition reconciles, naming the kind of dataset that must be present on at least one side. One of: PortfolioContents, LusidEntity, RelationalData. Only PortfolioContents is currently supported. Available values: PortfolioContents, LusidEntity, RelationalData. | [default to String]
**sideNames** | [**RecDefSideNames**](RecDefSideNames.md) |  | [optional] [default to RecDefSideNames]
**leftPortfolioSources** | [**List&lt;RecDefSource&gt;**](RecDefSource.md) | The portfolios, portfolio groups and funds contributing to the left side. Empty when the left side draws on relational data instead, which requires every ruleset to declare relational data for that side. Both sides cannot be empty. | [optional] [default to List<RecDefSource>]
**rightPortfolioSources** | [**List&lt;RecDefSource&gt;**](RecDefSource.md) | The portfolios, portfolio groups and funds contributing to the right side. Empty when the right side draws on relational data instead, which requires every ruleset to declare relational data for that side. Both sides cannot be empty. | [optional] [default to List<RecDefSource>]
**valuationRecipes** | [**RecDefRecipeIds**](RecDefRecipeIds.md) |  | [optional] [default to RecDefRecipeIds]
**currencies** | [**RecDefCurrencies**](RecDefCurrencies.md) |  | [optional] [default to RecDefCurrencies]
**rulesets** | [**List&lt;RecDefRuleset&gt;**](RecDefRuleset.md) | The types of reconciliation included in the group, each naming the matching ruleset that drives it. At least one entry is required, and each rec type may appear at most once. | [default to List<RecDefRuleset>]
**reviewConfiguration** | [**RecReviewConfiguration**](RecReviewConfiguration.md) |  | [optional] [default to RecReviewConfiguration]
**datePolicy** | [**RecDatePolicy**](RecDatePolicy.md) |  | [optional] [default to RecDatePolicy]

```java
import com.finbourne.sdk.services.lusid.model.UpdateRecDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String definitionType = "example definitionType";
RecDefSideNames sideNames = new RecDefSideNames();
@javax.annotation.Nullable List<RecDefSource> leftPortfolioSources = new List<RecDefSource>();
@javax.annotation.Nullable List<RecDefSource> rightPortfolioSources = new List<RecDefSource>();
RecDefRecipeIds valuationRecipes = new RecDefRecipeIds();
RecDefCurrencies currencies = new RecDefCurrencies();
List<RecDefRuleset> rulesets = new List<RecDefRuleset>();
RecReviewConfiguration reviewConfiguration = new RecReviewConfiguration();
RecDatePolicy datePolicy = new RecDatePolicy();


UpdateRecDefinitionRequest updateRecDefinitionRequestInstance = new UpdateRecDefinitionRequest()
    .displayName(displayName)
    .description(description)
    .definitionType(definitionType)
    .sideNames(sideNames)
    .leftPortfolioSources(leftPortfolioSources)
    .rightPortfolioSources(rightPortfolioSources)
    .valuationRecipes(valuationRecipes)
    .currencies(currencies)
    .rulesets(rulesets)
    .reviewConfiguration(reviewConfiguration)
    .datePolicy(datePolicy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)