# com.finbourne.sdk.services.luminesce.model.BackgroundQueryState
classname BackgroundQueryState

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BackgroundQueryState** | [**String**](.md) | **** | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.BackgroundQueryState;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of BackgroundQueryState:
BackgroundQueryState method = BackgroundQueryState.NEW;
BackgroundQueryState method = BackgroundQueryState.RUNNING;
BackgroundQueryState method = BackgroundQueryState.ERRORED;
BackgroundQueryState method = BackgroundQueryState.CANCELLED;
BackgroundQueryState method = BackgroundQueryState.EXECUTED;
BackgroundQueryState method = BackgroundQueryState.EXECUTED_NO_SERIALIZATION_REQUIRED;
BackgroundQueryState method = BackgroundQueryState.SERIALIZED;
BackgroundQueryState method = BackgroundQueryState.SERIALIZATION_FAILED;
BackgroundQueryState method = BackgroundQueryState.ATTEMPTING_TO_DESERIALIZE;
BackgroundQueryState method = BackgroundQueryState.LOADED;
BackgroundQueryState method = BackgroundQueryState.CLEARED;
BackgroundQueryState method = BackgroundQueryState.DISPOSED;
BackgroundQueryState method = BackgroundQueryState.OWNER_TERMINATED;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)