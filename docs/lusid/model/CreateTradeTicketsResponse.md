# com.finbourne.sdk.services.lusid.model.CreateTradeTicketsResponse
classname CreateTradeTicketsResponse
Batch trade ticket creation response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;LusidTradeTicket&gt;**](LusidTradeTicket.md) |  | [default to List<LusidTradeTicket>]
**failures** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) |  | [default to List<ErrorDetail>]

```java
import com.finbourne.sdk.services.lusid.model.CreateTradeTicketsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<LusidTradeTicket> values = new List<LusidTradeTicket>();
List<ErrorDetail> failures = new List<ErrorDetail>();


CreateTradeTicketsResponse createTradeTicketsResponseInstance = new CreateTradeTicketsResponse()
    .values(values)
    .failures(failures);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)