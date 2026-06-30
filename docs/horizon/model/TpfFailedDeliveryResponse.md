# com.finbourne.sdk.services.horizon.model.TpfFailedDeliveryResponse
classname TpfFailedDeliveryResponse
Response for bulk retry operation of failed deliveries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitted** | **Integer** | Number of batch elements submitted for retry | [default to Integer]
**results** | [**List&lt;TpfRetryElementResult&gt;**](TpfRetryElementResult.md) | Per-element retry results | [default to List<TpfRetryElementResult>]

```java
import com.finbourne.sdk.services.horizon.model.TpfFailedDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer submitted = new Integer("100.00");
List<TpfRetryElementResult> results = new List<TpfRetryElementResult>();


TpfFailedDeliveryResponse tpfFailedDeliveryResponseInstance = new TpfFailedDeliveryResponse()
    .submitted(submitted)
    .results(results);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)