# com.finbourne.sdk.services.workflow.model.LauncherResponse
classname LauncherResponse
A Launcher, which starts a run of one Workflow either at the times a schedule gives or when a matching event arrives

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workflowId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**launcherId** | **String** | The identifier of this Launcher inside its Workflow | [default to String]
**displayName** | **String** | Human-readable name | [default to String]
**description** | **String** | Human-readable description | [optional] [default to String]
**status** | **String** | The current status of the Launcher. One of - Active, Inactive | [default to String]
**launcherDetails** | [**LauncherDetailsResponse**](LauncherDetailsResponse.md) |  | [default to LauncherDetailsResponse]
**summaries** | [**LauncherSummaries**](LauncherSummaries.md) |  | [optional] [default to LauncherSummaries]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]

```java
import com.finbourne.sdk.services.workflow.model.LauncherResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId workflowId = new ResourceId();
String launcherId = "example launcherId";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String status = "example status";
LauncherDetailsResponse launcherDetails = new LauncherDetailsResponse();
LauncherSummaries summaries = new LauncherSummaries();
VersionInfo version = new VersionInfo();


LauncherResponse launcherResponseInstance = new LauncherResponse()
    .workflowId(workflowId)
    .launcherId(launcherId)
    .displayName(displayName)
    .description(description)
    .status(status)
    .launcherDetails(launcherDetails)
    .summaries(summaries)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)