# com.finbourne.sdk.services.lusid.model.TaxDeemedDisposalResponse
classname TaxDeemedDisposalResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The deterministic identifier of the deemed disposal, derived from the holding and date. | [optional] [default to String]
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the deemed disposal arises, the end of the period. | [optional] [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The units disposed of. | [optional] [default to java.math.BigDecimal]
**cost** | **java.math.BigDecimal** | The allowable cost of the units disposed of. | [optional] [default to java.math.BigDecimal]
**marketValue** | **java.math.BigDecimal** | The market value of the holding at the deemed-disposal date. | [optional] [default to java.math.BigDecimal]
**netAmount** | **java.math.BigDecimal** | The net deemed amount, gains less losses. | [optional] [default to java.math.BigDecimal]
**notional** | **Boolean** | True when the deemed disposal is notional, as it is for a member fund, rather than an actual deemed disposal at company level. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.TaxDeemedDisposalResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
@javax.annotation.Nullable String portfolioCode = "example portfolioCode";
OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
java.math.BigDecimal cost = new java.math.BigDecimal("100.00");
java.math.BigDecimal marketValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal netAmount = new java.math.BigDecimal("100.00");
Boolean notional = true;


TaxDeemedDisposalResponse taxDeemedDisposalResponseInstance = new TaxDeemedDisposalResponse()
    .id(id)
    .holdingId(holdingId)
    .instrumentId(instrumentId)
    .instrumentName(instrumentName)
    .portfolioCode(portfolioCode)
    .date(date)
    .units(units)
    .cost(cost)
    .marketValue(marketValue)
    .netAmount(netAmount)
    .notional(notional);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)