# com.finbourne.sdk.services.lusid.model.SimpleRoundingConvention
classname SimpleRoundingConvention
Certain bonds will follow certain rounding conventions.  For example, Thai government bonds will round accrued interest and cashflow values 2dp, whereas for  French government bonds, the rounding is to 7dp.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**precision** | **Integer** | The precision of the rounding. The decimal places or significant figures to which the rounding takes place.  Defaults to 0 if not set. | [optional] [default to Integer]
**roundingType** | **String** | The type of rounding.  Default value: None. Available values: None, Down, Up, Nearest. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SimpleRoundingConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer precision = new Integer("100.00");
@javax.annotation.Nullable String roundingType = "example roundingType";


SimpleRoundingConvention simpleRoundingConventionInstance = new SimpleRoundingConvention()
    .precision(precision)
    .roundingType(roundingType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)