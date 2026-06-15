# com.finbourne.sdk.services.luminesce.model.BackgroundQueryCancelResponse
classname BackgroundQueryCancelResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hadData** | **Boolean** |  | [optional] [default to Boolean]
**previousStatus** | [**TaskStatus**](TaskStatus.md) |  | [optional] [default to TaskStatus]
**previousState** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**progress** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.BackgroundQueryCancelResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean hadData = true;
TaskStatus BackgroundQueryState @javax.annotation.Nullable String progress = "example progress";


BackgroundQueryCancelResponse backgroundQueryCancelResponseInstance = new BackgroundQueryCancelResponse()
    .hadData(hadData)
    .previousStatus(previousStatus)
    .previousState(previousState)
    .progress(progress);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)