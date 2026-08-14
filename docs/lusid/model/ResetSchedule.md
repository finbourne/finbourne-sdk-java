# com.finbourne.sdk.services.lusid.model.ResetSchedule
classname ResetSchedule
The schedule on which the price return of the asset leg of a total return swap is observed and exchanged.  Each reset period pays the change in the asset's price over the period, sourced from quoted market data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]
**firstResetDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the first price reset. Optional; when absent the reset dates are rolled forward from the swap start date. | [optional] [default to OffsetDateTime]
**frequency** | **String** | The frequency at which the asset price is reset and the price return is exchanged, e.g. 3M. | [default to String]
**lastResetDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the last price reset. Optional; when absent the reset dates are rolled forward until the swap maturity date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.ResetSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

FlowConventions conventions = new FlowConventions();
@javax.annotation.Nullable OffsetDateTime firstResetDate = OffsetDateTime.now();
String frequency = "example frequency";
@javax.annotation.Nullable OffsetDateTime lastResetDate = OffsetDateTime.now();


ResetSchedule resetScheduleInstance = new ResetSchedule()
    .conventions(conventions)
    .firstResetDate(firstResetDate)
    .frequency(frequency)
    .lastResetDate(lastResetDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)