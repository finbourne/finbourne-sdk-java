# com.finbourne.sdk.services.lusid.model.RecReview
classname RecReview
A summary of the per-result review state across the result set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countReviewed** | **Integer** | The number of results with review status Reviewed. | [default to Integer]
**countRequired** | **Integer** | The number of results with review status Required. | [default to Integer]
**countNotRequired** | **Integer** | The number of results with review status Not Required. | [default to Integer]
**completionRatio** | **java.math.BigDecimal** | Reviewed / (Reviewed + Required). Is 1.0 when the denominator is zero, and null when execution failed. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.RecReview;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer countReviewed = new Integer("100.00");
Integer countRequired = new Integer("100.00");
Integer countNotRequired = new Integer("100.00");
java.math.BigDecimal completionRatio = new java.math.BigDecimal("100.00");


RecReview recReviewInstance = new RecReview()
    .countReviewed(countReviewed)
    .countRequired(countRequired)
    .countNotRequired(countNotRequired)
    .completionRatio(completionRatio);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)