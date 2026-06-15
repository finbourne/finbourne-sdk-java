# com.finbourne.sdk.services.lusid.model.CutLocalTime
classname CutLocalTime

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hours** | **Integer** |  | [optional] [default to Integer]
**minutes** | **Integer** |  | [optional] [default to Integer]
**seconds** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CutLocalTime;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer hours = new Integer("100.00");
Integer minutes = new Integer("100.00");
java.math.BigDecimal seconds = new java.math.BigDecimal("100.00");


CutLocalTime cutLocalTimeInstance = new CutLocalTime()
    .hours(hours)
    .minutes(minutes)
    .seconds(seconds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)