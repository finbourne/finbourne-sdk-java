# com.finbourne.sdk.services.lusid.model.CreateDerivedTransactionPortfolioRequest
classname CreateDerivedTransactionPortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the derived transaction portfolio. | [default to String]
**description** | **String** | A description for the derived transaction portfolio. | [optional] [default to String]
**code** | **String** | The code of the derived transaction portfolio. Together with the scope this uniquely identifies the derived transaction portfolio. | [default to String]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | This will be auto-populated to be the parent portfolio creation date. | [optional] [default to OffsetDateTime]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**accountingMethod** | **String** | Determines the accounting treatment given to the transaction portfolio&#39;s tax lots. Default value: AverageCost. Available values: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the derived transaction portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information. | [optional] [default to List<String>]
**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to this derived portfolio. | [optional] [default to List<String>]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. Available values: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate. | [optional] [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated. Default value: SettlementDate. Available values: Default, SettlementDate, TransactionDate. | [optional] [default to String]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**settlementConfiguration** | [**PortfolioSettlementConfiguration**](PortfolioSettlementConfiguration.md) |  | [optional] [default to PortfolioSettlementConfiguration]

```java
import com.finbourne.sdk.services.lusid.model.CreateDerivedTransactionPortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String code = "example code";
ResourceId parentPortfolioId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime created = OffsetDateTime.now();
ResourceId corporateActionSourceId = new ResourceId();
String accountingMethod = "example accountingMethod";
@javax.annotation.Nullable List<String> subHoldingKeys = new List<String>();
@javax.annotation.Nullable List<String> instrumentScopes = new List<String>();
@javax.annotation.Nullable String amortisationMethod = "example amortisationMethod";
@javax.annotation.Nullable String transactionTypeScope = "example transactionTypeScope";
@javax.annotation.Nullable String cashGainLossCalculationDate = "example cashGainLossCalculationDate";
ResourceId amortisationRuleSetId = new ResourceId();
InstrumentEventConfiguration instrumentEventConfiguration = new InstrumentEventConfiguration();
PortfolioSettlementConfiguration settlementConfiguration = new PortfolioSettlementConfiguration();


CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequestInstance = new CreateDerivedTransactionPortfolioRequest()
    .displayName(displayName)
    .description(description)
    .code(code)
    .parentPortfolioId(parentPortfolioId)
    .created(created)
    .corporateActionSourceId(corporateActionSourceId)
    .accountingMethod(accountingMethod)
    .subHoldingKeys(subHoldingKeys)
    .instrumentScopes(instrumentScopes)
    .amortisationMethod(amortisationMethod)
    .transactionTypeScope(transactionTypeScope)
    .cashGainLossCalculationDate(cashGainLossCalculationDate)
    .amortisationRuleSetId(amortisationRuleSetId)
    .instrumentEventConfiguration(instrumentEventConfiguration)
    .settlementConfiguration(settlementConfiguration);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)