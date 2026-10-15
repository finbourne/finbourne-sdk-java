# com.finbourne.sdk.services.lusid.model.CollateralAgreement
classname CollateralAgreement
A collateral agreement: who it covers, how exposure is valued, and the variation and initial margin  arrangements collateral is called and returned under.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**counterpartyId** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [optional] [default to CounterpartyIdentifier]
**applicabilityFilter** | **String** | A filter selecting the portfolios and trades the agreement covers. Checked for structure only when the agreement is stored. | [optional] [default to String]
**baseCurrency** | **String** | The currency margin is calculated and called in. Filterable. | [optional] [default to String]
**cutLabel** | **String** | The cut label naming the market data that margin is valued at. | [optional] [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**minimumTransferAmount** | **java.math.BigDecimal** | The smallest margin movement that is called. Optional. | [optional] [default to java.math.BigDecimal]
**rounding** | [**MarginRounding**](MarginRounding.md) |  | [optional] [default to MarginRounding]
**settlementLag** | [**MarginSettlementLag**](MarginSettlementLag.md) |  | [optional] [default to MarginSettlementLag]
**matchTolerance** | **java.math.BigDecimal** | The tolerance within which our margin figure and the counterparty&#39;s are considered to match. Optional. | [optional] [default to java.math.BigDecimal]
**variationMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The variation margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**initialMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The initial margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Collateral Agreement. Filterable. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CollateralAgreement;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
CounterpartyIdentifier counterpartyId = new CounterpartyIdentifier();
@javax.annotation.Nullable String applicabilityFilter = "example applicabilityFilter";
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";
@javax.annotation.Nullable String cutLabel = "example cutLabel";
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal minimumTransferAmount = new java.math.BigDecimal("100.00");
MarginRounding rounding = new MarginRounding();
MarginSettlementLag settlementLag = new MarginSettlementLag();
@javax.annotation.Nullable java.math.BigDecimal matchTolerance = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<MarginItem> variationMargin = new List<MarginItem>();
@javax.annotation.Nullable List<MarginItem> initialMargin = new List<MarginItem>();
Version version = new Version();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CollateralAgreement collateralAgreementInstance = new CollateralAgreement()
    .href(href)
    .id(id)
    .counterpartyId(counterpartyId)
    .applicabilityFilter(applicabilityFilter)
    .baseCurrency(baseCurrency)
    .cutLabel(cutLabel)
    .recipeId(recipeId)
    .minimumTransferAmount(minimumTransferAmount)
    .rounding(rounding)
    .settlementLag(settlementLag)
    .matchTolerance(matchTolerance)
    .variationMargin(variationMargin)
    .initialMargin(initialMargin)
    .version(version)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)