# com.finbourne.sdk.services.horizon.model.ResolveFailedDeliveryRequest
classname ResolveFailedDeliveryRequest
Request to resolve a failed delivery without retry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | The reason for resolving the failed delivery without retrying. | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ResolveFailedDeliveryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String reason = "example reason";


ResolveFailedDeliveryRequest resolveFailedDeliveryRequestInstance = new ResolveFailedDeliveryRequest()
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)