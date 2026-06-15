# com.finbourne.sdk.services.lusid.model.OptionEntry
classname OptionEntry
Strike price against par and associated date for a bond call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strike** | **java.math.BigDecimal** | The strike on this date | [default to java.math.BigDecimal]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the option can be actioned at this strike | [default to OffsetDateTime]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | If American exercise, this is the end of the exercise period.  Optional field. Defaults to the Date field if not set. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.OptionEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal strike = new java.math.BigDecimal("100.00");
OffsetDateTime date = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime endDate = OffsetDateTime.now();


OptionEntry optionEntryInstance = new OptionEntry()
    .strike(strike)
    .date(date)
    .endDate(endDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)