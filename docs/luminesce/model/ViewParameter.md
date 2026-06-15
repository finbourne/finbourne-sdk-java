# com.finbourne.sdk.services.luminesce.model.ViewParameter
classname ViewParameter
Parameters of view

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the provider | [default to String]
**dataType** | [**DataType**](DataType.md) |  | [default to DataType]
**value** | **String** | Value of the provider | [default to String]
**isTableDataMandatory** | **Boolean** | Should this be selected? False would imply it is only being filtered on. Ignored when Aggregations are present | [optional] [default to Boolean]
**description** | **String** | Description of the parameter | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ViewParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
DataType String value = "example value";
Boolean isTableDataMandatory = true;
@javax.annotation.Nullable String description = "example description";


ViewParameter viewParameterInstance = new ViewParameter()
    .name(name)
    .dataType(dataType)
    .value(value)
    .isTableDataMandatory(isTableDataMandatory)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)