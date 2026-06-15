# com.finbourne.sdk.services.lusid.model.SettlementInstructionRequest
classname SettlementInstructionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstructionId** | **String** |  | [default to String]
**transactionId** | **String** |  | [default to String]
**settlementCategory** | **String** | Available values: StockSettlement, CashSettlement, DeferredCashReceipt. | [default to String]
**instructionType** | **String** | Available values: Complete, CancelAutomatic, Partial. | [optional] [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**contractualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**actualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**units** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**subHoldingKeyOverrides** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]
**custodianAccountOverride** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instructionToPortfolioRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**settlementInLieu** | [**SettlementInLieu**](SettlementInLieu.md) |  | [optional] [default to SettlementInLieu]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to List<PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.SettlementInstructionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String settlementInstructionId = "example settlementInstructionId";
String transactionId = "example transactionId";
String settlementCategory = "example settlementCategory";
@javax.annotation.Nullable String instructionType = "example instructionType";
Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable OffsetDateTime contractualSettlementDate = OffsetDateTime.now();
OffsetDateTime actualSettlementDate = OffsetDateTime.now();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeyOverrides = new Map<String, PerpetualProperty>();
ResourceId custodianAccountOverride = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal instructionToPortfolioRate = new java.math.BigDecimal("100.00");
SettlementInLieu settlementInLieu = new SettlementInLieu();
@javax.annotation.Nullable List<PerpetualProperty> properties = new List<PerpetualProperty>();


SettlementInstructionRequest settlementInstructionRequestInstance = new SettlementInstructionRequest()
    .settlementInstructionId(settlementInstructionId)
    .transactionId(transactionId)
    .settlementCategory(settlementCategory)
    .instructionType(instructionType)
    .instrumentIdentifiers(instrumentIdentifiers)
    .contractualSettlementDate(contractualSettlementDate)
    .actualSettlementDate(actualSettlementDate)
    .units(units)
    .subHoldingKeyOverrides(subHoldingKeyOverrides)
    .custodianAccountOverride(custodianAccountOverride)
    .instructionToPortfolioRate(instructionToPortfolioRate)
    .settlementInLieu(settlementInLieu)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)