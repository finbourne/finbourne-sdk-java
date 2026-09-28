# com.finbourne.sdk.services.lusid.model.AllocationEventRequest
classname AllocationEventRequest
The request used to raise or replace an Allocation Event. The event is computed against its map straight away.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Allocation Event. Together with the scope this uniquely identifies the event. | [default to String]
**allocationMapId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventType** | **String** | The type of the event: CapitalCall, Distribution, FeeExpense or ValuationMove. Selects the basis rule from the map. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [default to String]
**amount** | **java.math.BigDecimal** | The total amount to be shared across the participants. | [default to java.math.BigDecimal]
**currency** | **String** | The ISO 4217 code of the currency of the amount. The amount may not be finer than the currency&#39;s minor unit: two decimal places for most currencies, none for JPY, three for KWD and BHD. A code with no defined minor unit, such as XAU or XAG, is taken to have two decimal places. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event: the point at which the map, its participants and their basis values are read. | [default to OffsetDateTime]
**description** | **String** | A description of the Allocation Event. | [optional] [default to String]
**basisValues** | [**List&lt;AllocationMapBasisValue&gt;**](AllocationMapBasisValue.md) | Optional basis values per investor record, used when the map&#39;s basis is not resolvable from stored data. | [optional] [default to List<AllocationMapBasisValue>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the event is created or replaced. Defaults to the earliest effective time on create and the current LUSID system datetime on replace. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
ResourceId allocationMapId = new ResourceId();
String eventType = "example eventType";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";
OffsetDateTime eventDate = OffsetDateTime.now();
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<AllocationMapBasisValue> basisValues = new List<AllocationMapBasisValue>();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();


AllocationEventRequest allocationEventRequestInstance = new AllocationEventRequest()
    .code(code)
    .allocationMapId(allocationMapId)
    .eventType(eventType)
    .amount(amount)
    .currency(currency)
    .eventDate(eventDate)
    .description(description)
    .basisValues(basisValues)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)