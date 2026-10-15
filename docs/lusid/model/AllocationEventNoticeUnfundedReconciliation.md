# com.finbourne.sdk.services.lusid.model.AllocationEventNoticeUnfundedReconciliation
classname AllocationEventNoticeUnfundedReconciliation
The partner's unfunded commitment rolled through the event on the notice.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**opening** | **java.math.BigDecimal** | The unfunded commitment before the event. | [default to java.math.BigDecimal]
**calls** | **java.math.BigDecimal** | Capital calls reducing the unfunded commitment. | [default to java.math.BigDecimal]
**distributionsRecallable** | **java.math.BigDecimal** | Recallable distributions restoring the unfunded commitment. | [default to java.math.BigDecimal]
**expiries** | **java.math.BigDecimal** | Recallable amounts that expired. | [default to java.math.BigDecimal]
**commitmentChanges** | **java.math.BigDecimal** | Changes to the commitment itself. | [default to java.math.BigDecimal]
**transfers** | **java.math.BigDecimal** | Transfers of unfunded commitment between partners. | [default to java.math.BigDecimal]
**closing** | **java.math.BigDecimal** | The unfunded commitment after the event. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventNoticeUnfundedReconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal opening = new java.math.BigDecimal("100.00");
java.math.BigDecimal calls = new java.math.BigDecimal("100.00");
java.math.BigDecimal distributionsRecallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal expiries = new java.math.BigDecimal("100.00");
java.math.BigDecimal commitmentChanges = new java.math.BigDecimal("100.00");
java.math.BigDecimal transfers = new java.math.BigDecimal("100.00");
java.math.BigDecimal closing = new java.math.BigDecimal("100.00");


AllocationEventNoticeUnfundedReconciliation allocationEventNoticeUnfundedReconciliationInstance = new AllocationEventNoticeUnfundedReconciliation()
    .opening(opening)
    .calls(calls)
    .distributionsRecallable(distributionsRecallable)
    .expiries(expiries)
    .commitmentChanges(commitmentChanges)
    .transfers(transfers)
    .closing(closing);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)