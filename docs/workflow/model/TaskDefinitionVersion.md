# com.finbourne.sdk.services.workflow.model.TaskDefinitionVersion
classname TaskDefinitionVersion
The version of the Task Definition used by this Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the Task Definition used by this Task | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.workflow.model.TaskDefinitionVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAtModified = OffsetDateTime.now();


TaskDefinitionVersion taskDefinitionVersionInstance = new TaskDefinitionVersion()
    .asAtModified(asAtModified);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)