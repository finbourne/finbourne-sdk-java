# com.finbourne.sdk.services.workflow.model.Worker
classname Worker
Information about the Worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**workerConfiguration** | [**WorkerConfigurationResponse**](WorkerConfigurationResponse.md) |  | [default to WorkerConfigurationResponse]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**parameters** | [**List&lt;Parameter&gt;**](Parameter.md) | The Parameters this Worker accepts or requires. | [optional] [default to List<Parameter>]
**resultFields** | [**List&lt;ResultField&gt;**](ResultField.md) | The Fields that the Worker results will come back with. | [optional] [default to List<ResultField>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.workflow.model.Worker;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
WorkerConfigurationResponse workerConfiguration = new WorkerConfigurationResponse();
VersionInfo version = new VersionInfo();
@javax.annotation.Nullable List<Parameter> parameters = new List<Parameter>();
@javax.annotation.Nullable List<ResultField> resultFields = new List<ResultField>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Worker workerInstance = new Worker()
    .id(id)
    .displayName(displayName)
    .description(description)
    .workerConfiguration(workerConfiguration)
    .version(version)
    .parameters(parameters)
    .resultFields(resultFields)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)