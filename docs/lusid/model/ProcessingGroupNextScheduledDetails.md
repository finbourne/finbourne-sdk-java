# com.finbourne.sdk.services.lusid.model.ProcessingGroupNextScheduledDetails
classname ProcessingGroupNextScheduledDetails
The next scheduled occurrence of a Processing Group: the next execution date after the requested date,  together with the executed (resolved) contents of the reference list the Processing Group operates over.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextScheduleDate** | [**OffsetDateTime**](OffsetDateTime.md) | The next execution date strictly after the requested date. | [optional] [default to OffsetDateTime]
**resolvedReferenceList** | [**ReferenceList**](ReferenceList.md) |  | [optional] [default to ReferenceList]

```java
import com.finbourne.sdk.services.lusid.model.ProcessingGroupNextScheduledDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime nextScheduleDate = OffsetDateTime.now();
ReferenceList resolvedReferenceList = new ReferenceList();


ProcessingGroupNextScheduledDetails processingGroupNextScheduledDetailsInstance = new ProcessingGroupNextScheduledDetails()
    .nextScheduleDate(nextScheduleDate)
    .resolvedReferenceList(resolvedReferenceList);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)