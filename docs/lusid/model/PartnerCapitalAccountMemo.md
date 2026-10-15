# com.finbourne.sdk.services.lusid.model.PartnerCapitalAccountMemo
classname PartnerCapitalAccountMemo
The memo block of a capital account statement: commitment balances from the register at the period end.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitment** | **java.math.BigDecimal** | The partner&#39;s total commitment. | [default to java.math.BigDecimal]
**uncalledCommitment** | **java.math.BigDecimal** | The commitment not yet called. | [default to java.math.BigDecimal]
**recallable** | **java.math.BigDecimal** | Distributions that the fund may recall. | [default to java.math.BigDecimal]
**availableCommitment** | **java.math.BigDecimal** | The commitment available to call, being uncalled plus recallable. | [default to java.math.BigDecimal]
**contributionsReceivable** | **java.math.BigDecimal** | Called contributions not yet received from the partner. Omitted when a register line of the partner has had returned capital marked recallable, since recalled capital is not yet tracked as a balance and the figure would exclude it. | [optional] [default to java.math.BigDecimal]
**distributionsDeclaredNotPaid** | **java.math.BigDecimal** | Distributions declared to the partner but not yet paid. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerCapitalAccountMemo;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal commitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal uncalledCommitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal recallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal availableCommitment = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal contributionsReceivable = new java.math.BigDecimal("100.00");
java.math.BigDecimal distributionsDeclaredNotPaid = new java.math.BigDecimal("100.00");


PartnerCapitalAccountMemo partnerCapitalAccountMemoInstance = new PartnerCapitalAccountMemo()
    .commitment(commitment)
    .uncalledCommitment(uncalledCommitment)
    .recallable(recallable)
    .availableCommitment(availableCommitment)
    .contributionsReceivable(contributionsReceivable)
    .distributionsDeclaredNotPaid(distributionsDeclaredNotPaid);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)