# com.finbourne.sdk.services.workflow.model.LauncherMapping
classname LauncherMapping
A value a Launcher either gives as it is or takes from somewhere.              Exactly one of Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.LauncherMapping.SetTo or Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.LauncherMapping.MapFrom must be given. Only an Event Launcher has an event to take a value from, so a Schedule Launcher can only use Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.LauncherMapping.SetTo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**setTo** | **String** | The value to use, given as it is | [optional] [default to String]
**mapFrom** | **String** | The path the value is taken from, for example header.userId | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.LauncherMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String setTo = "example setTo";
@javax.annotation.Nullable String mapFrom = "example mapFrom";


LauncherMapping launcherMappingInstance = new LauncherMapping()
    .setTo(setTo)
    .mapFrom(mapFrom);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)