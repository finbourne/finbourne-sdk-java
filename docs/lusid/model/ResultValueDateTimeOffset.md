# com.finbourne.sdk.services.lusid.model.ResultValueDateTimeOffset
classname ResultValueDateTimeOffset
A simple result for a date time value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**value** | [**OffsetDateTime**](OffsetDateTime.md) | The value itself | [optional] [default to OffsetDateTime]
**dimension** | **Integer** | The dimension of the result. Can be null if there is no sensible way of defining the dimension. This field should not be  populate by the user on upsertion. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.ResultValueDateTimeOffset;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime value = OffsetDateTime.now();
@javax.annotation.Nullable Integer dimension = new Integer("100.00");


ResultValueDateTimeOffset resultValueDateTimeOffsetInstance = new ResultValueDateTimeOffset()
    .value(value)
    .dimension(dimension);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)