# com.finbourne.sdk.services.horizon.model.ExternalLogInsertionRequest
classname ExternalLogInsertionRequest
A request to insert external log records.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logs** | [**List&lt;ExternalLogRecord&gt;**](ExternalLogRecord.md) | The collection of external log records to insert. | [default to List<ExternalLogRecord>]

```java
import com.finbourne.sdk.services.horizon.model.ExternalLogInsertionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ExternalLogRecord> logs = new List<ExternalLogRecord>();


ExternalLogInsertionRequest externalLogInsertionRequestInstance = new ExternalLogInsertionRequest()
    .logs(logs);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)