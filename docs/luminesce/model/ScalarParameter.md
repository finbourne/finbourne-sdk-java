# com.finbourne.sdk.services.luminesce.model.ScalarParameter
classname ScalarParameter
Describes a scalar parameter as defined in the SQL

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the scalar parameter | [default to String]
**type** | [**DataType**](DataType.md) |  | [default to DataType]
**value** | **Object** | the default value of the parameter | [optional] [default to Object]
**valueOptions** | **List&lt;Object&gt;** | Values of the parameter listed as being available for choosing from. | [optional] [default to List<Object>]
**valueMustBeFromOptions** | **Boolean** | Must Value be one of ValueOptions (if any)? | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.ScalarParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
DataType @javax.annotation.Nullable Object @javax.annotation.Nullable List<Object> valueOptions = new List<Object>();
Boolean valueMustBeFromOptions = true;


ScalarParameter scalarParameterInstance = new ScalarParameter()
    .name(name)
    .type(type)
    .value(value)
    .valueOptions(valueOptions)
    .valueMustBeFromOptions(valueMustBeFromOptions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)