# com.finbourne.sdk.services.lusid.model.PagedResourceListOfInstrumentEventHolder
classname PagedResourceListOfInstrumentEventHolder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**values** | [**List&lt;InstrumentEventHolder&gt;**](InstrumentEventHolder.md) |  | [default to List<InstrumentEventHolder>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PagedResourceListOfInstrumentEventHolder;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
List<InstrumentEventHolder> values = new List<InstrumentEventHolder>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


PagedResourceListOfInstrumentEventHolder pagedResourceListOfInstrumentEventHolderInstance = new PagedResourceListOfInstrumentEventHolder()
    .nextPage(nextPage)
    .previousPage(previousPage)
    .values(values)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)