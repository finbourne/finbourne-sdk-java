# com.finbourne.sdk.services.lusid.model.GeneratedEventDiagnostics
classname GeneratedEventDiagnostics
Represents a set of diagnostics per generatedEvent, where applicable.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventId** | **String** |  | [default to String]
**type** | **String** | Available values: MarketDataFailure, TransactionFailure, EventCombinationFailure, RepodOutHolding, ScheduleFailure. | [default to String]
**detail** | **String** |  | [default to String]
**errorDetails** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.GeneratedEventDiagnostics;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentEventId = "example instrumentEventId";
String type = "example type";
String detail = "example detail";
List<String> errorDetails = new List<String>();


GeneratedEventDiagnostics generatedEventDiagnosticsInstance = new GeneratedEventDiagnostics()
    .instrumentEventId(instrumentEventId)
    .type(type)
    .detail(detail)
    .errorDetails(errorDetails);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)