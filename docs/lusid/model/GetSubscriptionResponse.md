# com.finbourne.sdk.services.lusid.model.GetSubscriptionResponse
classname GetSubscriptionResponse
The response to a singular subscription read. There is deliberately no failure block on this  type: every route returning it is a singular (or list-of-singular) read, never a batch keyed  lookup, so there is no per-key error to report - an invalid entity is rejected at upsert and  a failed read fails the whole request. The IGetResponse batch members below throw for the  same reason; do not reintroduce a Failed property when copying this shape.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**SubscriptionDefinition**](SubscriptionDefinition.md) |  | [optional] [default to SubscriptionDefinition]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetSubscriptionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
SubscriptionDefinition value = new SubscriptionDefinition();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetSubscriptionResponse getSubscriptionResponseInstance = new GetSubscriptionResponse()
    .href(href)
    .value(value)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)