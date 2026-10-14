# com.finbourne.sdk.services.lusid.model.AllocationEvent
classname AllocationEvent
One economic event shared across the participants of an Allocation Map: raised as a draft, computed into  per-investor shares, and finally booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**description** | **String** | A description of the Allocation Event. | [optional] [default to String]
**allocationMapId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventType** | **String** | The type of the event: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default, Commitment or DealFunding. Selects the basis rule from the map. A recall is a CapitalCall with a Recall component. A Commitment event is not shared from a basis: its basis values are the signed commitment amounts per commitment line, and they must sum to the amount. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove, Commitment, Equalisation, RecallExpiry, Transfer, Default, DealFunding. | [default to String]
**amount** | **java.math.BigDecimal** | The total amount to be shared across the participants. | [default to java.math.BigDecimal]
**currency** | **String** | The ISO 4217 code of the currency of the amount. The amount may not be finer than the currency&#39;s minor unit: two decimal places for most currencies, none for JPY, three for KWD and BHD. A code with no defined minor unit, such as XAU or XAG, is taken to have two decimal places. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event: the point at which the map, its participants and their basis values are read. | [default to OffsetDateTime]
**status** | **String** | The lifecycle status of the event: Draft until its shares are computed, Computed once they are, Booking while its postings are being written, Booked once they all are, and Reversed once a booked event has been backed out. Available values: Draft, Computed, Booked, Booking, Reversed. | [default to String]
**basisSource** | **String** | Where the basis values came from when the shares were last computed. | [optional] [default to String]
**allocations** | [**List&lt;AllocationMapAllocation&gt;**](AllocationMapAllocation.md) | The per-investor shares of the amount, as last computed. | [default to List<AllocationMapAllocation>]
**bookingReference** | **String** | The reference under which the shares were posted. Set only once the event is booked. | [optional] [default to String]
**bookedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the event was booked. | [optional] [default to OffsetDateTime]
**reallocationReason** | **String** | The reason given when the event was last recomputed, if it has been. | [optional] [default to String]
**components** | [**List&lt;AllocationEventComponent&gt;**](AllocationEventComponent.md) | The parts the amount splits into, each shared on its own basis and booked to its own slot. The component amounts must sum to the event amount. Absent means the whole amount is one component: Investment for a CapitalCall, ROC for a Distribution. | [optional] [default to List<AllocationEventComponent>]
**residuals** | [**List&lt;AllocationEventRoundingResidual&gt;**](AllocationEventRoundingResidual.md) | The minor units left over when each component&#39;s shares were rounded to the currency, and which investor records took them. | [optional] [default to List<AllocationEventRoundingResidual>]
**basisDiagnostics** | [**AllocationEventBasisDiagnostics**](AllocationEventBasisDiagnostics.md) |  | [optional] [default to AllocationEventBasisDiagnostics]
**writtenIds** | **List&lt;String&gt;** | The identifiers of the postings the booking has written so far, in write order. Complete once the event is Booked. | [optional] [default to List<String>]
**bookingErrors** | [**List&lt;AllocationEventBookingError&gt;**](AllocationEventBookingError.md) | The postings the booking could not write. Non-empty leaves the event in Booking; book again under the same reference to resume, or unbook to cancel what was written. | [optional] [default to List<AllocationEventBookingError>]
**warnings** | [**List&lt;AllocationEventBookingWarning&gt;**](AllocationEventBookingWarning.md) | The validation rules the booking was allowed to proceed through under the map&#39;s policy, for instance an OverCall on a map that warns rather than refuses. Kept for the life of the event. | [optional] [default to List<AllocationEventBookingWarning>]
**transfers** | [**List&lt;AllocationEventTransfer&gt;**](AllocationEventTransfer.md) | For a Transfer event, the legs to book: each moves a fraction of one capital interest line to another. Required for a Transfer event and not allowed on any other type. The fractions out of one line must sum to at most one; the amount of a Transfer event is zero. | [optional] [default to List<AllocationEventTransfer>]
**equalisation** | [**AllocationEventEqualisation**](AllocationEventEqualisation.md) |  | [optional] [default to AllocationEventEqualisation]
**useOfProceeds** | [**List&lt;AllocationEventUseOfProceeds&gt;**](AllocationEventUseOfProceeds.md) | For a CapitalCall, what the call pays for: rows of purpose, deal and amount that sum to the call amount. An Investment row names a deal the vehicle has funded and is shared under that deal&#39;s participation, with each investor&#39;s share recorded as paid in for that deal; when the deal was funded from a facility the row repays the draw. Not allowed with components or on any other event type. | [optional] [default to List<AllocationEventUseOfProceeds>]
**dealFunding** | [**AllocationEventDealFunding**](AllocationEventDealFunding.md) |  | [optional] [default to AllocationEventDealFunding]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**parentAllocationEventId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**replaces** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reversal** | [**AllocationEventReversal**](AllocationEventReversal.md) |  | [optional] [default to AllocationEventReversal]
**noticeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the notice went to investors. | [optional] [default to OffsetDateTime]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the investors&#39; cash is due. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the postings settle. Defaults to the event date. | [optional] [default to OffsetDateTime]
**receipts** | [**List&lt;AllocationEventReceipt&gt;**](AllocationEventReceipt.md) | The cash received against the event, in the order it was recorded. | [optional] [default to List<AllocationEventReceipt>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
@javax.annotation.Nullable String description = "example description";
ResourceId allocationMapId = new ResourceId();
String eventType = "example eventType";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";
OffsetDateTime eventDate = OffsetDateTime.now();
String status = "example status";
@javax.annotation.Nullable String basisSource = "example basisSource";
List<AllocationMapAllocation> allocations = new List<AllocationMapAllocation>();
@javax.annotation.Nullable String bookingReference = "example bookingReference";
@javax.annotation.Nullable OffsetDateTime bookedAt = OffsetDateTime.now();
@javax.annotation.Nullable String reallocationReason = "example reallocationReason";
@javax.annotation.Nullable List<AllocationEventComponent> components = new List<AllocationEventComponent>();
@javax.annotation.Nullable List<AllocationEventRoundingResidual> residuals = new List<AllocationEventRoundingResidual>();
AllocationEventBasisDiagnostics basisDiagnostics = new AllocationEventBasisDiagnostics();
@javax.annotation.Nullable List<String> writtenIds = new List<String>();
@javax.annotation.Nullable List<AllocationEventBookingError> bookingErrors = new List<AllocationEventBookingError>();
@javax.annotation.Nullable List<AllocationEventBookingWarning> warnings = new List<AllocationEventBookingWarning>();
@javax.annotation.Nullable List<AllocationEventTransfer> transfers = new List<AllocationEventTransfer>();
AllocationEventEqualisation equalisation = new AllocationEventEqualisation();
@javax.annotation.Nullable List<AllocationEventUseOfProceeds> useOfProceeds = new List<AllocationEventUseOfProceeds>();
AllocationEventDealFunding dealFunding = new AllocationEventDealFunding();
Version version = new Version();
ResourceId parentAllocationEventId = new ResourceId();
ResourceId replaces = new ResourceId();
AllocationEventReversal reversal = new AllocationEventReversal();
@javax.annotation.Nullable OffsetDateTime noticeDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime dueDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime settlementDate = OffsetDateTime.now();
@javax.annotation.Nullable List<AllocationEventReceipt> receipts = new List<AllocationEventReceipt>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AllocationEvent allocationEventInstance = new AllocationEvent()
    .href(href)
    .id(id)
    .description(description)
    .allocationMapId(allocationMapId)
    .eventType(eventType)
    .amount(amount)
    .currency(currency)
    .eventDate(eventDate)
    .status(status)
    .basisSource(basisSource)
    .allocations(allocations)
    .bookingReference(bookingReference)
    .bookedAt(bookedAt)
    .reallocationReason(reallocationReason)
    .components(components)
    .residuals(residuals)
    .basisDiagnostics(basisDiagnostics)
    .writtenIds(writtenIds)
    .bookingErrors(bookingErrors)
    .warnings(warnings)
    .transfers(transfers)
    .equalisation(equalisation)
    .useOfProceeds(useOfProceeds)
    .dealFunding(dealFunding)
    .version(version)
    .parentAllocationEventId(parentAllocationEventId)
    .replaces(replaces)
    .reversal(reversal)
    .noticeDate(noticeDate)
    .dueDate(dueDate)
    .settlementDate(settlementDate)
    .receipts(receipts)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)