# com.finbourne.sdk.services.lusid.model.RecResultReview
classname RecResultReview
The per-result review axis: the workflow state and the recorded review decision. Always present,  including on Match and Cross.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The review workflow state: NotRequired, Required or Reviewed. Available values: NotRequired, Required, Reviewed. | [default to String]
**decision** | **String** | The recorded review decision. Null until a decision is made. Available values: Acknowledge, FixAtSource, FixAsGroup, Accept, ForceMatch, Tolerate. | [optional] [default to String]
**decisionGroup** | [**RecResultDecisionGroup**](RecResultDecisionGroup.md) |  | [optional] [default to RecResultDecisionGroup]

```java
import com.finbourne.sdk.services.lusid.model.RecResultReview;
import java.util.*;
import java.lang.System;
import java.net.URI;

String status = "example status";
@javax.annotation.Nullable String decision = "example decision";
RecResultDecisionGroup decisionGroup = new RecResultDecisionGroup();


RecResultReview recResultReviewInstance = new RecResultReview()
    .status(status)
    .decision(decision)
    .decisionGroup(decisionGroup);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)