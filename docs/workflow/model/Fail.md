# com.finbourne.sdk.services.workflow.model.Fail
classname Fail
Configuration for a Worker that always Fails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.Fail;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


Fail failInstance = new Fail()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)