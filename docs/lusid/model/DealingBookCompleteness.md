# com.finbourne.sdk.services.lusid.model.DealingBookCompleteness
classname DealingBookCompleteness

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complete** | **Boolean** | Whether every share class&#39;s dealing cut-off had passed at the strike&#39;s as-at. True when no cut-off is configured. | [default to Boolean]
**cutOff** | [**OffsetDateTime**](OffsetDateTime.md) | The latest dealing cut-off among the share classes that configure one. Absent when none does. | [optional] [default to OffsetDateTime]
**lateNotCounted** | **Integer** | How many orders at the valuation point were written to the book after their class&#39;s cut-off and so were reported but not counted. Absent when a cut-off is configured but lateness could not be judged because an order at the valuation point carries no version. | [optional] [default to Integer]
**note** | **String** | Why the book was judged complete or incomplete: the cut-off that had or had not passed, or that none is configured and completeness was assumed. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DealingBookCompleteness;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean complete = true;
@javax.annotation.Nullable OffsetDateTime cutOff = OffsetDateTime.now();
@javax.annotation.Nullable Integer lateNotCounted = new Integer("100.00");
@javax.annotation.Nullable String note = "example note";


DealingBookCompleteness dealingBookCompletenessInstance = new DealingBookCompleteness()
    .complete(complete)
    .cutOff(cutOff)
    .lateNotCounted(lateNotCounted)
    .note(note);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)