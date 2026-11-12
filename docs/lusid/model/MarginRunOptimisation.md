# com.finbourne.sdk.services.lusid.model.MarginRunOptimisation
classname MarginRunOptimisation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | How far the pass got. One of Pending, Completed, Skipped or Failed. | [default to String]
**recommendationCount** | **Integer** | How many recommendations the pass made. | [default to Integer]
**detail** | **String** | What the pass left out and why, or why it failed. Null when nothing was left out. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarginRunOptimisation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String status = "example status";
Integer recommendationCount = new Integer("100.00");
@javax.annotation.Nullable String detail = "example detail";


MarginRunOptimisation marginRunOptimisationInstance = new MarginRunOptimisation()
    .status(status)
    .recommendationCount(recommendationCount)
    .detail(detail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)