# com.finbourne.sdk.services.lusid.model.ValuationPointDataResponse
classname ValuationPointDataResponse
The Valuation Point Data Response for the Fund and specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**type** | **String** | The Type of the associated Diary Entry (&#39;PeriodBoundary&#39;,&#39;ValuationPoint&#39;,&#39;Other&#39; or &#39;Adhoc&#39; when a diary entry wasn&#39;t used). Available values: PeriodBoundary, ValuationPoint, Other, Adhoc. | [default to String]
**status** | **String** | The status of a Diary Entry of Type &#39;ValuationPoint&#39;. Defaults to &#39;Estimate&#39; when upserting a diary entry, moves to &#39;Candidate&#39; or &#39;Final&#39; when a ValuationPoint is accepted, and &#39;Final&#39; when it is finalised.  The status of a Diary Entry becomes &#39;Unofficial&#39; when a diary entry wasn&#39;t used. Available values: Undefined, Estimate, Final, Candidate, Rejected, Unofficial. | [default to String]
**fundDetails** | [**FundDetails**](FundDetails.md) |  | [default to FundDetails]
**fundValuationPointData** | [**FundValuationPointData**](FundValuationPointData.md) |  | [default to FundValuationPointData]
**shareClassData** | [**List&lt;ShareClassData&gt;**](ShareClassData.md) | The data for all share classes in fund. Share classes are identified by their short codes. | [default to List<ShareClassData>]
**valuationPointCode** | **String** | The code of the valuation point. | [optional] [default to String]
**previousValuationPointCode** | **String** | The code of the previous valuation point. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPointDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String type = "example type";
String status = "example status";
FundDetails fundDetails = new FundDetails();
FundValuationPointData fundValuationPointData = new FundValuationPointData();
List<ShareClassData> shareClassData = new List<ShareClassData>();
@javax.annotation.Nullable String valuationPointCode = "example valuationPointCode";
@javax.annotation.Nullable String previousValuationPointCode = "example previousValuationPointCode";
@javax.annotation.Nullable List<Link> links = new List<Link>();


ValuationPointDataResponse valuationPointDataResponseInstance = new ValuationPointDataResponse()
    .href(href)
    .type(type)
    .status(status)
    .fundDetails(fundDetails)
    .fundValuationPointData(fundValuationPointData)
    .shareClassData(shareClassData)
    .valuationPointCode(valuationPointCode)
    .previousValuationPointCode(previousValuationPointCode)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)