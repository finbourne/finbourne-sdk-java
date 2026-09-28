# com.finbourne.sdk.services.lusid.model.CoreAttributeOptionalityTolerance
classname CoreAttributeOptionalityTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**optionalSide** | **String** | Which side is allowed to have no value while still attempting to match. One of: Left, Right, Either. Defaults to Either. Available values: Left, Right, Either. | [optional] [default to String]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CoreAttributeOptionalityTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String optionalSide = "example optionalSide";
String toleranceType = "example toleranceType";
String ruleName = "example ruleName";


CoreAttributeOptionalityTolerance coreAttributeOptionalityToleranceInstance = new CoreAttributeOptionalityTolerance()
    .optionalSide(optionalSide)
    .toleranceType(toleranceType)
    .ruleName(ruleName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)