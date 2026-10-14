# com.finbourne.sdk.services.lusid.model.AllocationEventRefund
classname AllocationEventRefund
Cash the fund owes back to an investor record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the refund is owed to. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount owed back, in the event currency. | [optional] [default to java.math.BigDecimal]
**reason** | **String** | Why the refund arose: Overpayment or Reversal. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventRefund;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String reason = "example reason";


AllocationEventRefund allocationEventRefundInstance = new AllocationEventRefund()
    .investorRecordId(investorRecordId)
    .amount(amount)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)