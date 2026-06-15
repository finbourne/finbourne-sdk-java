# com.finbourne.sdk.services.lusid.model.CashFlowValue
classname CashFlowValue
Result class for a cash flow value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the cash flow | [default to OffsetDateTime]
**diagnostics** | [**ResultValueDictionary**](ResultValueDictionary.md) |  | [optional] [default to ResultValueDictionary]
**cashFlowLineage** | [**CashFlowLineage**](CashFlowLineage.md) |  | [optional] [default to CashFlowLineage]
**paymentAmount** | **java.math.BigDecimal** | The amount paid or received | [default to java.math.BigDecimal]
**paymentCcy** | **String** | The currency of the transaction | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CashFlowValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
ResultValueDictionary diagnostics = new ResultValueDictionary();
CashFlowLineage cashFlowLineage = new CashFlowLineage();
java.math.BigDecimal paymentAmount = new java.math.BigDecimal("100.00");
String paymentCcy = "example paymentCcy";


CashFlowValue cashFlowValueInstance = new CashFlowValue()
    .paymentDate(paymentDate)
    .diagnostics(diagnostics)
    .cashFlowLineage(cashFlowLineage)
    .paymentAmount(paymentAmount)
    .paymentCcy(paymentCcy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)