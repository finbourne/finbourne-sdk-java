# com.finbourne.sdk.services.lusid.model.UpsertCorporateActionsResponse
classname UpsertCorporateActionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, CorporateAction&gt;**](CorporateAction.md) | The corporate actions which have been successfully updated or inserted. | [optional] [default to Map<String, CorporateAction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The corporate actions that could not be updated or inserted along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertCorporateActionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, CorporateAction> values = new Map<String, CorporateAction>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertCorporateActionsResponse upsertCorporateActionsResponseInstance = new UpsertCorporateActionsResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)