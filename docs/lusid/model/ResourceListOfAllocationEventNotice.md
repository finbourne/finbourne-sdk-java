# com.finbourne.sdk.services.lusid.model.ResourceListOfAllocationEventNotice
classname ResourceListOfAllocationEventNotice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;AllocationEventNotice&gt;**](AllocationEventNotice.md) |  | [default to List<AllocationEventNotice>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResourceListOfAllocationEventNotice;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<AllocationEventNotice> values = new List<AllocationEventNotice>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";


ResourceListOfAllocationEventNotice resourceListOfAllocationEventNoticeInstance = new ResourceListOfAllocationEventNotice()
    .values(values)
    .href(href)
    .links(links)
    .nextPage(nextPage)
    .previousPage(previousPage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)