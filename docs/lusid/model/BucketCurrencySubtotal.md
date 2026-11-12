# com.finbourne.sdk.services.lusid.model.BucketCurrencySubtotal
classname BucketCurrencySubtotal
A bucket's balances for one payment currency, summed across portfolios and sub-holding keys.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the period the subtotal covers. | [optional] [default to OffsetDateTime]
**bucketEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the period the subtotal covers. | [optional] [default to OffsetDateTime]
**currency** | **String** | The payment currency. | [optional] [default to String]
**open** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**activityTotal** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**close** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BucketCurrencySubtotal;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime bucketStart = OffsetDateTime.now();
OffsetDateTime bucketEnd = OffsetDateTime.now();
@javax.annotation.Nullable String currency = "example currency";
BucketAmounts open = new BucketAmounts();
BucketAmounts activityTotal = new BucketAmounts();
BucketAmounts close = new BucketAmounts();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BucketCurrencySubtotal bucketCurrencySubtotalInstance = new BucketCurrencySubtotal()
    .bucketStart(bucketStart)
    .bucketEnd(bucketEnd)
    .currency(currency)
    .open(open)
    .activityTotal(activityTotal)
    .close(close)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)