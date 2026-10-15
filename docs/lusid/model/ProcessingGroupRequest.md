# com.finbourne.sdk.services.lusid.model.ProcessingGroupRequest
classname ProcessingGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Processing Group. Together with the scope this uniquely identifies the Processing Group. | [default to String]
**displayName** | **String** | The name of the Processing Group. | [default to String]
**description** | **String** | A description for the Processing Group. | [optional] [default to String]
**schedule** | [**ProcessingGroupSchedule**](ProcessingGroupSchedule.md) |  | [default to ProcessingGroupSchedule]
**referenceListId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**workflowId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**listExceptionFilter** | **String** | A filter selecting reference list items to exclude whenever this Processing Group resolves its reference list. Optional. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ProcessingGroupRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ProcessingGroupSchedule schedule = new ProcessingGroupSchedule();
ResourceId referenceListId = new ResourceId();
ResourceId workflowId = new ResourceId();
@javax.annotation.Nullable String listExceptionFilter = "example listExceptionFilter";


ProcessingGroupRequest processingGroupRequestInstance = new ProcessingGroupRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .schedule(schedule)
    .referenceListId(referenceListId)
    .workflowId(workflowId)
    .listExceptionFilter(listExceptionFilter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)