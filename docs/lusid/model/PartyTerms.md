# com.finbourne.sdk.services.lusid.model.PartyTerms
classname PartyTerms
What one party posts under a margin item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshold** | **java.math.BigDecimal** | The exposure that is tolerated before margin is called. Empty means no threshold. | [optional] [default to java.math.BigDecimal]
**independentAmount** | **java.math.BigDecimal** | The independent amount posted in addition to variation margin. | [default to java.math.BigDecimal]
**cashInterest** | [**CashInterest**](CashInterest.md) |  | [optional] [default to CashInterest]

```java
import com.finbourne.sdk.services.lusid.model.PartyTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal threshold = new java.math.BigDecimal("100.00");
java.math.BigDecimal independentAmount = new java.math.BigDecimal("100.00");
CashInterest cashInterest = new CashInterest();


PartyTerms partyTermsInstance = new PartyTerms()
    .threshold(threshold)
    .independentAmount(independentAmount)
    .cashInterest(cashInterest);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)