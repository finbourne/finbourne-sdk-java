# com.finbourne.sdk.services.lusid.model.CollateralAgreementRequest
classname CollateralAgreementRequest
The request used to create a Collateral Agreement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Collateral Agreement. | [default to String]
**counterpartyId** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [default to CounterpartyIdentifier]
**applicabilityFilter** | **String** | A filter selecting the portfolios and trades the agreement covers. Checked for structure only when the agreement is stored. | [default to String]
**baseCurrency** | **String** | The currency margin is calculated and called in. Filterable. | [default to String]
**cutLabel** | **String** | The cut label naming the market data that margin is valued at. | [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**minimumTransferAmount** | **java.math.BigDecimal** | The smallest margin movement that is called. Optional. | [optional] [default to java.math.BigDecimal]
**rounding** | [**MarginRounding**](MarginRounding.md) |  | [default to MarginRounding]
**settlementLag** | [**MarginSettlementLag**](MarginSettlementLag.md) |  | [default to MarginSettlementLag]
**matchTolerance** | **java.math.BigDecimal** | The tolerance within which our margin figure and the counterparty&#39;s are considered to match. Optional. | [optional] [default to java.math.BigDecimal]
**variationMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The variation margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**initialMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The initial margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Collateral Agreement. Filterable. | [optional] [default to Map<String, Property>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the Collateral Agreement applies. Defaults to the beginning of time if not specified, so that the agreement is visible at every effective datetime. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CollateralAgreementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
CounterpartyIdentifier counterpartyId = new CounterpartyIdentifier();
String applicabilityFilter = "example applicabilityFilter";
String baseCurrency = "example baseCurrency";
String cutLabel = "example cutLabel";
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal minimumTransferAmount = new java.math.BigDecimal("100.00");
MarginRounding rounding = new MarginRounding();
MarginSettlementLag settlementLag = new MarginSettlementLag();
@javax.annotation.Nullable java.math.BigDecimal matchTolerance = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<MarginItem> variationMargin = new List<MarginItem>();
@javax.annotation.Nullable List<MarginItem> initialMargin = new List<MarginItem>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();


CollateralAgreementRequest collateralAgreementRequestInstance = new CollateralAgreementRequest()
    .code(code)
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
    .properties(properties)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)