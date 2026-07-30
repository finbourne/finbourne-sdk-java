# com.finbourne.sdk.services.lusid.model.RecSubmission
classname RecSubmission
An entry in the append-only log of review submissions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The user who submitted the review. | [default to String]
**commentText** | **String** | An optional comment from the submitter. | [optional] [default to String]
**asAtSubmitted** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the submission was made. | [default to OffsetDateTime]
**asAtSuperseded** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this entry was superseded. Null when it is the current standing entry. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.RecSubmission;
import java.util.*;
import java.lang.System;
import java.net.URI;

String userId = "example userId";
@javax.annotation.Nullable String commentText = "example commentText";
OffsetDateTime asAtSubmitted = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAtSuperseded = OffsetDateTime.now();


RecSubmission recSubmissionInstance = new RecSubmission()
    .userId(userId)
    .commentText(commentText)
    .asAtSubmitted(asAtSubmitted)
    .asAtSuperseded(asAtSuperseded);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)