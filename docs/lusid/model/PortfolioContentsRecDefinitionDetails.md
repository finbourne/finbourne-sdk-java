# com.finbourne.sdk.services.lusid.model.PortfolioContentsRecDefinitionDetails
classname PortfolioContentsRecDefinitionDetails
A definition reconciling the contents of LUSID portfolios on at least one side, with a relational dataset  permitted on the other.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftPortfolioSources** | [**List&lt;RecDefSource&gt;**](RecDefSource.md) | The portfolios, portfolio groups and funds contributing to the left side. Empty when the left side draws on relational data instead, which requires every ruleset to declare relational data for that side. Both sides cannot be empty. | [default to List<RecDefSource>]
**rightPortfolioSources** | [**List&lt;RecDefSource&gt;**](RecDefSource.md) | The portfolios, portfolio groups and funds contributing to the right side. Empty when the right side draws on relational data instead, which requires every ruleset to declare relational data for that side. Both sides cannot be empty. | [default to List<RecDefSource>]
**valuationRecipes** | [**RecDefRecipeIds**](RecDefRecipeIds.md) |  | [optional] [default to RecDefRecipeIds]
**currencies** | [**RecDefCurrencies**](RecDefCurrencies.md) |  | [optional] [default to RecDefCurrencies]
**rulesets** | [**List&lt;RecDefRuleset&gt;**](RecDefRuleset.md) | The types of reconciliation included in the group, each naming the matching ruleset that drives it. At least one entry is required, and each rec type may appear at most once. | [default to List<RecDefRuleset>]
**definitionType** | **String** | What this definition reconciles, and so which shape of details it carries. Available values: PortfolioContents, LusidEntity, External. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioContentsRecDefinitionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<RecDefSource> leftPortfolioSources = new List<RecDefSource>();
List<RecDefSource> rightPortfolioSources = new List<RecDefSource>();
RecDefRecipeIds valuationRecipes = new RecDefRecipeIds();
RecDefCurrencies currencies = new RecDefCurrencies();
List<RecDefRuleset> rulesets = new List<RecDefRuleset>();
String definitionType = "example definitionType";


PortfolioContentsRecDefinitionDetails portfolioContentsRecDefinitionDetailsInstance = new PortfolioContentsRecDefinitionDetails()
    .leftPortfolioSources(leftPortfolioSources)
    .rightPortfolioSources(rightPortfolioSources)
    .valuationRecipes(valuationRecipes)
    .currencies(currencies)
    .rulesets(rulesets)
    .definitionType(definitionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)