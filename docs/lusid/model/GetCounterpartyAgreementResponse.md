# com.finbourne.sdk.services.lusid.model.GetCounterpartyAgreementResponse
classname GetCounterpartyAgreementResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**value** | [**CounterpartyAgreement**](CounterpartyAgreement.md) |  | [optional] [default to CounterpartyAgreement]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The counterparty agreement that could not be retrieved along with a reason for failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetCounterpartyAgreementResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
CounterpartyAgreement value = new CounterpartyAgreement();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetCounterpartyAgreementResponse getCounterpartyAgreementResponseInstance = new GetCounterpartyAgreementResponse()
    .href(href)
    .value(value)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)