# com.finbourne.sdk.services.workflow.model.CorrelationIdMapping
classname CorrelationIdMapping
How an Event Launcher fills one correlation ID of the root task from the event that arrived.              A mapped correlation ID joins the fixed correlation IDs of the Launcher

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The path into the event the correlation ID is taken from, for example body.fileId | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.CorrelationIdMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String mapFrom = "example mapFrom";


CorrelationIdMapping correlationIdMappingInstance = new CorrelationIdMapping()
    .mapFrom(mapFrom);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)