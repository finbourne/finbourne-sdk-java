# com.finbourne.sdk.services.lusid.model.BucketBorderConfiguration
classname BucketBorderConfiguration
Configuration determining how the borders of bucket intervals behave when allocating cash flows to buckets.  When supplied, cash flows are bucketed into intervals defined by the bucketing dates rather than being  rounded to the nearest bucketing date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startInclusive** | **Boolean** | Is the start of the first bucket interval inclusive of its start date. Defaults to true. | [optional] [default to Boolean]
**endInclusive** | **Boolean** | Is the end of the last bucket interval inclusive of its end date. Defaults to false. | [optional] [default to Boolean]
**boundaryBelongsTo** | **String** | For boundaries shared by two adjacent intervals, which interval a cash flow falling exactly on the  boundary belongs to. Supported string (enumeration) values are: [Earlier, Later]. Defaults to &#39;Earlier&#39;. Available values: Earlier, Later. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BucketBorderConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean startInclusive = true;
Boolean endInclusive = true;
@javax.annotation.Nullable String boundaryBelongsTo = "example boundaryBelongsTo";


BucketBorderConfiguration bucketBorderConfigurationInstance = new BucketBorderConfiguration()
    .startInclusive(startInclusive)
    .endInclusive(endInclusive)
    .boundaryBelongsTo(boundaryBelongsTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)