# com.finbourne.sdk.services.lusid.model.AccessMetadataValue
classname AccessMetadataValue
An access control value. Provider should only be used if you are a service provider licensing data. In that case  the provider value must match your domain.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** |  | [default to String]
**provider** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AccessMetadataValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";
@javax.annotation.Nullable String provider = "example provider";


AccessMetadataValue accessMetadataValueInstance = new AccessMetadataValue()
    .value(value)
    .provider(provider);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)