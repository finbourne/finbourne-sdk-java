# com.finbourne.sdk.services.lusid.model.BucketSetNode
classname BucketSetNode
One node within a bucket set result: the fund aggregate or a single share class. Both carry NAV and buckets; the  capital ratio, the unit counts and the per-unit values are set only on share class nodes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeType** | **String** | The kind of node: the fund aggregate or a single share class. Available values: Fund, Class. | [default to String]
**shareClassShortCode** | **String** | The short code of the share class this node is for, or null for the fund node. | [optional] [default to String]
**nav** | **java.math.BigDecimal** | The net asset value at this node, in the fund currency, or null where it does not apply to the node type. | [optional] [default to java.math.BigDecimal]
**capitalRatio** | **java.math.BigDecimal** | The share class&#39;s capital ratio (its share of the fund NAV), set only on share class nodes. | [optional] [default to java.math.BigDecimal]
**buckets** | [**List&lt;BucketSetResultBucket&gt;**](BucketSetResultBucket.md) | The buckets on this node, each with its period movement and cumulative values. | [default to List<BucketSetResultBucket>]
**perUnitValue** | **java.math.BigDecimal** | The share class&#39;s NAV per unit in issue, in the fund currency, rounded to the share class&#39;s PricePrecision (left unrounded where the share class declares none). Reported only for a share class that is unitised and has units in issue to divide by. The dealing price - in the share class currency, with its instrument&#39;s rounding convention applied - is on the share class breakdown&#39;s unitisation data. | [optional] [default to java.math.BigDecimal]
**sharesInIssue** | **java.math.BigDecimal** | The share class&#39;s units in issue at the end of the period. Reported only for a share class that is unitised. | [optional] [default to java.math.BigDecimal]
**previousPerUnitValue** | **java.math.BigDecimal** | The share class&#39;s NAV per unit at the previous valuation point, on the same basis as PerUnitValue. | [optional] [default to java.math.BigDecimal]
**previousSharesInIssue** | **java.math.BigDecimal** | The share class&#39;s units in issue at the start of the period. Reported only for a share class that is unitised. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String nodeType = "example nodeType";
@javax.annotation.Nullable String shareClassShortCode = "example shareClassShortCode";
@javax.annotation.Nullable java.math.BigDecimal nav = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal capitalRatio = new java.math.BigDecimal("100.00");
List<BucketSetResultBucket> buckets = new List<BucketSetResultBucket>();
@javax.annotation.Nullable java.math.BigDecimal perUnitValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal sharesInIssue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal previousPerUnitValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal previousSharesInIssue = new java.math.BigDecimal("100.00");


BucketSetNode bucketSetNodeInstance = new BucketSetNode()
    .nodeType(nodeType)
    .shareClassShortCode(shareClassShortCode)
    .nav(nav)
    .capitalRatio(capitalRatio)
    .buckets(buckets)
    .perUnitValue(perUnitValue)
    .sharesInIssue(sharesInIssue)
    .previousPerUnitValue(previousPerUnitValue)
    .previousSharesInIssue(previousSharesInIssue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)