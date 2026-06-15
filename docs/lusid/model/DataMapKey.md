# com.finbourne.sdk.services.lusid.model.DataMapKey
classname DataMapKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | The version of the mappings. It is possible that a client will wish to update mappings over time. The version identifies the MAJOR.MINOR.PATCH version  of the mappings that the client assigns it. | [optional] [default to String]
**code** | **String** | A unique name to semantically identify the mapping set. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DataMapKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String version = "example version";
@javax.annotation.Nullable String code = "example code";


DataMapKey dataMapKeyInstance = new DataMapKey()
    .version(version)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)