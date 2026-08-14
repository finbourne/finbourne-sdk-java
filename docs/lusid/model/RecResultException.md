# com.finbourne.sdk.services.lusid.model.RecResultException
classname RecResultException
The exception lifecycle of a rec result. Present only for exception result types  (Break, PartialMatch, PartialCross); null for Match and Cross.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Whether the exception is Open or Closed. Available values: Open, Closed. | [default to String]
**closureType** | **String** | How the exception was closed. Non-null only when status is Closed. Available values: Cleared, Accepted, ForceMatched. | [optional] [default to String]
**asAtClosed** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt of the transaction that closed the exception. Non-null only when status is Closed. | [optional] [default to OffsetDateTime]
**asAtClosureInvalidated** | [**OffsetDateTime**](OffsetDateTime.md) | First-failure bookmark: the asAt at which a judgement closure&#39;s validity condition first failed against the latest run&#39;s data. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.RecResultException;
import java.util.*;
import java.lang.System;
import java.net.URI;

String status = "example status";
@javax.annotation.Nullable String closureType = "example closureType";
@javax.annotation.Nullable OffsetDateTime asAtClosed = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAtClosureInvalidated = OffsetDateTime.now();


RecResultException recResultExceptionInstance = new RecResultException()
    .status(status)
    .closureType(closureType)
    .asAtClosed(asAtClosed)
    .asAtClosureInvalidated(asAtClosureInvalidated);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)