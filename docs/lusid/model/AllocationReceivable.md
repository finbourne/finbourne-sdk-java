# com.finbourne.sdk.services.lusid.model.AllocationReceivable
classname AllocationReceivable
One investor's position on a booked capital call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record. | [optional] [default to String]
**called** | **java.math.BigDecimal** | What the investor record was called for. | [optional] [default to java.math.BigDecimal]
**received** | **java.math.BigDecimal** | What has been received and applied so far. | [optional] [default to java.math.BigDecimal]
**outstanding** | **java.math.BigDecimal** | What is still owed. Never negative: an overpayment becomes a refund payable instead. | [optional] [default to java.math.BigDecimal]
**daysPastDue** | **Integer** | How many days past the due date the outstanding amount is, or zero when not yet due or nothing is owed. | [optional] [default to Integer]
**bucket** | **String** | The ageing bucket: Current, 1-30, 31-60, 61-90 or 90+. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationReceivable;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
java.math.BigDecimal called = new java.math.BigDecimal("100.00");
java.math.BigDecimal received = new java.math.BigDecimal("100.00");
java.math.BigDecimal outstanding = new java.math.BigDecimal("100.00");
Integer daysPastDue = new Integer("100.00");
@javax.annotation.Nullable String bucket = "example bucket";


AllocationReceivable allocationReceivableInstance = new AllocationReceivable()
    .investorRecordId(investorRecordId)
    .called(called)
    .received(received)
    .outstanding(outstanding)
    .daysPastDue(daysPastDue)
    .bucket(bucket);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)