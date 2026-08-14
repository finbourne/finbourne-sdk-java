# com.finbourne.sdk.services.lusid.model.SupplementalAttributeValues
classname SupplementalAttributeValues
A supplemental attribute value carried on a rec result for context. Does not contribute to matching.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The name of the supplemental attribute. | [default to String]
**leftValue** | **String** | The left-side value. | [optional] [default to String]
**rightValue** | **String** | The right-side value. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SupplementalAttributeValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

String attributeName = "example attributeName";
@javax.annotation.Nullable String leftValue = "example leftValue";
@javax.annotation.Nullable String rightValue = "example rightValue";


SupplementalAttributeValues supplementalAttributeValuesInstance = new SupplementalAttributeValues()
    .attributeName(attributeName)
    .leftValue(leftValue)
    .rightValue(rightValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)