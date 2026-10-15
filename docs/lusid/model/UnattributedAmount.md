# com.finbourne.sdk.services.lusid.model.UnattributedAmount
classname UnattributedAmount
An amount on the income summary an allocation run could not attribute to any pool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**glCode** | **String** | The general ledger account the unattributed amount sits in. | [default to String]
**amount** | **java.math.BigDecimal** | The amount allocated to the partner. | [default to java.math.BigDecimal]
**reason** | **String** | Why the amount could not be attributed. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UnattributedAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String glCode = "example glCode";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String reason = "example reason";


UnattributedAmount unattributedAmountInstance = new UnattributedAmount()
    .glCode(glCode)
    .amount(amount)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)