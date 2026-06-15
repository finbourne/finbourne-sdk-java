# com.finbourne.sdk.services.lusid.model.ResultValueDecimal
classname ResultValueDecimal
A simple result for a decimal value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**value** | **java.math.BigDecimal** | The value itself | [optional] [default to java.math.BigDecimal]
**dimension** | **Integer** | The dimension of the result. Can be null if there is no sensible way of defining the dimension. This field should not be  populate by the user on upsertion. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.ResultValueDecimal;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal value = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Integer dimension = new Integer("100.00");


ResultValueDecimal resultValueDecimalInstance = new ResultValueDecimal()
    .value(value)
    .dimension(dimension);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)