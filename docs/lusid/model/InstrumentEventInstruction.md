# com.finbourne.sdk.services.lusid.model.InstrumentEventInstruction
classname InstrumentEventInstruction
An instruction for an instrument event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventInstructionId** | **String** | The unique identifier for this instruction | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentEventId** | **String** | The identifier of the instrument event being instructed | [optional] [default to String]
**instructionType** | **String** | The type of instruction (Ignore, ElectForPortfolio, ElectForHolding, ElectForLoanFacilityHolding) | [optional] [default to String]
**electionKey** | **String** | For elected instructions, the key to be chosen | [optional] [default to String]
**holdingId** | **Long** | For holding instructions, the id of the holding for which the instruction will apply | [optional] [default to Long]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The uri for this version of this instruction | [optional] [default to URI]
**entitlementDateInstructed** | [**OffsetDateTime**](OffsetDateTime.md) | The instructed entitlement date for the event (where none is set on the event itself) | [optional] [default to OffsetDateTime]
**quantityInstructed** | [**QuantityInstructed**](QuantityInstructed.md) |  | [optional] [default to QuantityInstructed]
**taxLotId** | **String** | For loan facility holding instructions, the tax lot id of the holding for which the instruction will apply | [optional] [default to String]
**ignoreCostImpact** | **Boolean** | For loan facility holding instructions, set this flag to &#39;true&#39; if you want the event to not impact cost. If you want to use this option, do not add multiple instructions to the same tax lot or you will get undefined behaviour. | [optional] [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentEventInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentEventInstructionId = "example instrumentEventInstructionId";
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String instrumentEventId = "example instrumentEventId";
@javax.annotation.Nullable String instructionType = "example instructionType";
@javax.annotation.Nullable String electionKey = "example electionKey";
@javax.annotation.Nullable Long holdingId = new Long("100.00");
Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable OffsetDateTime entitlementDateInstructed = OffsetDateTime.now();
QuantityInstructed quantityInstructed = new QuantityInstructed();
@javax.annotation.Nullable String taxLotId = "example taxLotId";
Boolean ignoreCostImpact = true;
@javax.annotation.Nullable List<Link> links = new List<Link>();


InstrumentEventInstruction instrumentEventInstructionInstance = new InstrumentEventInstruction()
    .instrumentEventInstructionId(instrumentEventInstructionId)
    .portfolioId(portfolioId)
    .instrumentEventId(instrumentEventId)
    .instructionType(instructionType)
    .electionKey(electionKey)
    .holdingId(holdingId)
    .version(version)
    .href(href)
    .entitlementDateInstructed(entitlementDateInstructed)
    .quantityInstructed(quantityInstructed)
    .taxLotId(taxLotId)
    .ignoreCostImpact(ignoreCostImpact)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)