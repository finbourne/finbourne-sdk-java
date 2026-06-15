# com.finbourne.sdk.services.lusid.model.SettlementSchedule
classname SettlementSchedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradeId** | **String** |  | [optional] [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**units** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**bondInterest** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**movementName** | **String** |  | [optional] [default to String]
**movementType** | **String** |  | [optional] [default to String]
**unsettledUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**overdueUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.SettlementSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String tradeId = "example tradeId";
OffsetDateTime settlementDate = OffsetDateTime.now();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
java.math.BigDecimal bondInterest = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String movementName = "example movementName";
@javax.annotation.Nullable String movementType = "example movementType";
java.math.BigDecimal unsettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal overdueUnits = new java.math.BigDecimal("100.00");


SettlementSchedule settlementScheduleInstance = new SettlementSchedule()
    .tradeId(tradeId)
    .settlementDate(settlementDate)
    .units(units)
    .bondInterest(bondInterest)
    .movementName(movementName)
    .movementType(movementType)
    .unsettledUnits(unsettledUnits)
    .overdueUnits(overdueUnits);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)