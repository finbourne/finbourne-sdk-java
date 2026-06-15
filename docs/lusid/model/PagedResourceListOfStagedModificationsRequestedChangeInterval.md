# com.finbourne.sdk.services.lusid.model.PagedResourceListOfStagedModificationsRequestedChangeInterval
classname PagedResourceListOfStagedModificationsRequestedChangeInterval

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**values** | [**List&lt;StagedModificationsRequestedChangeInterval&gt;**](StagedModificationsRequestedChangeInterval.md) |  | [default to List<StagedModificationsRequestedChangeInterval>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PagedResourceListOfStagedModificationsRequestedChangeInterval;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
List<StagedModificationsRequestedChangeInterval> values = new List<StagedModificationsRequestedChangeInterval>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


PagedResourceListOfStagedModificationsRequestedChangeInterval pagedResourceListOfStagedModificationsRequestedChangeIntervalInstance = new PagedResourceListOfStagedModificationsRequestedChangeInterval()
    .nextPage(nextPage)
    .previousPage(previousPage)
    .values(values)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)