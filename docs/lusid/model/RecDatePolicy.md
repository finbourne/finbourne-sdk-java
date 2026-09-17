# com.finbourne.sdk.services.lusid.model.RecDatePolicy
classname RecDatePolicy
The date policy of a rec definition: how the effective dates of successive instances may progress, whether each  side reconciles at the latest knowledge or at a pinned asAt, and — for activity-based rec types — how the  activity window is bounded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAtProgression** | **String** | How the effective dates of successive instances may progress. Series (the default): each instance&#39;s leftEffectiveAt and rightEffectiveAt must be strictly after the previous instance&#39;s. Unconstrained: no relationship between instances. Immutable once the definition has instances. Available values: Series, Unconstrained. | [optional] [default to String]
**asAtPolicy** | [**RecAsAtPolicy**](RecAsAtPolicy.md) |  | [optional] [default to RecAsAtPolicy]
**activityWindow** | [**RecActivityWindow**](RecActivityWindow.md) |  | [optional] [default to RecActivityWindow]

```java
import com.finbourne.sdk.services.lusid.model.RecDatePolicy;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String effectiveAtProgression = "example effectiveAtProgression";
RecAsAtPolicy asAtPolicy = new RecAsAtPolicy();
RecActivityWindow activityWindow = new RecActivityWindow();


RecDatePolicy recDatePolicyInstance = new RecDatePolicy()
    .effectiveAtProgression(effectiveAtProgression)
    .asAtPolicy(asAtPolicy)
    .activityWindow(activityWindow);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)