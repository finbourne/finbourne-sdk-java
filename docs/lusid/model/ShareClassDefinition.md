# com.finbourne.sdk.services.lusid.model.ShareClassDefinition
classname ShareClassDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**name** | **String** | The display name of the Share Class. | [default to String]
**description** | **String** | An optional description for the Share Class. | [optional] [default to String]
**shareClassShortCode** | **String** | A short code that uniquely identifies the share class within the Fund. | [default to String]
**launchPrice** | **java.math.BigDecimal** | The launch price set when a shareclass is added to the fund. Defaults to 1. | [optional] [default to java.math.BigDecimal]
**launchDate** | [**OffsetDateTime**](OffsetDateTime.md) | The launch date set when a shareclass is added to the fund. Defaults to Fund Inception Date. | [optional] [default to OffsetDateTime]
**apportionmentFactor** | **java.math.BigDecimal** | The weighting factor used for apportionment across this share class. | [optional] [default to java.math.BigDecimal]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | An optional set of properties to attach to the auto-created Instrument. Only applied when createInstrument is true. | [optional] [default to Map<String, Property>]
**fundShareClassType** | **String** | The Type of Share Class. Available values: Unitised, Inactive, Series, PrivateEquity, Partnership. | [default to String]
**distributionType** | **String** | The type of distribution the ShareClass will calculate. Available values: Income, Accumulation. | [default to String]
**domCcy** | **String** | The domestic currency of the ShareClass instrument. | [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**unitsPrecision** | **Integer** | Decimal places for the share class units. | [optional] [default to Integer]
**pricePrecision** | **Integer** | Decimal places for the share class price. | [optional] [default to Integer]
**roundingConventions** | [**List&lt;SimpleRoundingConvention&gt;**](SimpleRoundingConvention.md) | Rounding conventions used for the ShareClass quotes. | [optional] [default to List<SimpleRoundingConvention>]
**roundingConventionsUnits** | [**List&lt;SimpleRoundingConvention&gt;**](SimpleRoundingConvention.md) | Rounding conventions used for the ShareClass units. | [optional] [default to List<SimpleRoundingConvention>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**distributionPaymentType** | **String** | The tax treatment applied to distributions. Available values: Invalid, Gross, Net. | [optional] [default to String]
**hedging** | **String** | Indicates whether the ShareClass applies currency hedging. Available values: Invalid, None, ApplyHedging. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();
String name = "example name";
@javax.annotation.Nullable String description = "example description";
String shareClassShortCode = "example shareClassShortCode";
@javax.annotation.Nullable java.math.BigDecimal launchPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime launchDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal apportionmentFactor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
String fundShareClassType = "example fundShareClassType";
String distributionType = "example distributionType";
String domCcy = "example domCcy";
TradingConventions tradingConventions = new TradingConventions();
@javax.annotation.Nullable Integer unitsPrecision = new Integer("100.00");
@javax.annotation.Nullable Integer pricePrecision = new Integer("100.00");
@javax.annotation.Nullable List<SimpleRoundingConvention> roundingConventions = new List<SimpleRoundingConvention>();
@javax.annotation.Nullable List<SimpleRoundingConvention> roundingConventionsUnits = new List<SimpleRoundingConvention>();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
@javax.annotation.Nullable String distributionPaymentType = "example distributionPaymentType";
String hedging = "example hedging";


ShareClassDefinition shareClassDefinitionInstance = new ShareClassDefinition()
    .instrumentIdentifiers(instrumentIdentifiers)
    .name(name)
    .description(description)
    .shareClassShortCode(shareClassShortCode)
    .launchPrice(launchPrice)
    .launchDate(launchDate)
    .apportionmentFactor(apportionmentFactor)
    .properties(properties)
    .fundShareClassType(fundShareClassType)
    .distributionType(distributionType)
    .domCcy(domCcy)
    .tradingConventions(tradingConventions)
    .unitsPrecision(unitsPrecision)
    .pricePrecision(pricePrecision)
    .roundingConventions(roundingConventions)
    .roundingConventionsUnits(roundingConventionsUnits)
    .timeZoneConventions(timeZoneConventions)
    .distributionPaymentType(distributionPaymentType)
    .hedging(hedging);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)