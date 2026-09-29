# com.finbourne.sdk.services.lusid.model.AggregateNumericTolerance
classname AggregateNumericTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceSide** | **String** | Reference side (source of truth). Available values: Left, Right. | [default to String]
**absoluteThreshold** | **java.math.BigDecimal** | Numeric tolerance absolute value (allowable diff compared to the reference side value). | [optional] [default to java.math.BigDecimal]
**relativeThreshold** | **java.math.BigDecimal** | Numeric tolerance value as a relative % of the reference value. | [optional] [default to java.math.BigDecimal]
**thresholdPriority** | **String** | Whether to apply the GreaterOf or LesserOf the absoluteThreshold vs relativeThreshold. Required when both thresholds are provided; must be omitted when only one is. Available values: GreaterOf, LesserOf. | [optional] [default to String]
**offset** | **String** | How the threshold should be applied to the reference side value. Defaults to Either. Available values: Above, Below, Either. | [optional] [default to String]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AggregateNumericTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String referenceSide = "example referenceSide";
@javax.annotation.Nullable java.math.BigDecimal absoluteThreshold = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal relativeThreshold = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String thresholdPriority = "example thresholdPriority";
@javax.annotation.Nullable String offset = "example offset";
String toleranceType = "example toleranceType";
String ruleName = "example ruleName";


AggregateNumericTolerance aggregateNumericToleranceInstance = new AggregateNumericTolerance()
    .referenceSide(referenceSide)
    .absoluteThreshold(absoluteThreshold)
    .relativeThreshold(relativeThreshold)
    .thresholdPriority(thresholdPriority)
    .offset(offset)
    .toleranceType(toleranceType)
    .ruleName(ruleName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)