# com.finbourne.sdk.services.lusid.model.Transfer
classname Transfer
A transfer and both of the transactions it booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transferType** | **String** | The derived type of the transfer: &#39;Transfer&#39; when the position moves between portfolios, &#39;Switch&#39; when one instrument is exchanged for another within a portfolio, and &#39;Twitch&#39; when the position moves between portfolios and changes instrument at the same time. | [optional] [default to String]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionOut** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**transactionIn** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties of the transfer, for the requested PropertyKeys. | [optional] [default to Map<String, Property>]
**href** | [**URI**](URI.md) | The specifc Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Transfer;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId transferId = new ResourceId();
@javax.annotation.Nullable String transferType = "example transferType";
ResourceId portfolioIdOut = new ResourceId();
ResourceId portfolioIdIn = new ResourceId();
Transaction transactionOut = new Transaction();
Transaction transactionIn = new Transaction();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Transfer transferInstance = new Transfer()
    .transferId(transferId)
    .transferType(transferType)
    .portfolioIdOut(portfolioIdOut)
    .portfolioIdIn(portfolioIdIn)
    .transactionOut(transactionOut)
    .transactionIn(transactionIn)
    .properties(properties)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)