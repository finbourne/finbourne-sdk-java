# com.finbourne.sdk.services.lusid.model.TransactionSettlementInstruction
classname TransactionSettlementInstruction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstructionId** | **String** | The instruction identifier. Unique within the portfolio. | [default to String]
**instructionType** | **String** | The type of instruction which can be Complete or CancelAutomatic. Complete means that the instruction is intended to completely settle a settlement bucket. CancelAutomatic means that it is intended to cancel Automatic settlement. Available values: Complete, CancelAutomatic, Partial. | [default to String]
**actualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date that settlement takes place. | [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The number of units for the instruction. | [default to java.math.BigDecimal]
**transactionId** | **String** | The ID for the transaction being instructed. | [default to String]
**settlementCategory** | **String** | A category representing the set of movement types that this instruction applies to. Available values: StockSettlement, CashSettlement, DeferredCashReceipt, NotApplicable. | [default to String]
**lusidInstrumentId** | **String** | The LusidInstrumentId of the instrument being settled. | [default to String]
**contractualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The contractual settlement date. Used to match the instruction to the correct settlement bucket. | [optional] [default to OffsetDateTime]
**subHoldingKeyOverrides** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Allows one or more sub-holding keys to be overridden for any movement being settled by an instruction. Providing a key and value will set the sub-holding key to the specified value; Providing a key only will nullify the sub-holding key. Not referenced sub-holding keys will not be impacted.  | [optional] [default to Map<String, PerpetualProperty>]
**custodianAccountOverride** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the settlement instruction to a unique instrument. | [default to Map<String, String>]
**status** | **String** | The status of the settlement instruction. Available values: Applied, Inactive, Invalid, Orphan, Rejected. Available values: Invalid, Rejected, Applied, Orphan. | [optional] [default to String]
**instructionToPortfolioRate** | **java.math.BigDecimal** | The exchange rate between the Settlement Instruction and Portfolio. | [optional] [default to java.math.BigDecimal]
**settlementInLieu** | [**SettlementInLieu**](SettlementInLieu.md) |  | [optional] [default to SettlementInLieu]
**isActive** | **Boolean** | Indicates whether the settlement instruction is active. When false, the instruction has no impact on settlement positions, but remains visible. Defaults to true. | [optional] [default to Boolean]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties which have been requested to be decorated onto the settlement instruction. These will be from the &#39;SettlementInstruction&#39;, &#39;Portfolio&#39;, or &#39;Instrument&#39; domains. | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.TransactionSettlementInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String settlementInstructionId = "example settlementInstructionId";
String instructionType = "example instructionType";
OffsetDateTime actualSettlementDate = OffsetDateTime.now();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
String transactionId = "example transactionId";
String settlementCategory = "example settlementCategory";
String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable OffsetDateTime contractualSettlementDate = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeyOverrides = new Map<String, PerpetualProperty>();
ResourceId custodianAccountOverride = new ResourceId();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable java.math.BigDecimal instructionToPortfolioRate = new java.math.BigDecimal("100.00");
SettlementInLieu settlementInLieu = new SettlementInLieu();
Boolean isActive = true;
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Version version = new Version();


TransactionSettlementInstruction transactionSettlementInstructionInstance = new TransactionSettlementInstruction()
    .settlementInstructionId(settlementInstructionId)
    .instructionType(instructionType)
    .actualSettlementDate(actualSettlementDate)
    .units(units)
    .transactionId(transactionId)
    .settlementCategory(settlementCategory)
    .lusidInstrumentId(lusidInstrumentId)
    .contractualSettlementDate(contractualSettlementDate)
    .subHoldingKeyOverrides(subHoldingKeyOverrides)
    .custodianAccountOverride(custodianAccountOverride)
    .instrumentIdentifiers(instrumentIdentifiers)
    .status(status)
    .instructionToPortfolioRate(instructionToPortfolioRate)
    .settlementInLieu(settlementInLieu)
    .isActive(isActive)
    .properties(properties)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)