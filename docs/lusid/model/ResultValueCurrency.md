# com.finbourne.sdk.services.lusid.model.ResultValueCurrency
classname ResultValueCurrency
A simple result for a currency value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**value** | **String** | The value itself | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResultValueCurrency;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String value = "example value";


ResultValueCurrency resultValueCurrencyInstance = new ResultValueCurrency()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)