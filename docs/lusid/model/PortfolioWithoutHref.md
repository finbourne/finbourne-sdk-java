# com.finbourne.sdk.services.lusid.model.PortfolioWithoutHref
classname PortfolioWithoutHref
A list of portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type of the portfolio. Available values: Transaction, Reference, DerivedTransaction, SimplePosition. | [default to String]
**displayName** | **String** | The name of the portfolio. | [default to String]
**description** | **String** | The long form description of the portfolio. | [optional] [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. | [default to OffsetDateTime]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. | [optional] [default to Boolean]
**baseCurrency** | **String** | The base currency of the portfolio. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the portfolio. | [optional] [default to List<Relationship>]
**instrumentScopes** | **List&lt;String&gt;** | The instrument scope resolution strategy of this portfolio. | [optional] [default to List<String>]
**accountingMethod** | **String** | The AccountingMethod used for the portfolio. Available values: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. Available values: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate. | [optional] [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The scope of the transaction types. | [optional] [default to String]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxRuleSetScope** | **String** | The scope of the tax rule sets for this portfolio. | [optional] [default to String]
**settlementConfiguration** | [**PortfolioSettlementConfiguration**](PortfolioSettlementConfiguration.md) |  | [optional] [default to PortfolioSettlementConfiguration]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioWithoutHref;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String type = "example type";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
OffsetDateTime created = OffsetDateTime.now();
ResourceId parentPortfolioId = new ResourceId();
Version version = new Version();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
Boolean isDerived = true;
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Relationship> relationships = new List<Relationship>();
@javax.annotation.Nullable List<String> instrumentScopes = new List<String>();
String accountingMethod = "example accountingMethod";
@javax.annotation.Nullable String amortisationMethod = "example amortisationMethod";
@javax.annotation.Nullable String transactionTypeScope = "example transactionTypeScope";
@javax.annotation.Nullable String cashGainLossCalculationDate = "example cashGainLossCalculationDate";
InstrumentEventConfiguration instrumentEventConfiguration = new InstrumentEventConfiguration();
ResourceId amortisationRuleSetId = new ResourceId();
@javax.annotation.Nullable String taxRuleSetScope = "example taxRuleSetScope";
PortfolioSettlementConfiguration settlementConfiguration = new PortfolioSettlementConfiguration();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PortfolioWithoutHref portfolioWithoutHrefInstance = new PortfolioWithoutHref()
    .id(id)
    .type(type)
    .displayName(displayName)
    .description(description)
    .created(created)
    .parentPortfolioId(parentPortfolioId)
    .version(version)
    .stagedModifications(stagedModifications)
    .isDerived(isDerived)
    .baseCurrency(baseCurrency)
    .properties(properties)
    .relationships(relationships)
    .instrumentScopes(instrumentScopes)
    .accountingMethod(accountingMethod)
    .amortisationMethod(amortisationMethod)
    .transactionTypeScope(transactionTypeScope)
    .cashGainLossCalculationDate(cashGainLossCalculationDate)
    .instrumentEventConfiguration(instrumentEventConfiguration)
    .amortisationRuleSetId(amortisationRuleSetId)
    .taxRuleSetScope(taxRuleSetScope)
    .settlementConfiguration(settlementConfiguration)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)