# com.finbourne.sdk.services.lusid.model.TargetTaxLotRequest
classname TargetTaxLotRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **java.math.BigDecimal** | The number of units of the instrument in this tax-lot. | [default to java.math.BigDecimal]
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**portfolioCost** | **java.math.BigDecimal** | The total cost of the tax-lot in the transaction portfolio&#39;s base currency. | [optional] [default to java.math.BigDecimal]
**price** | **java.math.BigDecimal** | The purchase price of each unit of the instrument held in this tax-lot. This forms part of the unique key required for multiple tax-lots. | [optional] [default to java.math.BigDecimal]
**purchaseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The purchase date of this tax-lot. This forms part of the unique key required for multiple tax-lots. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the tax-lot&#39;s opening transaction. | [optional] [default to OffsetDateTime]
**notionalCost** | **java.math.BigDecimal** | The notional cost of the tax-lot&#39;s opening transaction. | [optional] [default to java.math.BigDecimal]
**variationMargin** | **java.math.BigDecimal** | The variation margin of the tax-lot&#39;s opening transaction. | [optional] [default to java.math.BigDecimal]
**variationMarginPortfolioCcy** | **java.math.BigDecimal** | The variation margin in portfolio currency of the tax-lot&#39;s opening transaction. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TargetTaxLotRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal units = new java.math.BigDecimal("100.00");
CurrencyAndAmount cost = new CurrencyAndAmount();
@javax.annotation.Nullable java.math.BigDecimal portfolioCost = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal price = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime purchaseDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime settlementDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal notionalCost = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal variationMargin = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal variationMarginPortfolioCcy = new java.math.BigDecimal("100.00");


TargetTaxLotRequest targetTaxLotRequestInstance = new TargetTaxLotRequest()
    .units(units)
    .cost(cost)
    .portfolioCost(portfolioCost)
    .price(price)
    .purchaseDate(purchaseDate)
    .settlementDate(settlementDate)
    .notionalCost(notionalCost)
    .variationMargin(variationMargin)
    .variationMarginPortfolioCcy(variationMarginPortfolioCcy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)