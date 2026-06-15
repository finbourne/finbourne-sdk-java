# com.finbourne.sdk.services.lusid.model.ComparisonAttributeValuePair
classname ComparisonAttributeValuePair

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | Comparison rule attribute name. | [default to String]
**value** | **String** | Computed value for the comparison rule attribute. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComparisonAttributeValuePair;
import java.util.*;
import java.lang.System;
import java.net.URI;

String attributeName = "example attributeName";
@javax.annotation.Nullable String value = "example value";


ComparisonAttributeValuePair comparisonAttributeValuePairInstance = new ComparisonAttributeValuePair()
    .attributeName(attributeName)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)