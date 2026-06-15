# com.finbourne.sdk.services.lusid.model.ResultValueDictionary
classname ResultValueDictionary
Result value for a collection of key-value pairs. Used for diagnostics associated to a cash flow, etc.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**elements** | [**Map&lt;String, ResultValue&gt;**](ResultValue.md) | The dictionary elements | [optional] [default to Map<String, ResultValue>]

```java
import com.finbourne.sdk.services.lusid.model.ResultValueDictionary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, ResultValue> elements = new Map<String, ResultValue>();


ResultValueDictionary resultValueDictionaryInstance = new ResultValueDictionary()
    .elements(elements);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)