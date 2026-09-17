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
**addressKeys** | **List&lt;String&gt;** | The set of addresses the subscriber wishes to receive. | [optional] [default to List<String>]
**byTaxLots** | **Boolean** |  | [optional] [default to Boolean]
**subscriptionType** | **String** | The kind of data the subscription streams (holdings or transactions), defaulting to holdings.  Address keys and byTaxLots are not valid for a transactions subscription. Available values: Holdings, Transactions. | [optional] [default to String]
**startEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**endEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | Deprecated and no longer honoured: a fixed forward date stops being a forward view once  the live edge passes it. Use effectiveForwardDays instead. Still accepted and echoed back  so existing subscriptions keep round-tripping. | [optional] [default to OffsetDateTime]
**effectiveForwardDays** | **Integer** | How far forward the subscription reports, as a number of calendar days past the live  edge — a rolling forward view that advances as time passes. | [optional] [default to Integer]

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
@javax.annotation.Nullable List<String> addressKeys = new List<String>();
Boolean byTaxLots = true;
@javax.annotation.Nullable String subscriptionType = "example subscriptionType";
@javax.annotation.Nullable OffsetDateTime startEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime endEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable Integer effectiveForwardDays = new Integer("100.00");


SubscriptionDefinition subscriptionDefinitionInstance = new SubscriptionDefinition()
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .description(description)
    .portfolioId(portfolioId)
    .timelineId(timelineId)
    .addressKeys(addressKeys)
    .byTaxLots(byTaxLots)
    .subscriptionType(subscriptionType)
    .startEffectiveAt(startEffectiveAt)
    .endEffectiveAt(endEffectiveAt)
    .effectiveForwardDays(effectiveForwardDays);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)