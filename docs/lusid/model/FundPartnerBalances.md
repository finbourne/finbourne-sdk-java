# com.finbourne.sdk.services.lusid.model.FundPartnerBalances
classname FundPartnerBalances
The capital balances of one register line, in the commitment currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**committed** | **java.math.BigDecimal** | The committed capital. | [default to java.math.BigDecimal]
**uncalledCommitment** | **java.math.BigDecimal** | The commitment not yet called. | [default to java.math.BigDecimal]
**paidIn** | **java.math.BigDecimal** | The capital paid in. | [default to java.math.BigDecimal]
**returned** | **java.math.BigDecimal** | The capital returned. | [default to java.math.BigDecimal]
**recallable** | **java.math.BigDecimal** | The returned capital that may be recalled. | [default to java.math.BigDecimal]
**unfunded** | **java.math.BigDecimal** | The unfunded capital. | [default to java.math.BigDecimal]
**funded** | **java.math.BigDecimal** | The funded capital. | [default to java.math.BigDecimal]
**outstandingCalls** | **java.math.BigDecimal** | Capital called but not yet paid in. Omitted on a register line that has had returned capital marked recallable, since recalled capital is not yet tracked as a balance and the figure would exclude it. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FundPartnerBalances;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal committed = new java.math.BigDecimal("100.00");
java.math.BigDecimal uncalledCommitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal paidIn = new java.math.BigDecimal("100.00");
java.math.BigDecimal returned = new java.math.BigDecimal("100.00");
java.math.BigDecimal recallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal unfunded = new java.math.BigDecimal("100.00");
java.math.BigDecimal funded = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal outstandingCalls = new java.math.BigDecimal("100.00");


FundPartnerBalances fundPartnerBalancesInstance = new FundPartnerBalances()
    .committed(committed)
    .uncalledCommitment(uncalledCommitment)
    .paidIn(paidIn)
    .returned(returned)
    .recallable(recallable)
    .unfunded(unfunded)
    .funded(funded)
    .outstandingCalls(outstandingCalls);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)