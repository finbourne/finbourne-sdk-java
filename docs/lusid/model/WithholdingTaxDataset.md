# com.finbourne.sdk.services.lusid.model.WithholdingTaxDataset
classname WithholdingTaxDataset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the relational dataset definition. | [default to String]
**code** | **String** | The code of the relational dataset definition. Together with the scope this uniquely identifies the definition. | [default to String]
**dimensions** | [**List&lt;SeriesIdentifierField&gt;**](SeriesIdentifierField.md) | The dimensions created on this dataset as series identifiers, as stored. The mandatory core is not returned here; read the full field schema from the relational dataset definition at Href. | [default to List<SeriesIdentifierField>]
**href** | [**URI**](URI.md) | The specific Uri of the relational dataset definition. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
List<SeriesIdentifierField> dimensions = new List<SeriesIdentifierField>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


WithholdingTaxDataset withholdingTaxDatasetInstance = new WithholdingTaxDataset()
    .scope(scope)
    .code(code)
    .dimensions(dimensions)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)