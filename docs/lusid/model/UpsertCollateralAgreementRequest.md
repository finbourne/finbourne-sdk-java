# com.finbourne.sdk.services.lusid.model.UpsertCollateralAgreementRequest
classname UpsertCollateralAgreementRequest
The request used to create or update a Collateral Agreement. The scope and code come from the route.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counterpartyId** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [default to CounterpartyIdentifier]
**applicabilityFilter** | **String** | A filter selecting the portfolios and trades the agreement covers. Checked for structure only when the agreement is stored. | [default to String]
**baseCurrency** | **String** | The currency margin is calculated and called in. Filterable. | [default to String]
**cutLabel** | **String** | The cut label naming the market data that margin is valued at. | [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**minimumTransferAmount** | **java.math.BigDecimal** | The smallest margin movement that is called. Optional. | [optional] [default to java.math.BigDecimal]
**rounding** | [**MarginRounding**](MarginRounding.md) |  | [default to MarginRounding]
**settlementLag** | [**MarginSettlementLag**](MarginSettlementLag.md) |  | [default to MarginSettlementLag]
**matchTolerance** | **java.math.BigDecimal** | The tolerance within which our margin figure and the counterparty&#39;s are considered to match. Optional. | [optional] [default to java.math.BigDecimal]
**funding** | [**CollateralFundingTerms**](CollateralFundingTerms.md) |  | [optional] [default to CollateralFundingTerms]
**optimisation** | [**CollateralOptimisationTerms**](CollateralOptimisationTerms.md) |  | [optional] [default to CollateralOptimisationTerms]
**variationMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The variation margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**initialMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The initial margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Collateral Agreement. Filterable. | [optional] [default to Map<String, Property>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime or cut label from which the change applies. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**notificationCutLabel** | **String** | The cut label giving the time of day by which collateral we deliver under a margin call must settle. Each run resolves it on the business date and records it as the call&#39;s deadline; the allocation excludes assets that cannot settle by it. Optional. | [optional] [default to String]
**returnNotificationCutLabel** | **String** | The cut label giving the time of day by which collateral the counterparty delivers, or returns to us, must settle. Recorded as the deadline of the calls they post under. Optional. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpsertCollateralAgreementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CounterpartyIdentifier counterpartyId = new CounterpartyIdentifier();
String applicabilityFilter = "example applicabilityFilter";
String baseCurrency = "example baseCurrency";
String cutLabel = "example cutLabel";
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal minimumTransferAmount = new java.math.BigDecimal("100.00");
MarginRounding rounding = new MarginRounding();
MarginSettlementLag settlementLag = new MarginSettlementLag();
@javax.annotation.Nullable java.math.BigDecimal matchTolerance = new java.math.BigDecimal("100.00");
CollateralFundingTerms funding = new CollateralFundingTerms();
CollateralOptimisationTerms optimisation = new CollateralOptimisationTerms();
@javax.annotation.Nullable List<MarginItem> variationMargin = new List<MarginItem>();
@javax.annotation.Nullable List<MarginItem> initialMargin = new List<MarginItem>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String notificationCutLabel = "example notificationCutLabel";
@javax.annotation.Nullable String returnNotificationCutLabel = "example returnNotificationCutLabel";


UpsertCollateralAgreementRequest upsertCollateralAgreementRequestInstance = new UpsertCollateralAgreementRequest()
    .counterpartyId(counterpartyId)
    .applicabilityFilter(applicabilityFilter)
    .baseCurrency(baseCurrency)
    .cutLabel(cutLabel)
    .recipeId(recipeId)
    .minimumTransferAmount(minimumTransferAmount)
    .rounding(rounding)
    .settlementLag(settlementLag)
    .matchTolerance(matchTolerance)
    .funding(funding)
    .optimisation(optimisation)
    .variationMargin(variationMargin)
    .initialMargin(initialMargin)
    .properties(properties)
    .effectiveAt(effectiveAt)
    .notificationCutLabel(notificationCutLabel)
    .returnNotificationCutLabel(returnNotificationCutLabel);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)