# com.finbourne.sdk.services.lusid.model.OverrideVirtualTransactionsResponse
classname OverrideVirtualTransactionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to unresolved instruments or non-existent transaction types for the override transactions. | [optional] [default to Map<String, List<ResponseMetaData>>]
**instrumentEventId** | **String** | The identifier of the instrument event that was overridden. | [default to String]
**cancelInstructionId** | **String** | The identifier of the cancel instruction that was created for the overridden instrument event. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.OverrideVirtualTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
String instrumentEventId = "example instrumentEventId";
String cancelInstructionId = "example cancelInstructionId";
@javax.annotation.Nullable List<Link> links = new List<Link>();


OverrideVirtualTransactionsResponse overrideVirtualTransactionsResponseInstance = new OverrideVirtualTransactionsResponse()
    .version(version)
    .href(href)
    .metadata(metadata)
    .instrumentEventId(instrumentEventId)
    .cancelInstructionId(cancelInstructionId)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)