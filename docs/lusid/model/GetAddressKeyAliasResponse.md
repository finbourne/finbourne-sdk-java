# com.finbourne.sdk.services.lusid.model.GetAddressKeyAliasResponse
classname GetAddressKeyAliasResponse
The response to a singular address key alias read. There is deliberately no failure block on this  type: every route returning it is a singular (or list-of-singular) read, never a batch keyed  lookup, so there is no per-key error to report - an invalid entity is rejected at upsert and  a failed read fails the whole request. The IGetResponse batch members below throw for the  same reason; do not reintroduce a Failed property when copying this shape.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**AddressKeyAlias**](AddressKeyAlias.md) |  | [optional] [default to AddressKeyAlias]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetAddressKeyAliasResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
AddressKeyAlias value = new AddressKeyAlias();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetAddressKeyAliasResponse getAddressKeyAliasResponseInstance = new GetAddressKeyAliasResponse()
    .href(href)
    .value(value)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)