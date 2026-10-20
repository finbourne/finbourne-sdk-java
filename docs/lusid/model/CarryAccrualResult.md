# com.finbourne.sdk.services.lusid.model.CarryAccrualResult
classname CarryAccrualResult
The outcome of a carry accrual: the movement in each partner's carry against what was last accrued.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The date carry is accrued to. | [default to OffsetDateTime]
**source** | **String** | The waterfall or model the carry amounts came from. | [default to String]
**lines** | [**List&lt;CarryAccrualLine&gt;**](CarryAccrualLine.md) | The accrual movement per partner. | [default to List<CarryAccrualLine>]
**bookedTransactionIds** | **List&lt;String&gt;** | The identifiers of the transactions booked, if any. | [default to List<String>]
**laterRunIds** | **List&lt;String&gt;** | The run identifiers of carry accruals already on the ledger with an effective date after this period end. Restating an earlier period moves the to-date balance those runs were accrued against; re-run them to roll the restatement forward. | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.CarryAccrualResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
OffsetDateTime periodEnd = OffsetDateTime.now();
String source = "example source";
List<CarryAccrualLine> lines = new List<CarryAccrualLine>();
List<String> bookedTransactionIds = new List<String>();
List<String> laterRunIds = new List<String>();


CarryAccrualResult carryAccrualResultInstance = new CarryAccrualResult()
    .fundId(fundId)
    .periodEnd(periodEnd)
    .source(source)
    .lines(lines)
    .bookedTransactionIds(bookedTransactionIds)
    .laterRunIds(laterRunIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)