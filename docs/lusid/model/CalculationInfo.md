# com.finbourne.sdk.services.lusid.model.CalculationInfo
classname CalculationInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationMethod** | **String** | Method of calculating the fees or commission among: BasisPoints, Percentage, Rate, Flat etc. Available values: Rate, BasisPoints, Percentage, Flat. | [default to String]
**multiplier** | **String** | Field by which to multiply the numerical amount. Available values: None, Quantity, Value. | [default to String]
**calculationAmount** | **java.math.BigDecimal** | Numerical fee amount | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CalculationInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

String calculationMethod = "example calculationMethod";
String multiplier = "example multiplier";
java.math.BigDecimal calculationAmount = new java.math.BigDecimal("100.00");


CalculationInfo calculationInfoInstance = new CalculationInfo()
    .calculationMethod(calculationMethod)
    .multiplier(multiplier)
    .calculationAmount(calculationAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)