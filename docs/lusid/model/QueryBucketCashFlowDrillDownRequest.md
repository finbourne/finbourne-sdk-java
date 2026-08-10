# com.finbourne.sdk.services.lusid.model.QueryBucketCashFlowDrillDownRequest
classname QueryBucketCashFlowDrillDownRequest
Query for the individual cashflows inside a single cashflow bucket, with their source lineage.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for cashflows. | [optional] [default to OffsetDateTime]
**bucketStart** | [**OffsetDateTime**](OffsetDateTime.md) | The lower bound effective datetime of the bucket from which to retrieve the cashflows. | [default to OffsetDateTime]
**bucketEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The upper bound effective datetime of the bucket from which to retrieve the cashflows. | [default to OffsetDateTime]
**startInclusive** | **Boolean** | Whether a cashflow paid exactly on the bucket start is included in the bucket. Defaults to true. | [optional] [default to Boolean]
**endInclusive** | **Boolean** | Whether a cashflow paid exactly on the bucket end is included in the bucket. Defaults to true. | [optional] [default to Boolean]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the cashflows must belong. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up. | [default to OffsetDateTime]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries. | [default to String]
**excludeUnsettledTrades** | **Boolean** | If set to true, unsettled trades are excluded from the result set. Set this to match the value used on the bucketed cash flow query being drilled into, so the individual cash flows reconcile with the bucket. | [optional] [default to Boolean]
**haircutRules** | [**List&lt;CashFlowHaircutRule&gt;**](CashFlowHaircutRule.md) | Optional ordered haircut rules applied to cashflow inflows; the first matching rule wins and a rule with no criteria acts as a catch-all. When supplied, each returned cashflow carries its gross amount, haircut fraction, net amount and the rule that was applied; with no rules those fields are omitted and the results are unchanged. | [optional] [default to List<CashFlowHaircutRule>]

```java
import com.finbourne.sdk.services.lusid.model.QueryBucketCashFlowDrillDownRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
OffsetDateTime bucketStart = OffsetDateTime.now();
OffsetDateTime bucketEnd = OffsetDateTime.now();
Boolean startInclusive = true;
Boolean endInclusive = true;
List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime effectiveAt = OffsetDateTime.now();
ResourceId recipeId = new ResourceId();
String reportCurrency = "example reportCurrency";
Boolean excludeUnsettledTrades = true;
@javax.annotation.Nullable List<CashFlowHaircutRule> haircutRules = new List<CashFlowHaircutRule>();


QueryBucketCashFlowDrillDownRequest queryBucketCashFlowDrillDownRequestInstance = new QueryBucketCashFlowDrillDownRequest()
    .asAt(asAt)
    .bucketStart(bucketStart)
    .bucketEnd(bucketEnd)
    .startInclusive(startInclusive)
    .endInclusive(endInclusive)
    .portfolioEntityIds(portfolioEntityIds)
    .effectiveAt(effectiveAt)
    .recipeId(recipeId)
    .reportCurrency(reportCurrency)
    .excludeUnsettledTrades(excludeUnsettledTrades)
    .haircutRules(haircutRules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)