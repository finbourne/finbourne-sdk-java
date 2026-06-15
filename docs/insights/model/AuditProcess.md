# com.finbourne.sdk.services.insights.model.AuditProcess
classname AuditProcess

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**runId** | **String** |  | [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**succeeded** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.insights.model.AuditProcess;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String runId = "example runId";
OffsetDateTime startTime = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime endTime = OffsetDateTime.now();
@javax.annotation.Nullable Boolean succeeded = true;


AuditProcess auditProcessInstance = new AuditProcess()
    .name(name)
    .runId(runId)
    .startTime(startTime)
    .endTime(endTime)
    .succeeded(succeeded);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)