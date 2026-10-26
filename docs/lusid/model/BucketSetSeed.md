# com.finbourne.sdk.services.lusid.model.BucketSetSeed
classname BucketSetSeed
The closing balances seeded for a bucket set on a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketSetCode** | **String** | The code of the seeded bucket set on the fund configuration. | [default to String]
**classSeeds** | [**List&lt;BucketSetClassSeed&gt;**](BucketSetClassSeed.md) | The bucket set&#39;s seeded closing balances at the valuation point, per share class. They replace everything the bucket set holds up to and including the valuation point. A share class or bucket not listed is zero. | [default to List<BucketSetClassSeed>]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetSeed;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bucketSetCode = "example bucketSetCode";
List<BucketSetClassSeed> classSeeds = new List<BucketSetClassSeed>();


BucketSetSeed bucketSetSeedInstance = new BucketSetSeed()
    .bucketSetCode(bucketSetCode)
    .classSeeds(classSeeds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)