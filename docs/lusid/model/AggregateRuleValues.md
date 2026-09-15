# com.finbourne.sdk.services.lusid.model.AggregateRuleValues
classname AggregateRuleValues
An aggregate matching rule and its values. The difference is the measured magnitude compared against  any applied tolerance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleName** | **String** | The name of the rule. | [default to String]
**leftValue** | **String** | The left-side value. | [optional] [default to String]
**rightValue** | **String** | The right-side value. | [optional] [default to String]
**difference** | **String** | The measured magnitude of the difference, ToString(ABS(leftValue - rightValue)). | [optional] [default to String]
**appliedTolerance** | [**ToleranceBase**](ToleranceBase.md) |  | [optional] [default to ToleranceBase]

```java
import com.finbourne.sdk.services.lusid.model.AggregateRuleValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleName = "example ruleName";
@javax.annotation.Nullable String leftValue = "example leftValue";
@javax.annotation.Nullable String rightValue = "example rightValue";
@javax.annotation.Nullable String difference = "example difference";
ToleranceBase appliedTolerance = new ToleranceBase();


AggregateRuleValues aggregateRuleValuesInstance = new AggregateRuleValues()
    .ruleName(ruleName)
    .leftValue(leftValue)
    .rightValue(rightValue)
    .difference(difference)
    .appliedTolerance(appliedTolerance);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)