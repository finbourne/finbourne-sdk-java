# com.finbourne.sdk.services.lusid.model.CashFlowValueSet
classname CashFlowValueSet
Result value for a collection of cash flow values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**cashflows** | [**List&lt;CashFlowValue&gt;**](CashFlowValue.md) | The set of cash flows in the result | [optional] [default to List<CashFlowValue>]

```java
import com.finbourne.sdk.services.lusid.model.CashFlowValueSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<CashFlowValue> cashflows = new List<CashFlowValue>();


CashFlowValueSet cashFlowValueSetInstance = new CashFlowValueSet()
    .cashflows(cashflows);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)