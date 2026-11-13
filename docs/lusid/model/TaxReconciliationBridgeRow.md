# com.finbourne.sdk.services.lusid.model.TaxReconciliationBridgeRow
classname TaxReconciliationBridgeRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the period, for example the four-digit year. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount, in pounds. | [optional] [default to java.math.BigDecimal]
**runningTotal** | **java.math.BigDecimal** | The running total after this step of the bridge. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxReconciliationBridgeRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String label = "example label";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal runningTotal = new java.math.BigDecimal("100.00");


TaxReconciliationBridgeRow taxReconciliationBridgeRowInstance = new TaxReconciliationBridgeRow()
    .label(label)
    .amount(amount)
    .runningTotal(runningTotal);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)