# com.finbourne.sdk.services.lusid.model.TransactionSettlementMovement
classname TransactionSettlementMovement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The movement name (optional) | [optional] [default to String]
**type** | **String** | Movement types determine the impact of the movement on the holdings. | [optional] [default to String]
**units** | **java.math.BigDecimal** | The number of units for the movement. | [optional] [default to java.math.BigDecimal]
**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease | [optional] [default to Integer]
**settlementMode** | **String** | The mode of settlement for the movement which can either be Internal or External. An Internal movement will settle automatically on the contractual settlement date using TransactionConfiguration. An External movement will be determined by portfolio configuration and settlement instruction. Available values: Internal, External. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionSettlementMovement;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String type = "example type";
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
Integer direction = new Integer("100.00");
@javax.annotation.Nullable String settlementMode = "example settlementMode";


TransactionSettlementMovement transactionSettlementMovementInstance = new TransactionSettlementMovement()
    .name(name)
    .type(type)
    .units(units)
    .direction(direction)
    .settlementMode(settlementMode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)