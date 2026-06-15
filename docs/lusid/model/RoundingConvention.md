# com.finbourne.sdk.services.lusid.model.RoundingConvention
classname RoundingConvention
Certain bonds will follow certain rounding conventions.  For example, Thai government bonds will round accrued interest and cashflow values 2dp, whereas for  French government bonds, the rounding is to 7dp.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**faceValue** | **java.math.BigDecimal** | The face value to round against.  The number to be rounded is scaled to this face value before being rounded, and then re-scaled to the holding amount.  For example if rounding an accrued interest value using a FaceValue of 1,000, but 10,000 units are held,  then the initial calculated value would be divided by 10,000, then multiplied by 1,000 and rounded per the convention.  The result of this would then be divided by 1,000 and multiplied by 10,000 to get the final value. | [optional] [default to java.math.BigDecimal]
**precision** | **Integer** | The precision of the rounding.  The decimal places to which the rounding takes place.  Defaults to 0 if not set. | [optional] [default to Integer]
**roundingTarget** | **String** | The target of the rounding convention.    Default value: All. Available values: All, AccruedInterest, Cashflows. | [optional] [default to String]
**roundingType** | **String** | The type of rounding.  Default value: Nearest. Available values: None, Down, Up, Nearest. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RoundingConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal faceValue = new java.math.BigDecimal("100.00");
Integer precision = new Integer("100.00");
@javax.annotation.Nullable String roundingTarget = "example roundingTarget";
@javax.annotation.Nullable String roundingType = "example roundingType";


RoundingConvention roundingConventionInstance = new RoundingConvention()
    .faceValue(faceValue)
    .precision(precision)
    .roundingTarget(roundingTarget)
    .roundingType(roundingType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)