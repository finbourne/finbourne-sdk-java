# com.finbourne.sdk.services.lusid.model.SettlementCycle
classname SettlementCycle
The settlement cycle for an instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessDayOffset** | **Integer** |  | [default to Integer]
**calendars** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.SettlementCycle;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer businessDayOffset = new Integer("100.00");
List<ResourceId> calendars = new List<ResourceId>();


SettlementCycle settlementCycleInstance = new SettlementCycle()
    .businessDayOffset(businessDayOffset)
    .calendars(calendars);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)