# com.finbourne.sdk.services.lusid.model.BucketedCashFlowResponse
classname BucketedCashFlowResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**data** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) | List of dictionary bucketed cash flow result set.  Each dictionary represent a bucketed cashflow result set keyed by AddressKeys.  e.g. dictionary[\&quot;Valuation/CashFlowAmount\&quot;] for the aggregated cash flow amount for the bucket.  e.g. suppose \&quot;RoundUp\&quot; method, then dictionary[\&quot;Valuation/CashFlowDate/RoundUp\&quot;] returns the bucketed cashflow date. | [optional] [default to List<Map<String, Object>>]
**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCcy denominated queries.  If not present then the currency of the relevant portfolio will be used in its place where relevant. | [optional] [default to String]
**dataSchema** | [**ResultDataSchema**](ResultDataSchema.md) |  | [optional] [default to ResultDataSchema]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | Information about where instruments have failed to return cashflows in so far as it is available.  e.g., failure to retrieve a market quote for a floating rate instrument. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BucketedCashFlowResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Map<String, Object>> data = new List<Map<String, Object>>();
@javax.annotation.Nullable String reportCurrency = "example reportCurrency";
ResultDataSchema dataSchema = new ResultDataSchema();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BucketedCashFlowResponse bucketedCashFlowResponseInstance = new BucketedCashFlowResponse()
    .href(href)
    .data(data)
    .reportCurrency(reportCurrency)
    .dataSchema(dataSchema)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)