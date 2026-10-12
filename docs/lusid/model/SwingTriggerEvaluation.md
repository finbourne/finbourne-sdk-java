# com.finbourne.sdk.services.lusid.model.SwingTriggerEvaluation
classname SwingTriggerEvaluation
How a Market swing trigger was evaluated at a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fired** | **Boolean** | Whether the net cashflow was in the trigger&#39;s direction and above its threshold. | [default to Boolean]
**threshold** | **java.math.BigDecimal** | The trigger&#39;s threshold. | [default to java.math.BigDecimal]
**metric** | **String** | What the threshold measured: NetCashflowAbsolute or NetCashflowPctOfNav. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SwingTriggerEvaluation;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean fired = true;
java.math.BigDecimal threshold = new java.math.BigDecimal("100.00");
String metric = "example metric";


SwingTriggerEvaluation swingTriggerEvaluationInstance = new SwingTriggerEvaluation()
    .fired(fired)
    .threshold(threshold)
    .metric(metric);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)