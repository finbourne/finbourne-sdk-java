# com.finbourne.sdk.services.lusid.model.ExchangeTradedOptionContractDetails
classname ExchangeTradedOptionContractDetails
Most, if not all, information about contracts is standardised. See, e.g. https://www.cmegroup.com/ for  common codes and similar data. This appears to be in common use by well known market information providers, e.g. Bloomberg and Refinitiv.  There is a lot of overlap with this and FuturesContractDetails but as that is an established DTO we must duplicate a number of fields here

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domCcy** | **String** | Currency in which the contract is paid. | [default to String]
**strike** | **java.math.BigDecimal** | The option strike, this can be negative for some options. | [default to java.math.BigDecimal]
**contractSize** | **java.math.BigDecimal** | Size of a single contract. By default this should be set to 1000 if otherwise unknown and is defaulted to such. | [default to java.math.BigDecimal]
**country** | **String** | Country (code) for the exchange. | [default to String]
**deliveryType** | **String** | The delivery type, cash or physical. An option on a future is physically settled if upon exercising the  holder receives a future.    Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**description** | **String** | Description of contract | [default to String]
**exchangeCode** | **String** | Exchange code for contract. This can be any string to uniquely identify the exchange (e.g. Exchange Name, MIC, BBG code). | [default to String]
**exerciseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last exercise date of the option. | [default to OffsetDateTime]
**exerciseType** | **String** | The exercise type, European, American or Bermudan.    Supported string (enumeration) values are: [European, Bermudan, American]. | [default to String]
**optionCode** | **String** | Option Contract Code, typically one or two letters, e.g. OG &#x3D;&gt; Option on Gold. | [default to String]
**optionType** | **String** | The option type, Call or Put.    Supported string (enumeration) values are: [Call, Put]. | [default to String]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]
**underlyingCode** | **String** | Code of the underlying, for an option on futures this should be the futures code. | [default to String]
**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.  Defaults to 0 if not set. | [optional] [default to Integer]
**businessDayConvention** | **String** | The adjustment type to apply to dates that fall upon a non-business day, e.g. modified following or following.  Default value: F. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | An array of strings denoting calendars used in calculating the option settlement date. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ExchangeTradedOptionContractDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domCcy = "example domCcy";
java.math.BigDecimal strike = new java.math.BigDecimal("100.00");
java.math.BigDecimal contractSize = new java.math.BigDecimal("100.00");
String country = "example country";
String deliveryType = "example deliveryType";
String description = "example description";
String exchangeCode = "example exchangeCode";
OffsetDateTime exerciseDate = OffsetDateTime.now();
String exerciseType = "example exerciseType";
String optionCode = "example optionCode";
String optionType = "example optionType";
LusidInstrument underlying = new LusidInstrument();
String underlyingCode = "example underlyingCode";
Integer deliveryDays = new Integer("100.00");
@javax.annotation.Nullable String businessDayConvention = "example businessDayConvention";
@javax.annotation.Nullable List<String> settlementCalendars = new List<String>();


ExchangeTradedOptionContractDetails exchangeTradedOptionContractDetailsInstance = new ExchangeTradedOptionContractDetails()
    .domCcy(domCcy)
    .strike(strike)
    .contractSize(contractSize)
    .country(country)
    .deliveryType(deliveryType)
    .description(description)
    .exchangeCode(exchangeCode)
    .exerciseDate(exerciseDate)
    .exerciseType(exerciseType)
    .optionCode(optionCode)
    .optionType(optionType)
    .underlying(underlying)
    .underlyingCode(underlyingCode)
    .deliveryDays(deliveryDays)
    .businessDayConvention(businessDayConvention)
    .settlementCalendars(settlementCalendars);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)