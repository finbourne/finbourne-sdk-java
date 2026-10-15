# com.finbourne.sdk.services.lusid.model.AllocationEventNoticeEvent
classname AllocationEventNoticeEvent
The allocation event a notice is issued for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type of the allocation event. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the allocation event. | [default to OffsetDateTime]
**noticeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the notice is issued. | [optional] [default to OffsetDateTime]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the payment is due. | [optional] [default to OffsetDateTime]
**status** | **String** | The status of the allocation event. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventNoticeEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String type = "example type";
OffsetDateTime eventDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime noticeDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime dueDate = OffsetDateTime.now();
String status = "example status";


AllocationEventNoticeEvent allocationEventNoticeEventInstance = new AllocationEventNoticeEvent()
    .id(id)
    .type(type)
    .eventDate(eventDate)
    .noticeDate(noticeDate)
    .dueDate(dueDate)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)