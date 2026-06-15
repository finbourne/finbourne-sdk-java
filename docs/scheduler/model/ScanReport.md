# com.finbourne.sdk.services.scheduler.model.ScanReport
classname ScanReport
Represents the details of a security scan of an image

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**severity** | **String** | The overall severity. For example : \&quot;High\&quot; or \&quot;None\&quot; | [optional] [default to String]
**status** | **String** | The status of the report | [optional] [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The start time of the scanning process | [optional] [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end time of the scanning process | [optional] [default to OffsetDateTime]
**scanDuration** | **Integer** | The duration of the scan in seconds | [optional] [default to Integer]
**summary** | [**ScanSummary**](ScanSummary.md) |  | [optional] [default to ScanSummary]
**vulnerabilities** | [**List&lt;Vulnerability&gt;**](Vulnerability.md) | List of Finbourne.Scheduler.WebApi.Dtos.Images.Vulnerability | [optional] [default to List<Vulnerability>]

```java
import com.finbourne.sdk.services.scheduler.model.ScanReport;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String severity = "example severity";
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable OffsetDateTime startTime = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime endTime = OffsetDateTime.now();
@javax.annotation.Nullable Integer scanDuration = new Integer("100.00");
ScanSummary summary = new ScanSummary();
@javax.annotation.Nullable List<Vulnerability> vulnerabilities = new List<Vulnerability>();


ScanReport scanReportInstance = new ScanReport()
    .severity(severity)
    .status(status)
    .startTime(startTime)
    .endTime(endTime)
    .scanDuration(scanDuration)
    .summary(summary)
    .vulnerabilities(vulnerabilities);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)