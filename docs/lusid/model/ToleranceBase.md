# com.finbourne.sdk.services.lusid.model.ToleranceBase
classname ToleranceBase
Base class for the tolerances that relax how strictly a matching rule compares its two sides. Polymorphic  by ToleranceType; each supported type has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ToleranceBase;
import java.util.*;
import java.lang.System;
import java.net.URI;

String toleranceType = "example toleranceType";
String ruleName = "example ruleName";


ToleranceBase toleranceBaseInstance = new ToleranceBase()
    .toleranceType(toleranceType)
    .ruleName(ruleName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)