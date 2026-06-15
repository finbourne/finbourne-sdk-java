# com.finbourne.sdk.services.lusid.model.UpsertFlowConventionsRequest
classname UpsertFlowConventionsRequest
Flow conventions that is to be stored in the convention data store.  Only one of these must be present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]

```java
import com.finbourne.sdk.services.lusid.model.UpsertFlowConventionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

FlowConventions flowConventions = new FlowConventions();


UpsertFlowConventionsRequest upsertFlowConventionsRequestInstance = new UpsertFlowConventionsRequest()
    .flowConventions(flowConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)