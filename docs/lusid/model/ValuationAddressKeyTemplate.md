# com.finbourne.sdk.services.lusid.model.ValuationAddressKeyTemplate
classname ValuationAddressKeyTemplate
A set of valuation metrics and grouping keys. Funds and NAV Types reference a template by its id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Valuation Template. | [optional] [default to String]
**description** | **String** | A description of the Valuation Template. | [optional] [default to String]
**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) | The metrics to calculate in a valuation that uses this template. Each metric is an address key, an operation and optional key options. Valuation Templates do not support returnAs. | [optional] [default to List<AggregateSpec>]
**isDefault** | **Boolean** | True if this is the default Valuation Template, which applies when neither the Fund nor the NAV Type references a template. A domain has one default. Set isDefault on UpsertValuationAddressKeyTemplate to change it. | [optional] [default to Boolean]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationAddressKeyTemplate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<AggregateSpec> metrics = new List<AggregateSpec>();
Boolean isDefault = true;
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ValuationAddressKeyTemplate valuationAddressKeyTemplateInstance = new ValuationAddressKeyTemplate()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .metrics(metrics)
    .isDefault(isDefault)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)