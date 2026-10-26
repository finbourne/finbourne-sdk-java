# com.finbourne.sdk.services.lusid.model.BucketSetSeedRequest
classname BucketSetSeedRequest
The closing balances to seed for a bucket set on an estimate valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketSetCode** | **String** | The code of the bucket set on the fund configuration to seed. | [default to String]
**classSeeds** | [**List&lt;BucketSetClassSeedRequest&gt;**](BucketSetClassSeedRequest.md) | The bucket set&#39;s closing balances at the valuation point, per share class. They replace everything the bucket set holds up to and including the valuation point. A share class or bucket left out is zero. | [default to List<BucketSetClassSeedRequest>]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetSeedRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bucketSetCode = "example bucketSetCode";
List<BucketSetClassSeedRequest> classSeeds = new List<BucketSetClassSeedRequest>();


BucketSetSeedRequest bucketSetSeedRequestInstance = new BucketSetSeedRequest()
    .bucketSetCode(bucketSetCode)
    .classSeeds(classSeeds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)