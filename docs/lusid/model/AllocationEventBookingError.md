# com.finbourne.sdk.services.lusid.model.AllocationEventBookingError
classname AllocationEventBookingError
One posting a booking could not write.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The rule or write step that failed, for instance WriteFailed. | [optional] [default to String]
**id** | **String** | The identifier of the posting that could not be written. | [optional] [default to String]
**message** | **String** | What went wrong. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventBookingError;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String message = "example message";


AllocationEventBookingError allocationEventBookingErrorInstance = new AllocationEventBookingError()
    .code(code)
    .id(id)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)