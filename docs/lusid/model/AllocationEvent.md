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
**eventType** | **String** | The type of the event: CapitalCall, Distribution, FeeExpense or ValuationMove. Selects the basis rule from the map. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [default to String]
**amount** | **java.math.BigDecimal** | The total amount to be shared across the participants. | [default to java.math.BigDecimal]
**currency** | **String** | The ISO 4217 code of the currency of the amount. The amount may not be finer than the currency&#39;s minor unit: two decimal places for most currencies, none for JPY, three for KWD and BHD. A code with no defined minor unit, such as XAU or XAG, is taken to have two decimal places. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event: the point at which the map, its participants and their basis values are read. | [default to OffsetDateTime]
**status** | **String** | The lifecycle status of the event: Draft until its shares are computed, Computed once they are, and Booked once posted. Available values: Draft, Computed, Booked. | [default to String]
**basisSource** | **String** | Where the basis values came from when the shares were last computed. | [optional] [default to String]
**allocations** | [**List&lt;AllocationMapAllocation&gt;**](AllocationMapAllocation.md) | The per-investor shares of the amount, as last computed. | [default to List<AllocationMapAllocation>]
**bookingReference** | **String** | The reference under which the shares were posted. Set only once the event is booked. | [optional] [default to String]
**bookedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the event was booked. | [optional] [default to OffsetDateTime]
**reallocationReason** | **String** | The reason given when the event was last recomputed, if it has been. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
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
Version version = new Version();
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
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)