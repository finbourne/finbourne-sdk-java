# com.finbourne.sdk.services.lusid.model.CreateGroupReconciliationDefinitionRequest
classname CreateGroupReconciliationDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**displayName** | **String** | The name of the Group Reconciliation Definition | [default to String]
**description** | **String** | The description of the Group Reconciliation Definition | [optional] [default to String]
**portfolioEntityIds** | [**GroupReconciliationDefinitionPortfolioEntityIds**](GroupReconciliationDefinitionPortfolioEntityIds.md) |  | [default to GroupReconciliationDefinitionPortfolioEntityIds]
**recipeIds** | [**GroupReconciliationDefinitionRecipeIds**](GroupReconciliationDefinitionRecipeIds.md) |  | [optional] [default to GroupReconciliationDefinitionRecipeIds]
**currencies** | [**GroupReconciliationDefinitionCurrencies**](GroupReconciliationDefinitionCurrencies.md) |  | [optional] [default to GroupReconciliationDefinitionCurrencies]
**transactionDateWindows** | [**TransactionDateWindows**](TransactionDateWindows.md) |  | [optional] [default to TransactionDateWindows]
**comparisonRulesetIds** | [**GroupReconciliationDefinitionComparisonRulesetIds**](GroupReconciliationDefinitionComparisonRulesetIds.md) |  | [optional] [default to GroupReconciliationDefinitionComparisonRulesetIds]
**breakCodeSource** | [**BreakCodeSource**](BreakCodeSource.md) |  | [optional] [default to BreakCodeSource]
**primarySchedule** | [**PrimarySchedule**](PrimarySchedule.md) |  | [optional] [default to PrimarySchedule]

```java
import com.finbourne.sdk.services.lusid.model.CreateGroupReconciliationDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
GroupReconciliationDefinitionPortfolioEntityIds portfolioEntityIds = new GroupReconciliationDefinitionPortfolioEntityIds();
GroupReconciliationDefinitionRecipeIds recipeIds = new GroupReconciliationDefinitionRecipeIds();
GroupReconciliationDefinitionCurrencies currencies = new GroupReconciliationDefinitionCurrencies();
TransactionDateWindows transactionDateWindows = new TransactionDateWindows();
GroupReconciliationDefinitionComparisonRulesetIds comparisonRulesetIds = new GroupReconciliationDefinitionComparisonRulesetIds();
BreakCodeSource breakCodeSource = new BreakCodeSource();
PrimarySchedule primarySchedule = new PrimarySchedule();


CreateGroupReconciliationDefinitionRequest createGroupReconciliationDefinitionRequestInstance = new CreateGroupReconciliationDefinitionRequest()
    .id(id)
    .displayName(displayName)
    .description(description)
    .portfolioEntityIds(portfolioEntityIds)
    .recipeIds(recipeIds)
    .currencies(currencies)
    .transactionDateWindows(transactionDateWindows)
    .comparisonRulesetIds(comparisonRulesetIds)
    .breakCodeSource(breakCodeSource)
    .primarySchedule(primarySchedule);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)