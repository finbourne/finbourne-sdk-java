# com.finbourne.sdk.services.lusid.model.CreateTransactionPortfolioRequest
classname CreateTransactionPortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the transaction portfolio. | [default to String]
**description** | **String** | A description for the transaction portfolio. | [optional] [default to String]
**code** | **String** | The code of the transaction portfolio. Together with the scope this uniquely identifies the transaction portfolio. | [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which to create the transaction portfolio. No transactions can be added to the transaction portfolio before this date. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**baseCurrency** | **String** | The base currency of the transaction portfolio in ISO 4217 currency code format. | [default to String]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**accountingMethod** | **String** | Determines the accounting treatment given to the transaction portfolio&#39;s tax lots. Default value: AverageCost. Available values: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the transaction portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information. | [optional] [default to List<String>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of unique portfolio properties to add custom data to the transaction portfolio. Each property must be from the &#39;Portfolio&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. Note these properties must be pre-defined. | [optional] [default to Map<String, Property>]
**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to this portfolio. | [optional] [default to List<String>]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. Available values: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate. | [optional] [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated. Default value: SettlementDate. Available values: Default, SettlementDate, TransactionDate. | [optional] [default to String]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxRuleSetScope** | **String** | The scope of the tax rule sets for this portfolio. | [optional] [default to String]
**settlementConfiguration** | [**PortfolioSettlementConfiguration**](PortfolioSettlementConfiguration.md) |  | [optional] [default to PortfolioSettlementConfiguration]

```java
import com.finbourne.sdk.services.lusid.model.CreateTransactionPortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String code = "example code";
@javax.annotation.Nullable OffsetDateTime created = OffsetDateTime.now();
String baseCurrency = "example baseCurrency";
ResourceId corporateActionSourceId = new ResourceId();
String accountingMethod = "example accountingMethod";
@javax.annotation.Nullable List<String> subHoldingKeys = new List<String>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<String> instrumentScopes = new List<String>();
@javax.annotation.Nullable String amortisationMethod = "example amortisationMethod";
@javax.annotation.Nullable String transactionTypeScope = "example transactionTypeScope";
@javax.annotation.Nullable String cashGainLossCalculationDate = "example cashGainLossCalculationDate";
InstrumentEventConfiguration instrumentEventConfiguration = new InstrumentEventConfiguration();
ResourceId amortisationRuleSetId = new ResourceId();
@javax.annotation.Nullable String taxRuleSetScope = "example taxRuleSetScope";
PortfolioSettlementConfiguration settlementConfiguration = new PortfolioSettlementConfiguration();


CreateTransactionPortfolioRequest createTransactionPortfolioRequestInstance = new CreateTransactionPortfolioRequest()
    .displayName(displayName)
    .description(description)
    .code(code)
    .created(created)
    .baseCurrency(baseCurrency)
    .corporateActionSourceId(corporateActionSourceId)
    .accountingMethod(accountingMethod)
    .subHoldingKeys(subHoldingKeys)
    .properties(properties)
    .instrumentScopes(instrumentScopes)
    .amortisationMethod(amortisationMethod)
    .transactionTypeScope(transactionTypeScope)
    .cashGainLossCalculationDate(cashGainLossCalculationDate)
    .instrumentEventConfiguration(instrumentEventConfiguration)
    .amortisationRuleSetId(amortisationRuleSetId)
    .taxRuleSetScope(taxRuleSetScope)
    .settlementConfiguration(settlementConfiguration);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)