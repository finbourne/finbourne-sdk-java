# com.finbourne.sdk.services.lusid.model.RecAgedResult
classname RecAgedResult
A summary of a rec result in another instance, as at the stamp that first recorded it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the result within its instance, e.g. &#39;Holding-break-1&#39;. With instanceId, it fully qualifies the result. | [default to String]
**instanceId** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**runNumber** | **Integer** | The result&#39;s latest run as at the stamp that first recorded it. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the result&#39;s latest run as at the stamp that first recorded it. | [default to OffsetDateTime]
**firstRunSeen** | **Integer** | The run in which the result was first assigned its id. | [default to Integer]
**asAtFirstSeen** | [**OffsetDateTime**](OffsetDateTime.md) | The runAsAt of the run in which the result first appeared in its instance, the run numbered firstRunSeen. Written once: re-runs leave it unchanged. | [default to OffsetDateTime]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]
**exceptionStatus** | **String** | The result&#39;s exception status as at the stamp that first recorded it: Open or Closed. Available values: Open, Closed. | [default to String]
**closureType** | **String** | The result&#39;s exception closure type as at the stamp that first recorded it. Null while the exception is open. Available values: Cleared, Accepted, ForceMatched. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecAgedResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
RecInstanceId instanceId = new RecInstanceId();
Integer runNumber = new Integer("100.00");
OffsetDateTime runAsAt = OffsetDateTime.now();
Integer firstRunSeen = new Integer("100.00");
OffsetDateTime asAtFirstSeen = OffsetDateTime.now();
RecDatesReconciled datesReconciled = new RecDatesReconciled();
String exceptionStatus = "example exceptionStatus";
@javax.annotation.Nullable String closureType = "example closureType";


RecAgedResult recAgedResultInstance = new RecAgedResult()
    .id(id)
    .instanceId(instanceId)
    .runNumber(runNumber)
    .runAsAt(runAsAt)
    .firstRunSeen(firstRunSeen)
    .asAtFirstSeen(asAtFirstSeen)
    .datesReconciled(datesReconciled)
    .exceptionStatus(exceptionStatus)
    .closureType(closureType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)