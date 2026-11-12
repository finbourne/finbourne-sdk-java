# com.finbourne.sdk.services.lusid.model.TaxClassificationDetail
classname TaxClassificationDetail
A single instrument's classification with the version history of every input behind it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**classification** | [**TaxClassification**](TaxClassification.md) |  | [default to TaxClassification]
**history** | [**List&lt;TaxClassificationFieldVersion&gt;**](TaxClassificationFieldVersion.md) | Every version of every classification input and override for the instrument, oldest first. | [default to List<TaxClassificationFieldVersion>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TaxClassificationDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
TaxClassification classification = new TaxClassification();
List<TaxClassificationFieldVersion> history = new List<TaxClassificationFieldVersion>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TaxClassificationDetail taxClassificationDetailInstance = new TaxClassificationDetail()
    .href(href)
    .classification(classification)
    .history(history)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)