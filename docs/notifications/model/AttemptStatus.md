# com.finbourne.sdk.services.notifications.model.AttemptStatus
classname AttemptStatus
Status of the delivery attempt.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **String** | Result of the delivery. | [default to String]
**detailedMessage** | **String** | The detailed message from attempting to deliver the message. | [optional] [default to String]

```java
import com.finbourne.sdk.services.notifications.model.AttemptStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String result = "example result";
@javax.annotation.Nullable String detailedMessage = "example detailedMessage";


AttemptStatus attemptStatusInstance = new AttemptStatus()
    .result(result)
    .detailedMessage(detailedMessage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)