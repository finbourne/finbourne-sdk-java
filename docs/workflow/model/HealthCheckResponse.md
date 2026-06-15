# com.finbourne.sdk.services.workflow.model.HealthCheckResponse
classname HealthCheckResponse
Readonly configuration for a Worker that performs a GET against a given Url.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**url** | **String** | The URL to check, eg: https://www.google.com/ | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.HealthCheckResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String url = "example url";


HealthCheckResponse healthCheckResponseInstance = new HealthCheckResponse()
    .type(type)
    .url(url);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)