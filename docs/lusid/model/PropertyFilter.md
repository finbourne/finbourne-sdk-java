# com.finbourne.sdk.services.lusid.model.PropertyFilter
classname PropertyFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The key that uniquely identifies a queryable address in Lusid. | [optional] [default to String]
**operator** | **String** | Available values: Equals, NotEquals, GreaterThan, GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, In, StartsWith. | [optional] [default to String]
**right** | **Object** |  | [optional] [default to Object]
**rightOperandType** | **String** | Available values: Absolute, Property. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PropertyFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String left = "example left";
String operator = "example operator";
@javax.annotation.Nullable Object String rightOperandType = "example rightOperandType";


PropertyFilter propertyFilterInstance = new PropertyFilter()
    .left(left)
    .operator(operator)
    .right(right)
    .rightOperandType(rightOperandType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)