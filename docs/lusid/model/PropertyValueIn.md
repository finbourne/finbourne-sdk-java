# com.finbourne.sdk.services.lusid.model.PropertyValueIn
classname PropertyValueIn
A criterion that checks whether a Property Value is equal to one of the given string values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterionType** | **String** | Available values: PropertyValueEquals, PropertyValueIn, SubHoldingKeyValueEquals. | [default to String]
**propertyKey** | **String** | The property key whose value will form the left-hand side of the operation | [default to String]
**value** | **List&lt;String&gt;** | The value to be compared against | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.PropertyValueIn;
import java.util.*;
import java.lang.System;
import java.net.URI;

String propertyKey = "example propertyKey";
List<String> value = new List<String>();


PropertyValueIn propertyValueInInstance = new PropertyValueIn()
    .propertyKey(propertyKey)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)