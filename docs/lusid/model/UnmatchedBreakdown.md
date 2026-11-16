# com.finbourne.sdk.services.lusid.model.UnmatchedBreakdown
classname UnmatchedBreakdown
What a reserved unmatched sub-bucket holds: the amount routed to it and how many journal entry lines matched no  bucket filter to produce it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**noFilterMatch** | **java.math.BigDecimal** | The amount in the bucket over the period from journal entry lines that matched no bucket&#39;s filter. | [default to java.math.BigDecimal]
**noFilterMatchCount** | **Integer** | How many journal entry lines produced that amount. On a share class node it counts the lines booked to the class and the fund-level and allocation group lines it takes a share of; on the fund node it counts every line once. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.UnmatchedBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal noFilterMatch = new java.math.BigDecimal("100.00");
Integer noFilterMatchCount = new Integer("100.00");


UnmatchedBreakdown unmatchedBreakdownInstance = new UnmatchedBreakdown()
    .noFilterMatch(noFilterMatch)
    .noFilterMatchCount(noFilterMatchCount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)