# com.finbourne.sdk.services.lusid.model.AllocationEventEqualisationFeeCatchUp
classname AllocationEventEqualisationFeeCatchUp
The management fees one admitted partner owes from the first fee date to the close, as an explicit amount.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The admitted partner the fee catch-up is charged to. | [default to String]
**amount** | **java.math.BigDecimal** | The fee catch-up in the event currency. Must not be negative. | [default to java.math.BigDecimal]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the fee would have been due had the partner been admitted at the first close, from which interest on it accrues when charged. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventEqualisationFeeCatchUp;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime dueDate = OffsetDateTime.now();


AllocationEventEqualisationFeeCatchUp allocationEventEqualisationFeeCatchUpInstance = new AllocationEventEqualisationFeeCatchUp()
    .investorRecordId(investorRecordId)
    .amount(amount)
    .dueDate(dueDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)