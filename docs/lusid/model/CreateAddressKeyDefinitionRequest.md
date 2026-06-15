# com.finbourne.sdk.services.lusid.model.CreateAddressKeyDefinitionRequest
classname CreateAddressKeyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressKey** | **String** | The address key of the address key definition. | [default to String]
**type** | **String** | The type of the address key definition. Available values: Text, Integer, Decimal, Boolean, DateTime, Result0D. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateAddressKeyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String addressKey = "example addressKey";
String type = "example type";


CreateAddressKeyDefinitionRequest createAddressKeyDefinitionRequestInstance = new CreateAddressKeyDefinitionRequest()
    .addressKey(addressKey)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)