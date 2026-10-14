# com.finbourne.sdk.services.workflow.model.LaunchedBy
classname LaunchedBy
The Launcher that started a run of a Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherId** | **String** | The ID of the Launcher inside its Workflow | [default to String]
**launcherType** | **String** | The type of Launcher. One of - Schedule, Event | [default to String]
**launcherAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The version.asAtModified of the Launcher definition that fired | [default to OffsetDateTime]
**firedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the Launcher fired. For a Schedule Launcher this is the scheduled trigger time, and for an Event Launcher it is the timestamp of the event | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.workflow.model.LaunchedBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

String launcherId = "example launcherId";
String launcherType = "example launcherType";
OffsetDateTime launcherAsAt = OffsetDateTime.now();
OffsetDateTime firedAt = OffsetDateTime.now();


LaunchedBy launchedByInstance = new LaunchedBy()
    .launcherId(launcherId)
    .launcherType(launcherType)
    .launcherAsAt(launcherAsAt)
    .firedAt(firedAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)