# com.finbourne.sdk.services.lusid.model.ResultValueBool
classname ResultValueBool
A simple result for a boolean value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**value** | **Boolean** | The value itself | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ResultValueBool;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean value = true;


ResultValueBool resultValueBoolInstance = new ResultValueBool()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)