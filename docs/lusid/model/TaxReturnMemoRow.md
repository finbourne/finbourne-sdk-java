# com.finbourne.sdk.services.lusid.model.TaxReturnMemoRow
classname TaxReturnMemoRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the period, for example the four-digit year. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount, in pounds. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnMemoRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String label = "example label";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


TaxReturnMemoRow taxReturnMemoRowInstance = new TaxReturnMemoRow()
    .label(label)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)