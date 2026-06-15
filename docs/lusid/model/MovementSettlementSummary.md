# com.finbourne.sdk.services.lusid.model.MovementSettlementSummary
classname MovementSettlementSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [optional] [default to String]
**type** | **String** |  | [optional] [default to String]
**lusidInstrumentId** | **String** |  | [optional] [default to String]
**instrumentScope** | **String** |  | [optional] [default to String]
**settlementMode** | **String** |  | [optional] [default to String]
**contractualSettlementDate** | **String** |  | [optional] [default to String]
**units** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**settledUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**unsettledUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**overdueUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MovementSettlementSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable String settlementMode = "example settlementMode";
@javax.annotation.Nullable String contractualSettlementDate = "example contractualSettlementDate";
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
java.math.BigDecimal settledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal unsettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal overdueUnits = new java.math.BigDecimal("100.00");


MovementSettlementSummary movementSettlementSummaryInstance = new MovementSettlementSummary()
    .name(name)
    .type(type)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .settlementMode(settlementMode)
    .contractualSettlementDate(contractualSettlementDate)
    .units(units)
    .settledUnits(settledUnits)
    .unsettledUnits(unsettledUnits)
    .overdueUnits(overdueUnits);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)