# com.finbourne.sdk.services.lusid.model.MarginCallReference
classname MarginCallReference
A pointer to a margin call in another run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run the referenced call belongs to. | [default to String]
**callId** | **String** | The business key of the referenced call. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarginCallReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String runId = "example runId";
String callId = "example callId";


MarginCallReference marginCallReferenceInstance = new MarginCallReference()
    .runId(runId)
    .callId(callId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)