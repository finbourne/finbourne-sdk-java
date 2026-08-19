# com.finbourne.sdk.services.lusid.model.SupplementalAttribute
classname SupplementalAttribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The reference name of the supplemental attribute. | [default to String]
**leftFormula** | **String** | Derivation formula evaluated against the left side of the reconciliation. | [default to String]
**rightFormula** | **String** | Derivation formula evaluated against the right side of the reconciliation. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SupplementalAttribute;
import java.util.*;
import java.lang.System;
import java.net.URI;

String attributeName = "example attributeName";
String leftFormula = "example leftFormula";
String rightFormula = "example rightFormula";


SupplementalAttribute supplementalAttributeInstance = new SupplementalAttribute()
    .attributeName(attributeName)
    .leftFormula(leftFormula)
    .rightFormula(rightFormula);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)