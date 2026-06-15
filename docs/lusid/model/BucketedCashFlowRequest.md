# com.finbourne.sdk.services.lusid.model.BucketedCashFlowRequest
classname BucketedCashFlowRequest
Specification class consisting of parameters for BucketedCashFlow endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roundingMethod** | **String** | When bucketing, there is not a unique way to allocate the bucket points. Available values: RoundUp, RoundDown. | [default to String]
**bucketingDates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | A list of dates to perform cashflow bucketing upon.  If this is provided, the list of tenors for bucketing should be empty. | [optional] [default to List<OffsetDateTime>]
**bucketTenors** | **List&lt;String&gt;** | A list of tenors to perform cashflow bucketing upon.  If this is provided, the list of dates for bucketing should be empty. | [optional] [default to List<String>]
**effectiveAt** | **String** | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. | [optional] [default to String]
**windowStart** | **String** | The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  There is no lower bound if this is not specified. | [optional] [default to String]
**windowEnd** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  The upper bound defaults to &#39;today&#39; if it is not specified | [optional] [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries. | [optional] [default to String]
**groupBy** | **List&lt;String&gt;** | The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out. | [optional] [default to List<String>]
**addresses** | **List&lt;String&gt;** | The set of items that the user wishes to see in the results. If empty, will be defaulted to standard ones. | [optional] [default to List<String>]
**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. | [optional] [default to Boolean]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for bucketed cashflows. | [optional] [default to OffsetDateTime]
**excludeUnsettledTrades** | **Boolean** | Flag directing the Valuation call to exclude cashflows from unsettled trades.  If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. | [optional] [default to Boolean]
**cashFlowType** | **String** | Indicate the requested cash flow representation InstrumentCashFlows or PortfolioCashFlows (GetCashLadder uses this). Available values: InstrumentCashFlow, PortfolioCashFlow, TransactionCashFlow. | [optional] [default to String]
**bucketingSchedule** | [**BucketingSchedule**](BucketingSchedule.md) |  | [optional] [default to BucketingSchedule]
**filter** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BucketedCashFlowRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String roundingMethod = "example roundingMethod";
@javax.annotation.Nullable List<OffsetDateTime> bucketingDates = new List<OffsetDateTime>();
@javax.annotation.Nullable List<String> bucketTenors = new List<String>();
@javax.annotation.Nullable String effectiveAt = "example effectiveAt";
@javax.annotation.Nullable String windowStart = "example windowStart";
@javax.annotation.Nullable String windowEnd = "example windowEnd";
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable String reportCurrency = "example reportCurrency";
@javax.annotation.Nullable List<String> groupBy = new List<String>();
@javax.annotation.Nullable List<String> addresses = new List<String>();
Boolean equipWithSubtotals = true;
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
Boolean excludeUnsettledTrades = true;
@javax.annotation.Nullable String cashFlowType = "example cashFlowType";
BucketingSchedule bucketingSchedule = new BucketingSchedule();
@javax.annotation.Nullable String filter = "example filter";


BucketedCashFlowRequest bucketedCashFlowRequestInstance = new BucketedCashFlowRequest()
    .roundingMethod(roundingMethod)
    .bucketingDates(bucketingDates)
    .bucketTenors(bucketTenors)
    .effectiveAt(effectiveAt)
    .windowStart(windowStart)
    .windowEnd(windowEnd)
    .recipeId(recipeId)
    .reportCurrency(reportCurrency)
    .groupBy(groupBy)
    .addresses(addresses)
    .equipWithSubtotals(equipWithSubtotals)
    .asAt(asAt)
    .excludeUnsettledTrades(excludeUnsettledTrades)
    .cashFlowType(cashFlowType)
    .bucketingSchedule(bucketingSchedule)
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)