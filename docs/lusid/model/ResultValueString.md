# com.finbourne.sdk.services.lusid.model.ResultValueString
classname ResultValueString
A simple result value holding a string

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**value** | **String** | the value itself | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResultValueString;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String value = "example value";


ResultValueString resultValueStringInstance = new ResultValueString()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)