# com.finbourne.sdk.services.lusid.model.ResultValue0D
classname ResultValue0D
Result value representing a 0D result. These results can be equipped with a unit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**units** | **String** | Unit of the result | [optional] [default to String]
**value** | **java.math.BigDecimal** | The value of the result | [optional] [default to java.math.BigDecimal]
**dimension** | **Integer** | The dimension of the result. Can be null if there is no sensible way of defining the dimension. This field should not be  populate by the user on upsertion. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.ResultValue0D;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String units = "example units";
java.math.BigDecimal value = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Integer dimension = new Integer("100.00");


ResultValue0D resultValue0DInstance = new ResultValue0D()
    .units(units)
    .value(value)
    .dimension(dimension);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)