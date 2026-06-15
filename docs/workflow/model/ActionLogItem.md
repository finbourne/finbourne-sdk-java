# com.finbourne.sdk.services.workflow.model.ActionLogItem
classname ActionLogItem
A log item for a given Action Log

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the log item | [default to OffsetDateTime]
**logType** | **String** | The type of log item | [default to String]
**details** | **String** | The details of the log item | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ActionLogItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime timestamp = OffsetDateTime.now();
String logType = "example logType";
@javax.annotation.Nullable String details = "example details";


ActionLogItem actionLogItemInstance = new ActionLogItem()
    .timestamp(timestamp)
    .logType(logType)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)