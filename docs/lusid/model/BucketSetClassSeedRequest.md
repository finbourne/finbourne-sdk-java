# com.finbourne.sdk.services.lusid.model.BucketSetClassSeedRequest
classname BucketSetClassSeedRequest
One share class's bucket values to seed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** | The short code of the seeded share class. | [default to String]
**buckets** | [**List&lt;BucketSeedValueRequest&gt;**](BucketSeedValueRequest.md) | The seeded buckets of the share class. Only the bucket set&#39;s flow buckets (dealing, P&amp;L and fees) accumulate, so only they can be seeded. | [default to List<BucketSeedValueRequest>]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetClassSeedRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String shareClassShortCode = "example shareClassShortCode";
List<BucketSeedValueRequest> buckets = new List<BucketSeedValueRequest>();


BucketSetClassSeedRequest bucketSetClassSeedRequestInstance = new BucketSetClassSeedRequest()
    .shareClassShortCode(shareClassShortCode)
    .buckets(buckets);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)