# com.finbourne.sdk.services.lusid.model.CoreStringCrossTolerance
classname CoreStringCrossTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceValue** | **String** | The value for the reference side. | [default to String]
**crossValue** | **String** | The value for the side other than the reference one. | [default to String]
**referenceSide** | **String** | Reference side (source of truth). One of: Left, Right. Available values: Left, Right, Either. | [optional] [default to String]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CoreStringCrossTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String referenceValue = "example referenceValue";
String crossValue = "example crossValue";
@javax.annotation.Nullable String referenceSide = "example referenceSide";
String toleranceType = "example toleranceType";
String ruleName = "example ruleName";


CoreStringCrossTolerance coreStringCrossToleranceInstance = new CoreStringCrossTolerance()
    .referenceValue(referenceValue)
    .crossValue(crossValue)
    .referenceSide(referenceSide)
    .toleranceType(toleranceType)
    .ruleName(ruleName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)