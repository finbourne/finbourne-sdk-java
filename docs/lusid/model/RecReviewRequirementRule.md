# com.finbourne.sdk.services.lusid.model.RecReviewRequirementRule
classname RecReviewRequirementRule
What the results of one structural category need by way of review: the requirement they carry by default,  and an optional condition that flips it for the results it selects.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reviewRequirement** | **String** | Whether this category&#39;s results need reviewing. One of: Required, NotRequired. Available values: Required, NotRequired. | [default to String]
**overrideCondition** | **String** | A boolean expression over a rec result, e.g. \&quot;resultType eq &#39;Cross&#39;\&quot;. Where it holds for a result, that result is treated as the opposite of the category&#39;s reviewRequirement. Null means the requirement applies to every result in the category. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecReviewRequirementRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String reviewRequirement = "example reviewRequirement";
@javax.annotation.Nullable String overrideCondition = "example overrideCondition";


RecReviewRequirementRule recReviewRequirementRuleInstance = new RecReviewRequirementRule()
    .reviewRequirement(reviewRequirement)
    .overrideCondition(overrideCondition);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)