# com.finbourne.sdk.services.lusid.model.ManagementFeeResult
classname ManagementFeeResult
The outcome of a management fee calculation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the fee period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the fee period, inclusive. | [default to OffsetDateTime]
**basis** | **String** | The capital base the fee is charged on. Available values: Auto, CommittedCapital, InvestedCapital. Auto charges on committed capital until the investment period ends and on invested capital after. | [default to String]
**lines** | [**List&lt;ManagementFeeLine&gt;**](ManagementFeeLine.md) | The fee per partner. | [default to List<ManagementFeeLine>]
**totals** | [**ManagementFeeTotals**](ManagementFeeTotals.md) |  | [default to ManagementFeeTotals]
**bookedTransactionIds** | **List&lt;String&gt;** | The identifiers of the transactions booked, if any. | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ManagementFeeResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
OffsetDateTime periodStart = OffsetDateTime.now();
OffsetDateTime periodEnd = OffsetDateTime.now();
String basis = "example basis";
List<ManagementFeeLine> lines = new List<ManagementFeeLine>();
ManagementFeeTotals totals = new ManagementFeeTotals();
List<String> bookedTransactionIds = new List<String>();


ManagementFeeResult managementFeeResultInstance = new ManagementFeeResult()
    .fundId(fundId)
    .periodStart(periodStart)
    .periodEnd(periodEnd)
    .basis(basis)
    .lines(lines)
    .totals(totals)
    .bookedTransactionIds(bookedTransactionIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)