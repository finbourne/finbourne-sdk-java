# com.finbourne.sdk.services.lusid.model.CalculateOrderDatesResponse
classname CalculateOrderDatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyDates&gt;**](TransferAgencyDates.md) | A dictionary of successful date calculations, keyed by the request key. | [optional] [default to Map<String, TransferAgencyDates>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed date calculations, keyed by the request key, containing the error details of any failures that occurred during the calculation. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CalculateOrderDatesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, TransferAgencyDates> successes = new Map<String, TransferAgencyDates>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CalculateOrderDatesResponse calculateOrderDatesResponseInstance = new CalculateOrderDatesResponse()
    .successes(successes)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)