# com.finbourne.sdk.services.lusid.model.FxTenorConvention
classname FxTenorConvention
A wrapper of conventions that should be used when interpreting tenors in the context of FX.  For instance, can be used to control how tenors are interpreted on an FxForwardTenorCurveData instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarCode** | **String** | The code of the holiday calendar that should be used when interpreting FX tenors. | [default to String]
**spotDays** | **Integer** | The minimum number of business days that must pass within this calendar when calculating the spot date. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.FxTenorConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

String calendarCode = "example calendarCode";
Integer spotDays = new Integer("100.00");


FxTenorConvention fxTenorConventionInstance = new FxTenorConvention()
    .calendarCode(calendarCode)
    .spotDays(spotDays);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)