# com.finbourne.sdk.services.lusid.model.AddressKeyDefinition
classname AddressKeyDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressKey** | **String** | The address key of the address key definition. | [default to String]
**type** | **String** | The type of the address key definition. Available values: Text, Integer, Decimal, Boolean, DateTime, Result0D. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AddressKeyDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String addressKey = "example addressKey";
String type = "example type";
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AddressKeyDefinition addressKeyDefinitionInstance = new AddressKeyDefinition()
    .addressKey(addressKey)
    .type(type)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)