# com.finbourne.sdk.services.lusid.model.CoreRuleValues
classname CoreRuleValues
A core matching rule and the values that pin a rec result to its reconciled position. These values  contribute to the result id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleName** | **String** | The name of the rule. | [default to String]
**leftValue** | **String** | The left-side value. | [optional] [default to String]
**rightValue** | **String** | The right-side value. | [optional] [default to String]
**appliedTolerance** | [**ToleranceBase**](ToleranceBase.md) |  | [optional] [default to ToleranceBase]

```java
import com.finbourne.sdk.services.lusid.model.CoreRuleValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleName = "example ruleName";
@javax.annotation.Nullable String leftValue = "example leftValue";
@javax.annotation.Nullable String rightValue = "example rightValue";
ToleranceBase appliedTolerance = new ToleranceBase();


CoreRuleValues coreRuleValuesInstance = new CoreRuleValues()
    .ruleName(ruleName)
    .leftValue(leftValue)
    .rightValue(rightValue)
    .appliedTolerance(appliedTolerance);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)