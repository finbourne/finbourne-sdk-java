# com.finbourne.sdk.services.lusid.model.InstrumentEventInstructionRequest
classname InstrumentEventInstructionRequest
The request to create an instruction for an instrument event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventInstructionId** | **String** | The unique identifier for this instruction | [default to String]
**instrumentEventId** | **String** | The identifier of the instrument event being instructed | [default to String]
**instructionType** | **String** | The type of instruction (Ignore, ElectForPortfolio, ElectForHolding, ElectForLoanFacilityHolding) | [default to String]
**electionKey** | **String** | For elected instructions, the key to be chosen | [optional] [default to String]
**holdingId** | **Long** | For holding instructions, the id of the holding for which the instruction will apply | [optional] [default to Long]
**entitlementDateInstructed** | [**OffsetDateTime**](OffsetDateTime.md) | The instructed entitlement date for the event (where none is set on the event itself) | [optional] [default to OffsetDateTime]
**quantityInstructed** | [**QuantityInstructed**](QuantityInstructed.md) |  | [optional] [default to QuantityInstructed]
**taxLotId** | **String** | For loan facility holding instructions, the tax lot id of the holding for which the instruction will apply | [optional] [default to String]
**ignoreCostImpact** | **Boolean** | For loan facility holding instructions, set this flag to &#39;true&#39; if you want the event to not impact cost. If you want to use this option, do not add multiple instructions to the same tax lot or you will get undefined behaviour. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentEventInstructionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentEventInstructionId = "example instrumentEventInstructionId";
String instrumentEventId = "example instrumentEventId";
String instructionType = "example instructionType";
@javax.annotation.Nullable String electionKey = "example electionKey";
@javax.annotation.Nullable Long holdingId = new Long("100.00");
@javax.annotation.Nullable OffsetDateTime entitlementDateInstructed = OffsetDateTime.now();
QuantityInstructed quantityInstructed = new QuantityInstructed();
@javax.annotation.Nullable String taxLotId = "example taxLotId";
Boolean ignoreCostImpact = true;


InstrumentEventInstructionRequest instrumentEventInstructionRequestInstance = new InstrumentEventInstructionRequest()
    .instrumentEventInstructionId(instrumentEventInstructionId)
    .instrumentEventId(instrumentEventId)
    .instructionType(instructionType)
    .electionKey(electionKey)
    .holdingId(holdingId)
    .entitlementDateInstructed(entitlementDateInstructed)
    .quantityInstructed(quantityInstructed)
    .taxLotId(taxLotId)
    .ignoreCostImpact(ignoreCostImpact);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)