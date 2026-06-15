# com.finbourne.sdk.services.lusid.model.PropertyValueEquals
classname PropertyValueEquals
A criterion that checks whether a Property Value is equal to the given string value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterionType** | **String** | Available values: PropertyValueEquals, PropertyValueIn, SubHoldingKeyValueEquals. | [default to String]
**propertyKey** | **String** | The property key whose value will form the left-hand side of the operation | [default to String]
**value** | **String** | The value to be compared against | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PropertyValueEquals;
import java.util.*;
import java.lang.System;
import java.net.URI;

String propertyKey = "example propertyKey";
String value = "example value";


PropertyValueEquals propertyValueEqualsInstance = new PropertyValueEquals()
    .propertyKey(propertyKey)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)