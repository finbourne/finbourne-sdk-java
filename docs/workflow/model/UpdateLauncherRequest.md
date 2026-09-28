# com.finbourne.sdk.services.workflow.model.UpdateLauncherRequest
classname UpdateLauncherRequest
Contains information for updating a Launcher on a Workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Human-readable name | [default to String]
**description** | **String** | Human-readable description | [optional] [default to String]
**status** | **String** | The current status of the Launcher. One of - Active, Inactive | [default to String]
**launcherDetails** | [**LauncherDetails**](LauncherDetails.md) |  | [default to LauncherDetails]

```java
import com.finbourne.sdk.services.workflow.model.UpdateLauncherRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String status = "example status";
LauncherDetails launcherDetails = new LauncherDetails();


UpdateLauncherRequest updateLauncherRequestInstance = new UpdateLauncherRequest()
    .displayName(displayName)
    .description(description)
    .status(status)
    .launcherDetails(launcherDetails);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)