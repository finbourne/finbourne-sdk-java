# com.finbourne.sdk.services.lusid.model.TaxFundReconciliationProxyRow
classname TaxFundReconciliationProxyRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundCode** | **String** | The code of the member fund. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount, in pounds. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxFundReconciliationProxyRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String fundCode = "example fundCode";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


TaxFundReconciliationProxyRow taxFundReconciliationProxyRowInstance = new TaxFundReconciliationProxyRow()
    .fundCode(fundCode)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)