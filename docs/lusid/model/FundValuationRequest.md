# com.finbourne.sdk.services.lusid.model.FundValuationRequest
classname FundValuationRequest
Specification object for the parameters of a valuation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to use. | [optional] [default to OffsetDateTime]
**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) | The set of specifications to calculate or retrieve during the valuation and present in the results. For example:  AggregateSpec(&#39;Valuation/PV&#39;,&#39;Sum&#39;) for returning the PV (present value) of holdings  AggregateSpec(&#39;Holding/default/Units&#39;,&#39;Sum&#39;) for returning the units of holidays  AggregateSpec(&#39;Instrument/default/LusidInstrumentId&#39;,&#39;Value&#39;) for returning the Lusid Instrument identifier | [default to List<AggregateSpec>]
**groupBy** | **List&lt;String&gt;** | The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out. | [optional] [default to List<String>]
**filters** | [**List&lt;PropertyFilter&gt;**](PropertyFilter.md) | A set of filters to use to reduce the data found in a request. Equivalent to the &#39;where ...&#39; part of a Sql select statement.  For example, filter a set of values within a given range or matching a particular value. | [optional] [default to List<PropertyFilter>]
**sort** | [**List&lt;OrderBySpec&gt;**](OrderBySpec.md) | A (possibly empty/null) set of specifications for how to order the results. | [optional] [default to List<OrderBySpec>]
**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. | [optional] [default to Boolean]
**returnResultAsExpandedTypes** | **Boolean** | Financially meaningful results can be presented as either simple flat types or more complex expanded types.  For example, the present value (PV) of a holding could be represented either as a simple decimal (with currency implied)  or as a decimal-currency pair. This flag allows either representation to be returned. In the PV example,  the returned value would be the decimal-currency pair if this flag is true, or the decimal only if this flag is false. | [optional] [default to Boolean]
**includeOrderFlow** | [**OrderFlowConfiguration**](OrderFlowConfiguration.md) |  | [optional] [default to OrderFlowConfiguration]
**fundValuationSchedule** | [**FundValuationSchedule**](FundValuationSchedule.md) |  | [default to FundValuationSchedule]
**marketDataOverrides** | [**MarketDataOverrides**](MarketDataOverrides.md) |  | [optional] [default to MarketDataOverrides]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.FundValuationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
List<AggregateSpec> metrics = new List<AggregateSpec>();
@javax.annotation.Nullable List<String> groupBy = new List<String>();
@javax.annotation.Nullable List<PropertyFilter> filters = new List<PropertyFilter>();
@javax.annotation.Nullable List<OrderBySpec> sort = new List<OrderBySpec>();
Boolean equipWithSubtotals = true;
Boolean returnResultAsExpandedTypes = true;
OrderFlowConfiguration includeOrderFlow = new OrderFlowConfiguration();
FundValuationSchedule fundValuationSchedule = new FundValuationSchedule();
MarketDataOverrides marketDataOverrides = new MarketDataOverrides();
ResourceId corporateActionSourceId = new ResourceId();


FundValuationRequest fundValuationRequestInstance = new FundValuationRequest()
    .asAt(asAt)
    .metrics(metrics)
    .groupBy(groupBy)
    .filters(filters)
    .sort(sort)
    .equipWithSubtotals(equipWithSubtotals)
    .returnResultAsExpandedTypes(returnResultAsExpandedTypes)
    .includeOrderFlow(includeOrderFlow)
    .fundValuationSchedule(fundValuationSchedule)
    .marketDataOverrides(marketDataOverrides)
    .corporateActionSourceId(corporateActionSourceId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)