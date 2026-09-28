# com.finbourne.sdk.services.workflow.model.EventTaskFieldMapping
classname EventTaskFieldMapping
How an Event Launcher fills one field of the root task from the event that arrived

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The path into the event the value is taken from, for example header.timestamp | [default to String]
**dateTimeAdjustment** | [**DateTimeAdjustment**](DateTimeAdjustment.md) |  | [optional] [default to DateTimeAdjustment]

```java
import com.finbourne.sdk.services.workflow.model.EventTaskFieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String mapFrom = "example mapFrom";
DateTimeAdjustment dateTimeAdjustment = new DateTimeAdjustment();


EventTaskFieldMapping eventTaskFieldMappingInstance = new EventTaskFieldMapping()
    .mapFrom(mapFrom)
    .dateTimeAdjustment(dateTimeAdjustment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)