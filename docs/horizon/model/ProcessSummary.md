# com.finbourne.sdk.services.horizon.model.ProcessSummary
classname ProcessSummary
Completed event details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**category** | **String** |  | [optional] [default to String]
**status** | **String** |  | [default to String]
**message** | **String** |  | [default to String]
**rows** | [**RowDetails**](RowDetails.md) |  | [default to RowDetails]
**fileDetails** | [**List&lt;FileDetails&gt;**](FileDetails.md) |  | [optional] [default to List<FileDetails>]

```java
import com.finbourne.sdk.services.horizon.model.ProcessSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime endTime = OffsetDateTime.now();
@javax.annotation.Nullable String category = "example category";
String status = "example status";
String message = "example message";
RowDetails rows = new RowDetails();
@javax.annotation.Nullable List<FileDetails> fileDetails = new List<FileDetails>();


ProcessSummary processSummaryInstance = new ProcessSummary()
    .endTime(endTime)
    .category(category)
    .status(status)
    .message(message)
    .rows(rows)
    .fileDetails(fileDetails);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)