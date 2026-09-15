# com.finbourne.sdk.services.lusid.model.RecReviewSubmission
classname RecReviewSubmission
When the reviewer is allowed to submit their work for approval. Omit it to let them submit at any time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionRatioThreshold** | **java.math.BigDecimal** | The review completion ratio a result set has to reach before it can be submitted, between 0.0 and 1.0 inclusive. | [default to java.math.BigDecimal]
**autoSubmit** | **Boolean** | Whether the system submits on the reviewer&#39;s behalf as soon as the completion ratio threshold is met, rather than waiting to be asked. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.RecReviewSubmission;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal completionRatioThreshold = new java.math.BigDecimal("100.00");
Boolean autoSubmit = true;


RecReviewSubmission recReviewSubmissionInstance = new RecReviewSubmission()
    .completionRatioThreshold(completionRatioThreshold)
    .autoSubmit(autoSubmit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)