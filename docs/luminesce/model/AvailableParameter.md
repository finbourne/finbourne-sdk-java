# com.finbourne.sdk.services.luminesce.model.AvailableParameter
classname AvailableParameter
Information about a field that can be designed on (regardless if it currently is) Kind of a \"mini-available catalog entry\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerName** | **String** | Name of the Provider with a TableParameter | [default to String]
**parameterName** | **String** | Name of the TableParameter on the Provider | [default to String]
**fields** | [**List&lt;MappableField&gt;**](MappableField.md) | Fields that can be mapped to | [default to List<MappableField>]

```java
import com.finbourne.sdk.services.luminesce.model.AvailableParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String providerName = "example providerName";
String parameterName = "example parameterName";
List<MappableField> fields = new List<MappableField>();


AvailableParameter availableParameterInstance = new AvailableParameter()
    .providerName(providerName)
    .parameterName(parameterName)
    .fields(fields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)