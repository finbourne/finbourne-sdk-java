# com.finbourne.sdk.services.lusid.model.NavTypeDefinition
classname NavTypeDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The Code for the Nav Type. Must be unique within the Fund. | [optional] [default to String]
**displayName** | **String** | The Display Name for the Nav Type. Must be unique within the Fund. | [optional] [default to String]
**description** | **String** | The Description for the Nav Type. | [optional] [default to String]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**postingModuleCodes** | **List&lt;String&gt;** | The Posting Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**cleardownModuleCodes** | **List&lt;String&gt;** | The Cleardown Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**settlementConfiguration** | [**NavSettlementConfiguration**](NavSettlementConfiguration.md) |  | [optional] [default to NavSettlementConfiguration]
**valuationRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**accountingMethod** | **String** | Determines the accounting treatment given to the simple position portfolio&#39;s tax lots. A non-default value is required. Available values: AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the derived transaction portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information. | [optional] [default to List<String>]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. Available values: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate. | [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated, TransactionDate/SettlementDate. A non-default value is required. Available values: SettlementDate, TransactionDate. | [default to String]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**leaderNavTypeCode** | **String** | The code of the Nav Type that this Nav Type will follow when set. | [optional] [default to String]
**transactionTemplateScope** | **String** | The Transaction Template Scope used by the NavType. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.NavTypeDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId chartOfAccountsId = new ResourceId();
@javax.annotation.Nullable List<String> postingModuleCodes = new List<String>();
@javax.annotation.Nullable List<String> cleardownModuleCodes = new List<String>();
NavSettlementConfiguration settlementConfiguration = new NavSettlementConfiguration();
ResourceId valuationRecipeId = new ResourceId();
ResourceId holdingRecipeId = new ResourceId();
String accountingMethod = "example accountingMethod";
@javax.annotation.Nullable List<String> subHoldingKeys = new List<String>();
String amortisationMethod = "example amortisationMethod";
String transactionTypeScope = "example transactionTypeScope";
String cashGainLossCalculationDate = "example cashGainLossCalculationDate";
ResourceId amortisationRuleSetId = new ResourceId();
@javax.annotation.Nullable String leaderNavTypeCode = "example leaderNavTypeCode";
String transactionTemplateScope = "example transactionTemplateScope";


NavTypeDefinition navTypeDefinitionInstance = new NavTypeDefinition()
    .code(code)
    .displayName(displayName)
    .description(description)
    .chartOfAccountsId(chartOfAccountsId)
    .postingModuleCodes(postingModuleCodes)
    .cleardownModuleCodes(cleardownModuleCodes)
    .settlementConfiguration(settlementConfiguration)
    .valuationRecipeId(valuationRecipeId)
    .holdingRecipeId(holdingRecipeId)
    .accountingMethod(accountingMethod)
    .subHoldingKeys(subHoldingKeys)
    .amortisationMethod(amortisationMethod)
    .transactionTypeScope(transactionTypeScope)
    .cashGainLossCalculationDate(cashGainLossCalculationDate)
    .amortisationRuleSetId(amortisationRuleSetId)
    .leaderNavTypeCode(leaderNavTypeCode)
    .transactionTemplateScope(transactionTemplateScope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)