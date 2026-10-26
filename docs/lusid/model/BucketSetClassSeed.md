# com.finbourne.sdk.services.lusid.model.BucketSetClassSeed
classname BucketSetClassSeed
One share class's seeded bucket values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** | The short code of the seeded share class. | [default to String]
**buckets** | [**List&lt;BucketSeedValue&gt;**](BucketSeedValue.md) | The seeded buckets of the share class. | [default to List<BucketSeedValue>]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetClassSeed;
import java.util.*;
import java.lang.System;
import java.net.URI;

String shareClassShortCode = "example shareClassShortCode";
List<BucketSeedValue> buckets = new List<BucketSeedValue>();


BucketSetClassSeed bucketSetClassSeedInstance = new BucketSetClassSeed()
    .shareClassShortCode(shareClassShortCode)
    .buckets(buckets);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)