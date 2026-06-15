# com.finbourne.sdk.services.lusid.model.TranslateTradeTicketsResponse
classname TranslateTradeTicketsResponse
A response from a request to translate a collection of instruments to a given target dialect.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, TradeTicket&gt;**](TradeTicket.md) | The instruments which have been successfully translated. | [optional] [default to Map<String, TradeTicket>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The instruments that could not be translated along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TranslateTradeTicketsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, TradeTicket> values = new Map<String, TradeTicket>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TranslateTradeTicketsResponse translateTradeTicketsResponseInstance = new TranslateTradeTicketsResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)