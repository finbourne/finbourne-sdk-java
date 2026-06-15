# com.finbourne.sdk.services.identity.model.AddScimResponse
classname AddScimResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseUrl** | [**URI**](URI.md) |  | [optional] [default to URI]
**apiToken** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.AddScimResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI baseUrl = URI.create("http://example.com/baseUrl");
@javax.annotation.Nullable String apiToken = "example apiToken";


AddScimResponse addScimResponseInstance = new AddScimResponse()
    .baseUrl(baseUrl)
    .apiToken(apiToken);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)