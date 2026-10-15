# com.finbourne.sdk.services.lusid.model.ProcessingGroup
classname ProcessingGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Processing Group. | [optional] [default to String]
**description** | **String** | A description for the Processing Group. | [optional] [default to String]
**schedule** | [**ProcessingGroupSchedule**](ProcessingGroupSchedule.md) |  | [optional] [default to ProcessingGroupSchedule]
**referenceListId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**workflowId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**resolvedReferenceList** | [**ReferenceList**](ReferenceList.md) |  | [optional] [default to ReferenceList]
**listExceptionFilter** | **String** | A filter selecting reference list items to exclude whenever this Processing Group resolves its reference list. Optional. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ProcessingGroup;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ProcessingGroupSchedule schedule = new ProcessingGroupSchedule();
ResourceId referenceListId = new ResourceId();
ResourceId workflowId = new ResourceId();
ReferenceList resolvedReferenceList = new ReferenceList();
@javax.annotation.Nullable String listExceptionFilter = "example listExceptionFilter";
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ProcessingGroup processingGroupInstance = new ProcessingGroup()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .schedule(schedule)
    .referenceListId(referenceListId)
    .workflowId(workflowId)
    .resolvedReferenceList(resolvedReferenceList)
    .listExceptionFilter(listExceptionFilter)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)