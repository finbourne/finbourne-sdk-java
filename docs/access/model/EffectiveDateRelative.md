# com.finbourne.sdk.services.access.model.EffectiveDateRelative
classname EffectiveDateRelative

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**PointInTimeSpecification**](PointInTimeSpecification.md) |  | [optional] [default to PointInTimeSpecification]
**adjustment** | **Integer** |  | [optional] [default to Integer]
**unit** | [**DateUnit**](DateUnit.md) |  | [optional] [default to DateUnit]
**relativeToDateTime** | [**RelativeToDateTime**](RelativeToDateTime.md) |  | [optional] [default to RelativeToDateTime]

```java
import com.finbourne.sdk.services.access.model.EffectiveDateRelative;
import java.util.*;
import java.lang.System;
import java.net.URI;

PointInTimeSpecification Integer adjustment = new Integer("100.00");
DateUnit RelativeToDateTime 

EffectiveDateRelative effectiveDateRelativeInstance = new EffectiveDateRelative()
    .date(date)
    .adjustment(adjustment)
    .unit(unit)
    .relativeToDateTime(relativeToDateTime);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)