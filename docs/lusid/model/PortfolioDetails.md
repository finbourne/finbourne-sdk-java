# com.finbourne.sdk.services.lusid.model.PortfolioDetails
classname PortfolioDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**originPortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**version** | [**Version**](Version.md) |  | [default to Version]
**baseCurrency** | **String** | The base currency of the transaction portfolio. | [default to String]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**subHoldingKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to the transaction portfolio. | [optional] [default to List<String>]
**accountingMethod** | **String** | The AccountingMethod used for the portfolio. Available values: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. Available values: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate. | [optional] [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated. Default value: SettlementDate. | [optional] [default to String]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxRuleSetScope** | **String** | The scope of the tax rule sets for this portfolio. | [optional] [default to String]
**settlementConfiguration** | [**PortfolioSettlementConfiguration**](PortfolioSettlementConfiguration.md) |  | [optional] [default to PortfolioSettlementConfiguration]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId originPortfolioId = new ResourceId();
Version version = new Version();
String baseCurrency = "example baseCurrency";
ResourceId corporateActionSourceId = new ResourceId();
@javax.annotation.Nullable List<String> subHoldingKeys = new List<String>();
@javax.annotation.Nullable List<String> instrumentScopes = new List<String>();
String accountingMethod = "example accountingMethod";
@javax.annotation.Nullable String amortisationMethod = "example amortisationMethod";
@javax.annotation.Nullable String transactionTypeScope = "example transactionTypeScope";
@javax.annotation.Nullable String cashGainLossCalculationDate = "example cashGainLossCalculationDate";
InstrumentEventConfiguration instrumentEventConfiguration = new InstrumentEventConfiguration();
ResourceId amortisationRuleSetId = new ResourceId();
@javax.annotation.Nullable String taxRuleSetScope = "example taxRuleSetScope";
PortfolioSettlementConfiguration settlementConfiguration = new PortfolioSettlementConfiguration();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PortfolioDetails portfolioDetailsInstance = new PortfolioDetails()
    .href(href)
    .originPortfolioId(originPortfolioId)
    .version(version)
    .baseCurrency(baseCurrency)
    .corporateActionSourceId(corporateActionSourceId)
    .subHoldingKeys(subHoldingKeys)
    .instrumentScopes(instrumentScopes)
    .accountingMethod(accountingMethod)
    .amortisationMethod(amortisationMethod)
    .transactionTypeScope(transactionTypeScope)
    .cashGainLossCalculationDate(cashGainLossCalculationDate)
    .instrumentEventConfiguration(instrumentEventConfiguration)
    .amortisationRuleSetId(amortisationRuleSetId)
    .taxRuleSetScope(taxRuleSetScope)
    .settlementConfiguration(settlementConfiguration)
    .stagedModifications(stagedModifications)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)