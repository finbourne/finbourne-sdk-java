# com.finbourne.sdk.services.lusid.model.AddressKeyOptionDefinition
classname AddressKeyOptionDefinition
The definition of an Address Key Option

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the option | [default to String]
**type** | **String** | The type of the option. Available values: Bool, Int, Decimal, DateTimeOffset, String, Enum, TimeZoneId, Invalid. | [default to String]
**description** | **String** | The description of the option | [default to String]
**optional** | **Boolean** | Is this option required or optional? | [default to Boolean]
**allowedValueSet** | **List&lt;String&gt;** | If the option is a string or enum, the allowed set of values it can take. | [optional] [default to List<String>]
**defaultValue** | **String** | If the option is not required, what is the default value? | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AddressKeyOptionDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String type = "example type";
String description = "example description";
Boolean optional = true;
@javax.annotation.Nullable List<String> allowedValueSet = new List<String>();
@javax.annotation.Nullable String defaultValue = "example defaultValue";


AddressKeyOptionDefinition addressKeyOptionDefinitionInstance = new AddressKeyOptionDefinition()
    .name(name)
    .type(type)
    .description(description)
    .optional(optional)
    .allowedValueSet(allowedValueSet)
    .defaultValue(defaultValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)