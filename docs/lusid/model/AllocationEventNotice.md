# com.finbourne.sdk.services.lusid.model.AllocationEventNotice
classname AllocationEventNotice
A capital call or distribution notice for one partner on an allocation event: the lines allocated to the  partner, the net amount due, the partner's unfunded commitment rolled through the event, cumulative balances  for the partner and the general partner, and a DRAFT watermark while the event is not yet booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fund** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**event** | [**AllocationEventNoticeEvent**](AllocationEventNoticeEvent.md) |  | [default to AllocationEventNoticeEvent]
**partner** | [**AllocationEventNoticePartner**](AllocationEventNoticePartner.md) |  | [default to AllocationEventNoticePartner]
**currency** | **String** | The currency the notice amounts are expressed in. | [default to String]
**lines** | [**List&lt;AllocationEventNoticeLine&gt;**](AllocationEventNoticeLine.md) | The notice lines, one per component of the partner&#39;s allocation. | [default to List<AllocationEventNoticeLine>]
**netAmountDue** | **java.math.BigDecimal** | The net amount due, positive when the partner pays the fund and negative when the fund pays the partner. | [default to java.math.BigDecimal]
**unfundedReconciliation** | [**AllocationEventNoticeUnfundedReconciliation**](AllocationEventNoticeUnfundedReconciliation.md) |  | [default to AllocationEventNoticeUnfundedReconciliation]
**cumulative** | [**AllocationEventNoticeCumulative**](AllocationEventNoticeCumulative.md) |  | [default to AllocationEventNoticeCumulative]
**gpColumn** | [**AllocationEventNoticeCumulative**](AllocationEventNoticeCumulative.md) |  | [optional] [default to AllocationEventNoticeCumulative]
**wire** | [**AllocationEventNoticeWire**](AllocationEventNoticeWire.md) |  | [optional] [default to AllocationEventNoticeWire]
**paymentHold** | [**AllocationPaymentHold**](AllocationPaymentHold.md) |  | [optional] [default to AllocationPaymentHold]
**watermark** | **String** | DRAFT until the allocation event is booked, otherwise null. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventNotice;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fund = new ResourceId();
AllocationEventNoticeEvent event = new AllocationEventNoticeEvent();
AllocationEventNoticePartner partner = new AllocationEventNoticePartner();
String currency = "example currency";
List<AllocationEventNoticeLine> lines = new List<AllocationEventNoticeLine>();
java.math.BigDecimal netAmountDue = new java.math.BigDecimal("100.00");
AllocationEventNoticeUnfundedReconciliation unfundedReconciliation = new AllocationEventNoticeUnfundedReconciliation();
AllocationEventNoticeCumulative cumulative = new AllocationEventNoticeCumulative();
AllocationEventNoticeCumulative gpColumn = new AllocationEventNoticeCumulative();
AllocationEventNoticeWire wire = new AllocationEventNoticeWire();
AllocationPaymentHold paymentHold = new AllocationPaymentHold();
@javax.annotation.Nullable String watermark = "example watermark";


AllocationEventNotice allocationEventNoticeInstance = new AllocationEventNotice()
    .fund(fund)
    .event(event)
    .partner(partner)
    .currency(currency)
    .lines(lines)
    .netAmountDue(netAmountDue)
    .unfundedReconciliation(unfundedReconciliation)
    .cumulative(cumulative)
    .gpColumn(gpColumn)
    .wire(wire)
    .paymentHold(paymentHold)
    .watermark(watermark);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)