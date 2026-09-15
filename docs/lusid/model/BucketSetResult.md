# com.finbourne.sdk.services.lusid.model.BucketSetResult
classname BucketSetResult
A valuation point's results for one bucket set: whether the set is the apportionment set, and its per-node  (fund and share class) buckets and NAV. Allocation-group nodes are not included here - they are surfaced via  the apportionment results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketSetCode** | **String** | The code of the fund configuration&#39;s bucket set definition these results were produced from. Empty for a fund valued from component filters, which has no bucket set definition to name. | [default to String]
**isApportionment** | **Boolean** | Whether this bucket set is the apportionment set (apportioning non-class-specific P&amp;L across share classes). | [default to Boolean]
**nodes** | [**List&lt;BucketSetNode&gt;**](BucketSetNode.md) | The nodes making up the bucket set: the fund aggregate and one per share class. | [default to List<BucketSetNode>]
**displayName** | **String** | The display name of the bucket set, as configured on the fund configuration. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bucketSetCode = "example bucketSetCode";
Boolean isApportionment = true;
List<BucketSetNode> nodes = new List<BucketSetNode>();
@javax.annotation.Nullable String displayName = "example displayName";


BucketSetResult bucketSetResultInstance = new BucketSetResult()
    .bucketSetCode(bucketSetCode)
    .isApportionment(isApportionment)
    .nodes(nodes)
    .displayName(displayName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)