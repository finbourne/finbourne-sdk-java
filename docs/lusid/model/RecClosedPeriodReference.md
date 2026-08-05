# com.finbourne.sdk.services.lusid.model.RecClosedPeriodReference
classname RecClosedPeriodReference
A reference to a closed period created on a timeline when the instance was locked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timelineId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**closedPeriodId** | **String** | The identifier of the closed period. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecClosedPeriodReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId timelineId = new ResourceId();
String closedPeriodId = "example closedPeriodId";


RecClosedPeriodReference recClosedPeriodReferenceInstance = new RecClosedPeriodReference()
    .timelineId(timelineId)
    .closedPeriodId(closedPeriodId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)