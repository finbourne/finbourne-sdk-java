# com.finbourne.sdk.services.lusid.model.RecInstanceId
classname RecInstanceId
Identifies a rec instance, and how it was created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceIdType** | **String** | How the instance was created. Available values: WorkflowServiceTaskId, Manual. | [default to String]
**instanceIdValue** | **String** | The instance identifier value (a GUID). | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecInstanceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instanceIdType = "example instanceIdType";
String instanceIdValue = "example instanceIdValue";


RecInstanceId recInstanceIdInstance = new RecInstanceId()
    .instanceIdType(instanceIdType)
    .instanceIdValue(instanceIdValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)