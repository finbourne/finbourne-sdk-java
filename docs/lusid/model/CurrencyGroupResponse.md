# com.finbourne.sdk.services.lusid.model.CurrencyGroupResponse
classname CurrencyGroupResponse
A currency group: a set of related currencies sharing a major unit (e.g. GBP with minor unit GBX at 100:1).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the currency group. This uniquely identifies the currency group within the tenant. | [optional] [default to String]
**displayName** | **String** | The name of the currency group. | [optional] [default to String]
**description** | **String** | A description for the currency group. | [optional] [default to String]
**majorUnitCurrency** | **String** | The three to five letter, case-sensitive currency code of the group&#39;s major unit, e.g. GBP for the sterling group. | [optional] [default to String]
**circulationDomain** | **List&lt;String&gt;** | The domains in which the group&#39;s currencies circulate, e.g. ISO 3166 country codes or the ISO 4217 entity names of the countries using the major unit. | [optional] [default to List<String>]
**minorUnits** | [**List&lt;CurrencyGroupMinorUnit&gt;**](CurrencyGroupMinorUnit.md) | The minor unit currencies belonging to this currency group. | [optional] [default to List<CurrencyGroupMinorUnit>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CurrencyGroupResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String majorUnitCurrency = "example majorUnitCurrency";
@javax.annotation.Nullable List<String> circulationDomain = new List<String>();
@javax.annotation.Nullable List<CurrencyGroupMinorUnit> minorUnits = new List<CurrencyGroupMinorUnit>();
Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


CurrencyGroupResponse currencyGroupResponseInstance = new CurrencyGroupResponse()
    .code(code)
    .displayName(displayName)
    .description(description)
    .majorUnitCurrency(majorUnitCurrency)
    .circulationDomain(circulationDomain)
    .minorUnits(minorUnits)
    .version(version)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)