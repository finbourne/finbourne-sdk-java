# com.finbourne.sdk.services.insights.model.Bucket
classname Bucket
A single histogram bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The bucket&#39;s start time as a DateTimeOffset. | [optional] [default to OffsetDateTime]
**itemCount** | **Long** | The number of items in the bucket. | [optional] [default to Long]

```java
import com.finbourne.sdk.services.insights.model.Bucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startTime = OffsetDateTime.now();
Long itemCount = new Long("100.00");


Bucket bucketInstance = new Bucket()
    .startTime(startTime)
    .itemCount(itemCount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)