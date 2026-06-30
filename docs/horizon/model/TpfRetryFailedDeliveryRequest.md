# com.finbourne.sdk.services.horizon.model.TpfRetryFailedDeliveryRequest
classname TpfRetryFailedDeliveryRequest
Request to retry failed deliveries for multiple batch elements. The integration instance identifier is supplied via the route, not the body.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchElementReferenceIds** | **List&lt;String&gt;** | Batch element reference identifiers to retry. No regex pattern is required as batch element IDs are vendor-defined strings with varying formats. | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.TpfRetryFailedDeliveryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> batchElementReferenceIds = new List<String>();


TpfRetryFailedDeliveryRequest tpfRetryFailedDeliveryRequestInstance = new TpfRetryFailedDeliveryRequest()
    .batchElementReferenceIds(batchElementReferenceIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)