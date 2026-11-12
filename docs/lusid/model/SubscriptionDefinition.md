# com.finbourne.sdk.services.lusid.model.SubscriptionDefinition
classname SubscriptionDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**timelineId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**timelineProperty** | **String** | A portfolio property key (Portfolio/scope/code) naming a perpetual portfolio property whose value  (scope/code) identifies the timeline for each portfolio. Mutually exclusive with timelineId.  The property must be defined, with a data type of value type ResourceId or String. | [optional] [default to String]
**portfolioFilter** | **String** | A filter, in the syntax of the list portfolios filter, that narrows a wildcard portfolioId to the portfolios  of the scope that match it. Only valid when portfolioId.code is \&quot;*\&quot;. It may use the portfolio&#39;s own fields and  its perpetual Portfolio properties; time-variant and derived properties and relationships are not supported.  A portfolio that starts or stops matching joins or leaves the subscription. | [optional] [default to String]
**addressKeys** | **List&lt;String&gt;** | The set of addresses the subscriber wishes to receive. | [optional] [default to List<String>]
**byTaxLots** | **Boolean** |  | [optional] [default to Boolean]
**subscriptionType** | **String** | Required. The kind of data the subscription streams: before/after effects per  holding (holdings), the transactions themselves (transactions), or each changed holding&#39;s  complete current state (positions). Address keys and byTaxLots are not valid for a  transactions subscription. Available values: Holdings, Transactions, Positions. | [default to String]
**startEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**endEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | Deprecated and no longer honoured: a fixed forward date stops being a forward view once  the live edge passes it. Use effectiveForwardDays instead. Still accepted and echoed back  so existing subscriptions keep round-tripping. | [optional] [default to OffsetDateTime]
**effectiveForwardDays** | **Integer** | How far forward the subscription reports, as a number of calendar days past the live  edge — a rolling forward view that advances as time passes. | [optional] [default to Integer]
**instrumentIdentifiers** | **List&lt;String&gt;** | The instrument identifiers each published holding carries, as Instrument/default/{type} property keys,  for example Instrument/default/ClientInternal. Each must name an instrument identifier type. At most 5.  Not valid for a transactions subscription. | [optional] [default to List<String>]
**reportCurrency** | **String** | The currency the report-currency values are given in, as a three-letter ISO code stored upper-case. Required  when addressKeys names any key other than the quantity, cost, current face, notional cost, variation margin  and currency keys: Holding/Units, Holding/SettledUnits, Holding/Cost/Dom, Holding/Cost/Pfolio,  Holding/CurrentFace, Holding/NotionalCost, Holding/VariationMargin, Holding/VariationMarginInPortfolioCcy,  Holding/HoldingType, Holding/DomCcy and Holding/PortfolioCcy. Not valid for a transactions subscription. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SubscriptionDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId portfolioId = new ResourceId();
ResourceId timelineId = new ResourceId();
@javax.annotation.Nullable String timelineProperty = "example timelineProperty";
@javax.annotation.Nullable String portfolioFilter = "example portfolioFilter";
@javax.annotation.Nullable List<String> addressKeys = new List<String>();
Boolean byTaxLots = true;
String subscriptionType = "example subscriptionType";
@javax.annotation.Nullable OffsetDateTime startEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime endEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable Integer effectiveForwardDays = new Integer("100.00");
@javax.annotation.Nullable List<String> instrumentIdentifiers = new List<String>();
@javax.annotation.Nullable String reportCurrency = "example reportCurrency";


SubscriptionDefinition subscriptionDefinitionInstance = new SubscriptionDefinition()
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .description(description)
    .portfolioId(portfolioId)
    .timelineId(timelineId)
    .timelineProperty(timelineProperty)
    .portfolioFilter(portfolioFilter)
    .addressKeys(addressKeys)
    .byTaxLots(byTaxLots)
    .subscriptionType(subscriptionType)
    .startEffectiveAt(startEffectiveAt)
    .endEffectiveAt(endEffectiveAt)
    .effectiveForwardDays(effectiveForwardDays)
    .instrumentIdentifiers(instrumentIdentifiers)
    .reportCurrency(reportCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)