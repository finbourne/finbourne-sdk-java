# com.finbourne.sdk.services.lusid.model.AllocationPostingLpLine
classname AllocationPostingLpLine
One instrument event a booking writes on an investor's commitment line.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The deterministic identifier of the posting: the booking reference, investor record, commitment line, component and side. | [optional] [default to String]
**instrument** | **String** | The commitment-line instrument the event is written on. | [optional] [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**event** | **String** | The instrument event type written, for instance CapitalCallEvent. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount posted, in the event currency. | [optional] [default to java.math.BigDecimal]
**component** | **String** | The component of the event the posting carries. | [optional] [default to String]
**investorRecordId** | **String** | The investor record the posting is for. | [optional] [default to String]
**originMemberShortCode** | **String** | The member of the structure the component originates from, when it is not the map&#39;s own member. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationPostingLpLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String instrument = "example instrument";
ResourceId portfolio = new ResourceId();
@javax.annotation.Nullable String event = "example event";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String component = "example component";
@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
@javax.annotation.Nullable String originMemberShortCode = "example originMemberShortCode";


AllocationPostingLpLine allocationPostingLpLineInstance = new AllocationPostingLpLine()
    .id(id)
    .instrument(instrument)
    .portfolio(portfolio)
    .event(event)
    .amount(amount)
    .component(component)
    .investorRecordId(investorRecordId)
    .originMemberShortCode(originMemberShortCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)