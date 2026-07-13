# com.finbourne.sdk.services.lusid.model.GetSubscriptionResponse
classname GetSubscriptionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**SubscriptionDefinition**](SubscriptionDefinition.md) |  | [optional] [default to SubscriptionDefinition]
**failed** | [**ErrorDetail**](ErrorDetail.md) |  | [optional] [default to ErrorDetail]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetSubscriptionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
SubscriptionDefinition value = new SubscriptionDefinition();
ErrorDetail failed = new ErrorDetail();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetSubscriptionResponse getSubscriptionResponseInstance = new GetSubscriptionResponse()
    .href(href)
    .value(value)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)