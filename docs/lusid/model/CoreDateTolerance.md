# com.finbourne.sdk.services.lusid.model.CoreDateTolerance
classname CoreDateTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceSide** | **String** | Reference side (source of truth). One of: Left, Right. Available values: Left, Right. | [default to String]
**interval** | **String** | The allowed tolerance for date time core rule values, defined as an ISO Period. | [default to String]
**offset** | **String** | How the interval should be applied to the reference side value. One of: Earlier, Later, Either. Defaults to Either. Available values: Earlier, Later, Either. | [optional] [default to String]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CoreDateTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String referenceSide = "example referenceSide";
String interval = "example interval";
@javax.annotation.Nullable String offset = "example offset";
String toleranceType = "example toleranceType";
String ruleName = "example ruleName";


CoreDateTolerance coreDateToleranceInstance = new CoreDateTolerance()
    .referenceSide(referenceSide)
    .interval(interval)
    .offset(offset)
    .toleranceType(toleranceType)
    .ruleName(ruleName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)