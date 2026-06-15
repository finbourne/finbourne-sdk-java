# com.finbourne.sdk.services.workflow.model.ValueConstraints
classname ValueConstraints
Constraints that should be applied to a Tasks fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constraintType** | **String** | Whether the constraint is a suggestion or should be enforced via validation (e.g. Suggested, Validated) | [default to String]
**valueSourceType** | **String** | The source of the acceptable values (e.g. AcceptableValues) | [default to String]
**acceptableValues** | **List&lt;Object&gt;** | The acceptable values for the field | [default to List<Object>]

```java
import com.finbourne.sdk.services.workflow.model.ValueConstraints;
import java.util.*;
import java.lang.System;
import java.net.URI;

String constraintType = "example constraintType";
String valueSourceType = "example valueSourceType";
List<Object> acceptableValues = new List<Object>();


ValueConstraints valueConstraintsInstance = new ValueConstraints()
    .constraintType(constraintType)
    .valueSourceType(valueSourceType)
    .acceptableValues(acceptableValues);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)