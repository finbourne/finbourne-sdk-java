# com.finbourne.sdk.services.lusid.model.CollateralAllocationLine
classname CollateralAllocationLine
One asset chosen for a margin call, with what a transaction moving it needs: the instrument, the portfolio and  account it leaves, the units, the price and the consideration. An override that fails a constraint is kept with  its exclusion reason and covers nothing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The LUSID instrument identifier of the asset, or CCY_ and the currency code for cash. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument identifiers a transaction for the line is booked against. | [default to Map<String, String>]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**custodianAccount** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**currency** | **String** | The currency the asset is denominated in, when known. | [optional] [default to String]
**units** | **java.math.BigDecimal** | The units to move. | [default to java.math.BigDecimal]
**price** | **java.math.BigDecimal** | The market value per unit in the base currency, before any haircut. Null when the asset could not be priced. | [optional] [default to java.math.BigDecimal]
**consideration** | **java.math.BigDecimal** | Units times price in the base currency: what a transaction for the line settles. Null when the asset could not be priced. | [optional] [default to java.math.BigDecimal]
**effectiveValuePerUnit** | **java.math.BigDecimal** | Price times the valuation percentage, less the FX haircut: what one unit counts for as collateral. | [optional] [default to java.math.BigDecimal]
**collateralValue** | **java.math.BigDecimal** | The collateral value the line covers: units times the effective value per unit. | [default to java.math.BigDecimal]
**costPerUnitOfValue** | **java.math.BigDecimal** | The ranking key: the annual cost of one unit of collateral value from this asset. | [optional] [default to java.math.BigDecimal]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the movement would settle under the agreement&#39;s settlement lag, counting weekdays. | [optional] [default to OffsetDateTime]
**boundBy** | **String** | Which limit decided the units. One of RemainingRequirement, FreeUnits, ConcentrationCap, LotRounding or Override. | [default to String]
**exclusionReason** | **String** | The constraint the asset failed, when it did. One of NotEligible, NoFreeUnits, MissingPrice, MissingRate, MissesDeadline, BelowMinimumLot or ConcentrationExhausted. Null when it passed. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CollateralAllocationLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentId = "example instrumentId";
Map<String, String> instrumentIdentifiers = new Map<String, String>();
ResourceId portfolioId = new ResourceId();
ResourceId custodianAccount = new ResourceId();
@javax.annotation.Nullable String currency = "example currency";
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal price = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal consideration = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal effectiveValuePerUnit = new java.math.BigDecimal("100.00");
java.math.BigDecimal collateralValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal costPerUnitOfValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime settlementDate = OffsetDateTime.now();
String boundBy = "example boundBy";
@javax.annotation.Nullable String exclusionReason = "example exclusionReason";


CollateralAllocationLine collateralAllocationLineInstance = new CollateralAllocationLine()
    .instrumentId(instrumentId)
    .instrumentIdentifiers(instrumentIdentifiers)
    .portfolioId(portfolioId)
    .custodianAccount(custodianAccount)
    .currency(currency)
    .units(units)
    .price(price)
    .consideration(consideration)
    .effectiveValuePerUnit(effectiveValuePerUnit)
    .collateralValue(collateralValue)
    .costPerUnitOfValue(costPerUnitOfValue)
    .settlementDate(settlementDate)
    .boundBy(boundBy)
    .exclusionReason(exclusionReason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)