# com.finbourne.sdk.services.lusid.model.ResultValue
classname ResultValue
Base class for representing result values in LUSID.  This base class should not be directly instantiated; each supported ResultValueType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResultValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String resultValueType = "example resultValueType";


ResultValue resultValueInstance = new ResultValue()
    .resultValueType(resultValueType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)