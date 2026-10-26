# com.finbourne.sdk.services.horizon.model.ValidationNoticeResponse
classname ValidationNoticeResponse
A non-blocking finding raised when an instance was saved. The save succeeded regardless.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**severity** | **String** | \&quot;Warning\&quot; or \&quot;Information\&quot;. | [default to String]
**field** | **String** | The configuration field the finding relates to. | [default to String]
**message** | **String** | What was found. | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ValidationNoticeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String severity = "example severity";
String field = "example field";
String message = "example message";


ValidationNoticeResponse validationNoticeResponseInstance = new ValidationNoticeResponse()
    .severity(severity)
    .field(field)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)