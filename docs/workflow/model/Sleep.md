# com.finbourne.sdk.services.workflow.model.Sleep
classname Sleep
Configuration for a Worker that Sleeps for a user-defined amount of time

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.Sleep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


Sleep sleepInstance = new Sleep()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)