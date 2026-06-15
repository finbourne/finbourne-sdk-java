# com.finbourne.sdk.services.horizon.model.IIntegrationLogResponse
classname IIntegrationLogResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logId** | **Long** |  | [readonly] [default to Long]
**runId** | [**UUID**](UUID.md) |  | [optional] [readonly] [default to UUID]
**parentLogId** | **Long** |  | [optional] [readonly] [default to Long]
**logType** | **String** |  | [readonly] [default to String]
**firstActivity** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [readonly] [default to OffsetDateTime]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [readonly] [default to OffsetDateTime]
**status** | **String** |  | [optional] [readonly] [default to String]
**sourceRecord** | [**IntegrationLogRecord**](IntegrationLogRecord.md) |  | [optional] [default to IntegrationLogRecord]
**targetRecord** | [**IntegrationLogTargetRecord**](IntegrationLogTargetRecord.md) |  | [optional] [default to IntegrationLogTargetRecord]
**activities** | [**List&lt;IntegrationLogActivity&gt;**](IntegrationLogActivity.md) |  | [readonly] [default to List<IntegrationLogActivity>]

```java
import com.finbourne.sdk.services.horizon.model.IIntegrationLogResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long logId = new Long("100.00");
@javax.annotation.Nullable UUID runId = "example runId";
@javax.annotation.Nullable Long parentLogId = new Long("100.00");
String logType = "example logType";
@javax.annotation.Nullable OffsetDateTime firstActivity = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime lastActivity = OffsetDateTime.now();
@javax.annotation.Nullable String status = "example status";
IntegrationLogRecord sourceRecord = new IntegrationLogRecord();
IntegrationLogTargetRecord targetRecord = new IntegrationLogTargetRecord();
List<IntegrationLogActivity> activities = new List<IntegrationLogActivity>();


IIntegrationLogResponse iIntegrationLogResponseInstance = new IIntegrationLogResponse()
    .logId(logId)
    .runId(runId)
    .parentLogId(parentLogId)
    .logType(logType)
    .firstActivity(firstActivity)
    .lastActivity(lastActivity)
    .status(status)
    .sourceRecord(sourceRecord)
    .targetRecord(targetRecord)
    .activities(activities);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)