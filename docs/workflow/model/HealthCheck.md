# com.finbourne.sdk.services.workflow.model.HealthCheck
classname HealthCheck
Configuration for a Worker that performs a GET against a given Url.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**url** | [**URI**](URI.md) | The URL to check, eg: https://www.google.com/ | [default to URI]

```java
import com.finbourne.sdk.services.workflow.model.HealthCheck;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
URI url = URI.create("http://example.com/url");


HealthCheck healthCheckInstance = new HealthCheck()
    .type(type)
    .url(url);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)