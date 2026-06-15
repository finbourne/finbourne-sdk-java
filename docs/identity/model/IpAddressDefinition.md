# com.finbourne.sdk.services.identity.model.IpAddressDefinition
classname IpAddressDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**value** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.identity.model.IpAddressDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String description = "example description";
String value = "example value";


IpAddressDefinition ipAddressDefinitionInstance = new IpAddressDefinition()
    .type(type)
    .description(description)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)