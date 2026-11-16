# com.finbourne.sdk.services.lusid.model.BucketCashFlowBucket
classname BucketCashFlowBucket
One tenor bucket for one portfolio, payment currency and set of sub-holding keys: its opening balance, closing balance and the  cash flows that make up its activity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | Identifies the bucket: a 32 character lowercase hexadecimal hash of its period (start and end), payment currency, portfolio and sub-holding keys. It is stable, the same bucket has the same id in every response, and it is opaque: compare it, do not take it apart. | [optional] [default to String]
**bucketStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the period the bucket covers. | [optional] [default to OffsetDateTime]
**bucketEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the period the bucket covers. | [optional] [default to OffsetDateTime]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**currency** | **String** | The payment currency of the bucket. | [optional] [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding keys the bucket is for, limited to those the caller may read. | [optional] [default to Map<String, PerpetualProperty>]
**open** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**activityTotal** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**activity** | [**List&lt;CashFlowDetail&gt;**](CashFlowDetail.md) | The cash flows in the bucket, with the attributes a cash flow has in Values. | [optional] [default to List<CashFlowDetail>]
**close** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**startingBalanceRate** | **java.math.BigDecimal** | The spot rate the starting balance (the holdings&#39; cash at the window start) was converted at to open the report currency balances, under a rate type other than FxSpot. Absent under FxSpot, when the starting balance is zero, or when no report currency was requested. | [optional] [default to java.math.BigDecimal]
**fxTranslation** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BucketCashFlowBucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String bucketId = "example bucketId";
OffsetDateTime bucketStart = OffsetDateTime.now();
OffsetDateTime bucketEnd = OffsetDateTime.now();
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
BucketAmounts open = new BucketAmounts();
BucketAmounts activityTotal = new BucketAmounts();
@javax.annotation.Nullable List<CashFlowDetail> activity = new List<CashFlowDetail>();
BucketAmounts close = new BucketAmounts();
@javax.annotation.Nullable java.math.BigDecimal startingBalanceRate = new java.math.BigDecimal("100.00");
CurrencyAndAmount fxTranslation = new CurrencyAndAmount();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BucketCashFlowBucket bucketCashFlowBucketInstance = new BucketCashFlowBucket()
    .bucketId(bucketId)
    .bucketStart(bucketStart)
    .bucketEnd(bucketEnd)
    .portfolioId(portfolioId)
    .currency(currency)
    .subHoldingKeys(subHoldingKeys)
    .open(open)
    .activityTotal(activityTotal)
    .activity(activity)
    .close(close)
    .startingBalanceRate(startingBalanceRate)
    .fxTranslation(fxTranslation)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)