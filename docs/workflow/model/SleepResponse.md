# com.finbourne.sdk.services.workflow.model.SleepResponse
classname SleepResponse
Configuration for a Worker that Sleeps for a user-defined amount of time

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.SleepResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


SleepResponse sleepResponseInstance = new SleepResponse()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)