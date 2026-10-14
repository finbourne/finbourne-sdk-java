# com.finbourne.sdk.services.lusid.model.AllocationEventTransfer
classname AllocationEventTransfer
One leg of a Transfer Allocation Event: a fraction of a capital interest line moving to another line.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromLineId** | **String** | The identifier of the capital interest line the fraction moves from, as it appears on the register of one of the map&#39;s members. | [default to String]
**toInvestorRecordId** | **String** | The investor record that receives the transferred interest. | [default to String]
**toLineId** | **String** | The identifier of the capital interest line the fraction moves to. Created if it does not exist. | [default to String]
**toPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**fraction** | **java.math.BigDecimal** | The fraction of the source line transferred, greater than zero and at most one. One closes the source line. Each balance moved is the source balance times the fraction, truncated to the currency&#39;s minor unit, so any remainder stays with the transferor. | [default to java.math.BigDecimal]
**pnlSplit** | **String** | How the profit and loss of the period containing the transfer is split: InterimClose closes the books on the transfer date; DailyProration prorates by days held. Defaults to InterimClose. Available values: InterimClose, DailyProration. | [optional] [default to String]
**consideration** | [**AllocationEventTransferConsideration**](AllocationEventTransferConsideration.md) |  | [optional] [default to AllocationEventTransferConsideration]
**consentReference** | **String** | A reference to the consent obtained for the transfer, when the fund requires one. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventTransfer;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fromLineId = "example fromLineId";
String toInvestorRecordId = "example toInvestorRecordId";
String toLineId = "example toLineId";
ResourceId toPortfolioId = new ResourceId();
java.math.BigDecimal fraction = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String pnlSplit = "example pnlSplit";
AllocationEventTransferConsideration consideration = new AllocationEventTransferConsideration();
@javax.annotation.Nullable String consentReference = "example consentReference";


AllocationEventTransfer allocationEventTransferInstance = new AllocationEventTransfer()
    .fromLineId(fromLineId)
    .toInvestorRecordId(toInvestorRecordId)
    .toLineId(toLineId)
    .toPortfolioId(toPortfolioId)
    .fraction(fraction)
    .pnlSplit(pnlSplit)
    .consideration(consideration)
    .consentReference(consentReference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)