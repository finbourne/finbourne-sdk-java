# com.finbourne.sdk.services.notifications.model.Attempt
classname Attempt
Details of an attempt of delivery.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptNumber** | **Integer** | The attempt number of the delivery. | [default to Integer]
**attemptTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time that the delivery was attempted. | [default to OffsetDateTime]
**status** | [**AttemptStatus**](AttemptStatus.md) |  | [default to AttemptStatus]

```java
import com.finbourne.sdk.services.notifications.model.Attempt;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer attemptNumber = new Integer("100.00");
OffsetDateTime attemptTime = OffsetDateTime.now();
AttemptStatus status = new AttemptStatus();


Attempt attemptInstance = new Attempt()
    .attemptNumber(attemptNumber)
    .attemptTime(attemptTime)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)