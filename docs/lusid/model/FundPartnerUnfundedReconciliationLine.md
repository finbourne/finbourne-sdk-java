# com.finbourne.sdk.services.lusid.model.FundPartnerUnfundedReconciliationLine
classname FundPartnerUnfundedReconciliationLine
One booked allocation to the partner on the unfunded commitment statement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationEventId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The event date of the allocation. | [default to OffsetDateTime]
**eventType** | **String** | The kind of allocation event: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default or Commitment. | [default to String]
**component** | **String** | The component of the event the amount belongs to, for example Investment, MgmtFee or ROC. | [optional] [default to String]
**ilpaTransactionType** | **String** | The ILPA transaction type the line is reported under, from the map&#39;s override or the default for the event type and component. | [default to String]
**insideFund** | **Boolean** | Whether the flow is inside the fund&#39;s commitment. False for flows outside it, such as equalisation interest or late payment interest, which do not move unfunded. | [default to Boolean]
**amount** | **java.math.BigDecimal** | The amount allocated to the partner, in the statement currency. | [default to java.math.BigDecimal]
**unfundedImpact** | **java.math.BigDecimal** | The effect of the line on unfunded commitment: negative for a call inside the commitment or an expired recallable, positive for a recallable distribution, and the signed amount for a commitment change or transfer. Zero for a flow that does not move unfunded. | [default to java.math.BigDecimal]
**recallableUntil** | [**OffsetDateTime**](OffsetDateTime.md) | For a recallable distribution, the last date it may be recalled. Absent when there is no deadline or the line is not recallable. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.FundPartnerUnfundedReconciliationLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId allocationEventId = new ResourceId();
OffsetDateTime eventDate = OffsetDateTime.now();
String eventType = "example eventType";
@javax.annotation.Nullable String component = "example component";
String ilpaTransactionType = "example ilpaTransactionType";
Boolean insideFund = true;
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal unfundedImpact = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime recallableUntil = OffsetDateTime.now();


FundPartnerUnfundedReconciliationLine fundPartnerUnfundedReconciliationLineInstance = new FundPartnerUnfundedReconciliationLine()
    .allocationEventId(allocationEventId)
    .eventDate(eventDate)
    .eventType(eventType)
    .component(component)
    .ilpaTransactionType(ilpaTransactionType)
    .insideFund(insideFund)
    .amount(amount)
    .unfundedImpact(unfundedImpact)
    .recallableUntil(recallableUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)