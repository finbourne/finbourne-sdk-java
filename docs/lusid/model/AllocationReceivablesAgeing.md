# com.finbourne.sdk.services.lusid.model.AllocationReceivablesAgeing
classname AllocationReceivablesAgeing
What each investor still owes on a booked capital call as of a date, and how late it is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOf** | [**OffsetDateTime**](OffsetDateTime.md) | The date the receivables are aged as of. | [optional] [default to OffsetDateTime]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was due. | [optional] [default to OffsetDateTime]
**outstanding** | **java.math.BigDecimal** | The total still owed across all investor records. | [optional] [default to java.math.BigDecimal]
**receivables** | [**List&lt;AllocationReceivable&gt;**](AllocationReceivable.md) | One entry per investor record that was called. | [optional] [default to List<AllocationReceivable>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationReceivablesAgeing;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asOf = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime dueDate = OffsetDateTime.now();
java.math.BigDecimal outstanding = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<AllocationReceivable> receivables = new List<AllocationReceivable>();


AllocationReceivablesAgeing allocationReceivablesAgeingInstance = new AllocationReceivablesAgeing()
    .asOf(asOf)
    .dueDate(dueDate)
    .outstanding(outstanding)
    .receivables(receivables);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)