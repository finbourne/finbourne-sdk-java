# com.finbourne.sdk.services.identity.model.ListUsersResponse
classname ListUsersResponse
Users directory query response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | Uri of this response | [optional] [default to URI]
**values** | [**Map&lt;String, UserSummary&gt;**](UserSummary.md) | Successful entities, indexed by their id | [optional] [default to Map<String, UserSummary>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | Failed entities, indexed by their id | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.identity.model.ListUsersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, UserSummary> values = new Map<String, UserSummary>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ListUsersResponse listUsersResponseInstance = new ListUsersResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)