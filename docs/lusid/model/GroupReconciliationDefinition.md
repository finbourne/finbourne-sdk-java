# com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinition
classname GroupReconciliationDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**displayName** | **String** | The name of the Group Reconciliation Definition | [optional] [default to String]
**description** | **String** | The description of the Group Reconciliation Definition | [optional] [default to String]
**portfolioEntityIds** | [**GroupReconciliationDefinitionPortfolioEntityIds**](GroupReconciliationDefinitionPortfolioEntityIds.md) |  | [optional] [default to GroupReconciliationDefinitionPortfolioEntityIds]
**recipeIds** | [**GroupReconciliationDefinitionRecipeIds**](GroupReconciliationDefinitionRecipeIds.md) |  | [optional] [default to GroupReconciliationDefinitionRecipeIds]
**currencies** | [**GroupReconciliationDefinitionCurrencies**](GroupReconciliationDefinitionCurrencies.md) |  | [optional] [default to GroupReconciliationDefinitionCurrencies]
**transactionDateWindows** | [**TransactionDateWindows**](TransactionDateWindows.md) |  | [optional] [default to TransactionDateWindows]
**comparisonRulesetIds** | [**GroupReconciliationDefinitionComparisonRulesetIds**](GroupReconciliationDefinitionComparisonRulesetIds.md) |  | [optional] [default to GroupReconciliationDefinitionComparisonRulesetIds]
**breakCodeSource** | [**BreakCodeSource**](BreakCodeSource.md) |  | [optional] [default to BreakCodeSource]
**primarySchedule** | [**PrimarySchedule**](PrimarySchedule.md) |  | [optional] [default to PrimarySchedule]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
GroupReconciliationDefinitionPortfolioEntityIds portfolioEntityIds = new GroupReconciliationDefinitionPortfolioEntityIds();
GroupReconciliationDefinitionRecipeIds recipeIds = new GroupReconciliationDefinitionRecipeIds();
GroupReconciliationDefinitionCurrencies currencies = new GroupReconciliationDefinitionCurrencies();
TransactionDateWindows transactionDateWindows = new TransactionDateWindows();
GroupReconciliationDefinitionComparisonRulesetIds comparisonRulesetIds = new GroupReconciliationDefinitionComparisonRulesetIds();
BreakCodeSource breakCodeSource = new BreakCodeSource();
PrimarySchedule primarySchedule = new PrimarySchedule();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();


GroupReconciliationDefinition groupReconciliationDefinitionInstance = new GroupReconciliationDefinition()
    .id(id)
    .displayName(displayName)
    .description(description)
    .portfolioEntityIds(portfolioEntityIds)
    .recipeIds(recipeIds)
    .currencies(currencies)
    .transactionDateWindows(transactionDateWindows)
    .comparisonRulesetIds(comparisonRulesetIds)
    .breakCodeSource(breakCodeSource)
    .primarySchedule(primarySchedule)
    .href(href)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)