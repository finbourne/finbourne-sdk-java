# com.finbourne.sdk.services.lusid.model.CoreToleranceBase
classname CoreToleranceBase
Abstract base for tolerances that apply to core matching rules. Distinguishes core tolerances from  aggregate tolerances at the type level (both share a common tolerance base).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CoreToleranceBase;
import java.util.*;
import java.lang.System;
import java.net.URI;

String toleranceType = "example toleranceType";
String ruleName = "example ruleName";


CoreToleranceBase coreToleranceBaseInstance = new CoreToleranceBase()
    .toleranceType(toleranceType)
    .ruleName(ruleName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)