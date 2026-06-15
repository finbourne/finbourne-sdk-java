# com.finbourne.sdk.services.insights.model.Histogram
classname Histogram
A histogram showing an item's count in buckets of equal timespans.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buckets** | [**List&lt;Bucket&gt;**](Bucket.md) | An ordered list of the histogram buckets. | [optional] [default to List<Bucket>]

```java
import com.finbourne.sdk.services.insights.model.Histogram;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<Bucket> buckets = new List<Bucket>();


Histogram histogramInstance = new Histogram()
    .buckets(buckets);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)