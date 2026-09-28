# com.finbourne.sdk.services.lusid.model.WithholdingTaxConfiguration
classname WithholdingTaxConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**anomalyDataset** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**mainDataset** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourcePriority** | **List&lt;String&gt;** | The rule sources in priority order, most preferred first. Optional: a single-source customer configures none and leaves ruleSource blank on every rate row, in which case no source filter is applied and specificity alone decides. | [optional] [default to List<String>]
**valueSources** | [**List&lt;WithholdingTaxValueSource&gt;**](WithholdingTaxValueSource.md) | One declaration per customer-defined matching dimension across both datasets, naming where the engine reads that dimension&#39;s value from. A dataset column name cannot imply a storage location, so a declaration is required for every customer dimension: an unmapped dimension is never supplied by the matching request, so no row ever matches on it and the customer silently gets a broader rate than they configured. No declaration is required for taxCountry or profileType, which the engine fills from the waterfall, nor for ruleSource, which is compared against SourcePriority. | [optional] [default to List<WithholdingTaxValueSource>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
ResourceId anomalyDataset = new ResourceId();
ResourceId mainDataset = new ResourceId();
@javax.annotation.Nullable List<String> sourcePriority = new List<String>();
@javax.annotation.Nullable List<WithholdingTaxValueSource> valueSources = new List<WithholdingTaxValueSource>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


WithholdingTaxConfiguration withholdingTaxConfigurationInstance = new WithholdingTaxConfiguration()
    .href(href)
    .id(id)
    .anomalyDataset(anomalyDataset)
    .mainDataset(mainDataset)
    .sourcePriority(sourcePriority)
    .valueSources(valueSources)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)