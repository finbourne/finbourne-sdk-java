# com.finbourne.sdk.services.lusid.model.TransferAgencyOrderEstimateResult
classname TransferAgencyOrderEstimateResult
The estimated values for one order, together with the market facts they were struck from. The market facts  are repeated on every order priced against the same share class so that each result stands alone.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**mostRecentValuationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**pricePerShare** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**priceCurrency** | **String** |  | [optional] [default to String]
**estimatedUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**estimatedAmount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**estimatedAmountCurrency** | **String** |  | [optional] [default to String]
**fxRateUsed** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**excludedOrders** | [**List&lt;TransferAgencyExcludedOrder&gt;**](TransferAgencyExcludedOrder.md) |  | [optional] [default to List<TransferAgencyExcludedOrder>]

```java
import com.finbourne.sdk.services.lusid.model.TransferAgencyOrderEstimateResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
OffsetDateTime mostRecentValuationDate = OffsetDateTime.now();
java.math.BigDecimal pricePerShare = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String priceCurrency = "example priceCurrency";
java.math.BigDecimal estimatedUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal estimatedAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String estimatedAmountCurrency = "example estimatedAmountCurrency";
java.math.BigDecimal fxRateUsed = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<TransferAgencyExcludedOrder> excludedOrders = new List<TransferAgencyExcludedOrder>();


TransferAgencyOrderEstimateResult transferAgencyOrderEstimateResultInstance = new TransferAgencyOrderEstimateResult()
    .orderId(orderId)
    .mostRecentValuationDate(mostRecentValuationDate)
    .pricePerShare(pricePerShare)
    .priceCurrency(priceCurrency)
    .estimatedUnits(estimatedUnits)
    .estimatedAmount(estimatedAmount)
    .estimatedAmountCurrency(estimatedAmountCurrency)
    .fxRateUsed(fxRateUsed)
    .excludedOrders(excludedOrders);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)