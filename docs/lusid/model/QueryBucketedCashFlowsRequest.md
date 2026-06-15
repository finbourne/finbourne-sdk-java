# com.finbourne.sdk.services.lusid.model.QueryBucketedCashFlowsRequest
classname QueryBucketedCashFlowsRequest
Query for bucketed cashflows from one or more portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for bucketed cashflows. | [optional] [default to OffsetDateTime]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  There is no lower bound if this is not specified. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  The upper bound defaults to &#39;today&#39; if it is not specified | [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. | [default to OffsetDateTime]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**roundingMethod** | **String** | When bucketing, there is not a unique way to allocate the bucket points. Available values: RoundUp, RoundDown. | [default to String]
**bucketingDates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | A list of dates to perform cashflow bucketing upon.  If this is provided, the list of tenors for bucketing should be empty. | [optional] [default to List<OffsetDateTime>]
**bucketingTenors** | **List&lt;String&gt;** | A list of tenors to perform cashflow bucketing upon.  If this is provided, the list of dates for bucketing should be empty. | [optional] [default to List<String>]
**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries. | [default to String]
**groupBy** | **List&lt;String&gt;** | The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out. | [optional] [default to List<String>]
**addresses** | **List&lt;String&gt;** | The set of items that the user wishes to see in the results. If empty, will be defaulted to standard ones. | [optional] [default to List<String>]
**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. | [optional] [default to Boolean]
**excludeUnsettledTrades** | **Boolean** | Flag directing the Valuation call to exclude cashflows from unsettled trades.  If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. | [optional] [default to Boolean]
**cashFlowType** | **String** | Indicate the requested cash flow representation InstrumentCashFlows or PortfolioCashFlows (GetCashLadder uses this). Available values: InstrumentCashFlow, PortfolioCashFlow, TransactionCashFlow. | [optional] [default to String]
**bucketingSchedule** | [**BucketingSchedule**](BucketingSchedule.md) |  | [optional] [default to BucketingSchedule]
**filter** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.QueryBucketedCashFlowsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
OffsetDateTime windowStart = OffsetDateTime.now();
OffsetDateTime windowEnd = OffsetDateTime.now();
List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime effectiveAt = OffsetDateTime.now();
ResourceId recipeId = new ResourceId();
String roundingMethod = "example roundingMethod";
@javax.annotation.Nullable List<OffsetDateTime> bucketingDates = new List<OffsetDateTime>();
@javax.annotation.Nullable List<String> bucketingTenors = new List<String>();
String reportCurrency = "example reportCurrency";
@javax.annotation.Nullable List<String> groupBy = new List<String>();
@javax.annotation.Nullable List<String> addresses = new List<String>();
Boolean equipWithSubtotals = true;
Boolean excludeUnsettledTrades = true;
@javax.annotation.Nullable String cashFlowType = "example cashFlowType";
BucketingSchedule bucketingSchedule = new BucketingSchedule();
@javax.annotation.Nullable String filter = "example filter";


QueryBucketedCashFlowsRequest queryBucketedCashFlowsRequestInstance = new QueryBucketedCashFlowsRequest()
    .asAt(asAt)
    .windowStart(windowStart)
    .windowEnd(windowEnd)
    .portfolioEntityIds(portfolioEntityIds)
    .effectiveAt(effectiveAt)
    .recipeId(recipeId)
    .roundingMethod(roundingMethod)
    .bucketingDates(bucketingDates)
    .bucketingTenors(bucketingTenors)
    .reportCurrency(reportCurrency)
    .groupBy(groupBy)
    .addresses(addresses)
    .equipWithSubtotals(equipWithSubtotals)
    .excludeUnsettledTrades(excludeUnsettledTrades)
    .cashFlowType(cashFlowType)
    .bucketingSchedule(bucketingSchedule)
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)