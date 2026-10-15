# com.finbourne.sdk.services.lusid.model.CarryAccrualLine
classname CarryAccrualLine
One partner's line on a carry accrual.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the amount belongs to. | [default to String]
**previousCarryToDate** | **java.math.BigDecimal** | The cumulative carry already on the books for the partner. | [default to java.math.BigDecimal]
**carryToDate** | **java.math.BigDecimal** | The cumulative carry the partner has earned to the period end. | [default to java.math.BigDecimal]
**delta** | **java.math.BigDecimal** | The accrual booked: the carry to date less what was already on the books. | [default to java.math.BigDecimal]
**clawbackExposure** | **java.math.BigDecimal** | The carry that would have to be returned if the fund liquidated at the period end. | [default to java.math.BigDecimal]
**status** | **String** | What happened to the line. Available values: Unchanged, Accrued, Released. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CarryAccrualLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal previousCarryToDate = new java.math.BigDecimal("100.00");
java.math.BigDecimal carryToDate = new java.math.BigDecimal("100.00");
java.math.BigDecimal delta = new java.math.BigDecimal("100.00");
java.math.BigDecimal clawbackExposure = new java.math.BigDecimal("100.00");
String status = "example status";


CarryAccrualLine carryAccrualLineInstance = new CarryAccrualLine()
    .investorRecordId(investorRecordId)
    .previousCarryToDate(previousCarryToDate)
    .carryToDate(carryToDate)
    .delta(delta)
    .clawbackExposure(clawbackExposure)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)