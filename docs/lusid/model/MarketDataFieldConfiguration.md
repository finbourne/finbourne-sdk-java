# com.finbourne.sdk.services.lusid.model.MarketDataFieldConfiguration
classname MarketDataFieldConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataCategory** | **String** | The category of market data this configuration applies to. Available values: Quote, Complex. | [default to String]
**scope** | **String** | The scope of the market data field configuration. | [default to String]
**metadataFieldSchema** | [**List&lt;MetadataFieldDefinition&gt;**](MetadataFieldDefinition.md) | The metadata field definitions for this configuration. | [default to List<MetadataFieldDefinition>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.MarketDataFieldConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String marketDataCategory = "example marketDataCategory";
String scope = "example scope";
List<MetadataFieldDefinition> metadataFieldSchema = new List<MetadataFieldDefinition>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


MarketDataFieldConfiguration marketDataFieldConfigurationInstance = new MarketDataFieldConfiguration()
    .marketDataCategory(marketDataCategory)
    .scope(scope)
    .metadataFieldSchema(metadataFieldSchema)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)