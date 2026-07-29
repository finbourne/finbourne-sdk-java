# com.finbourne.sdk.services.lusid.model.BucketSetResultBucket
classname BucketSetResultBucket
One bucket's values within a bucket set node: the movement in the period plus the cumulative values before  and after it (CumulativeValue = Value + PreviousCumulativeValue).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The identifier of the bucket. | [default to String]
**bucketType** | **String** | The type of the bucket (for example Dealing or PnL). | [default to String]
**value** | **java.math.BigDecimal** | The movement in the bucket over the valuation point&#39;s period. | [default to java.math.BigDecimal]
**previousCumulativeValue** | **java.math.BigDecimal** | The cumulative value of the bucket up to the start of the period. | [default to java.math.BigDecimal]
**cumulativeValue** | **java.math.BigDecimal** | The cumulative value of the bucket up to the end of the period (Value + PreviousCumulativeValue). | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetResultBucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bucketId = "example bucketId";
String bucketType = "example bucketType";
java.math.BigDecimal value = new java.math.BigDecimal("100.00");
java.math.BigDecimal previousCumulativeValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal cumulativeValue = new java.math.BigDecimal("100.00");


BucketSetResultBucket bucketSetResultBucketInstance = new BucketSetResultBucket()
    .bucketId(bucketId)
    .bucketType(bucketType)
    .value(value)
    .previousCumulativeValue(previousCumulativeValue)
    .cumulativeValue(cumulativeValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)