# com.finbourne.sdk.services.lusid.model.FundEstimateValuationPoint
classname FundEstimateValuationPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundCalendarEntriesType** | **String** | The type of the Calendar Entry. Available values: FinalisedValuationPoint, FundEstimateValuationPoint, FundBookmark. | [default to String]
**code** | **String** | The unique Code of the Calendar Entry. The Calendar Entry, together with the Fund Scope and Code, uniquely identifies a Fund Calendar Entry. | [default to String]
**navTypeCode** | **String** | The navTypeCode of the Fund Calendar Entry. This is the code of the NAV type that this Calendar Entry is associated with. | [default to String]
**timelineId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**previousEntry** | [**PreviousFundCalendarEntry**](PreviousFundCalendarEntry.md) |  | [optional] [default to PreviousFundCalendarEntry]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective at of the Calendar Entry. | [optional] [default to OffsetDateTime]
**entryType** | **String** | The type of the Fund Calendar Entry. Available values: FinalisedValuationPoint, FundEstimateValuationPoint, FundBookmark. | [default to String]
**status** | **String** | The status of the Fund Calendar Entry. Can be &#39;Estimate&#39;, &#39;Unofficial&#39; or &#39;Final&#39;. | [optional] [default to String]
**applyClearDown** | **Boolean** | Set to true if that closed period should have the clear down applied. | [optional] [default to Boolean]
**leaderNavTypeCode** | **String** | The code of the Nav Type that this Nav Type will follow when set. | [optional] [default to String]
**variants** | [**List&lt;EstimateVariant&gt;**](EstimateVariant.md) | The variants of the Estimate Valuation Point.  | [optional] [default to List<EstimateVariant>]

```java
import com.finbourne.sdk.services.lusid.model.FundEstimateValuationPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String navTypeCode = "example navTypeCode";
ResourceId timelineId = new ResourceId();
PreviousFundCalendarEntry previousEntry = new PreviousFundCalendarEntry();
OffsetDateTime effectiveAt = OffsetDateTime.now();
String entryType = "example entryType";
@javax.annotation.Nullable String status = "example status";
Boolean applyClearDown = true;
@javax.annotation.Nullable String leaderNavTypeCode = "example leaderNavTypeCode";
@javax.annotation.Nullable List<EstimateVariant> variants = new List<EstimateVariant>();


FundEstimateValuationPoint fundEstimateValuationPointInstance = new FundEstimateValuationPoint()
    .code(code)
    .navTypeCode(navTypeCode)
    .timelineId(timelineId)
    .previousEntry(previousEntry)
    .effectiveAt(effectiveAt)
    .entryType(entryType)
    .status(status)
    .applyClearDown(applyClearDown)
    .leaderNavTypeCode(leaderNavTypeCode)
    .variants(variants);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)