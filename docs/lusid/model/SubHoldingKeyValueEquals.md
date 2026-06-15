# com.finbourne.sdk.services.lusid.model.SubHoldingKeyValueEquals
classname SubHoldingKeyValueEquals
A criterion that checks whether a SubHoldingKey Value is equal to the given string value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterionType** | **String** | Available values: PropertyValueEquals, PropertyValueIn, SubHoldingKeyValueEquals. | [default to String]
**subHoldingKey** | **String** | The sub holding key whose value will form the left-hand side of the operation | [default to String]
**value** | **String** | The value to be compared against | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SubHoldingKeyValueEquals;
import java.util.*;
import java.lang.System;
import java.net.URI;

String subHoldingKey = "example subHoldingKey";
String value = "example value";


SubHoldingKeyValueEquals subHoldingKeyValueEqualsInstance = new SubHoldingKeyValueEquals()
    .subHoldingKey(subHoldingKey)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)