# com.finbourne.sdk.services.lusid.model.OrderInstructionSetRequest
classname OrderInstructionSetRequest
A request to create or update multiple OrderInstructions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;OrderInstructionRequest&gt;**](OrderInstructionRequest.md) | A collection of OrderInstructionRequests. | [optional] [default to List<OrderInstructionRequest>]

```java
import com.finbourne.sdk.services.lusid.model.OrderInstructionSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<OrderInstructionRequest> requests = new List<OrderInstructionRequest>();


OrderInstructionSetRequest orderInstructionSetRequestInstance = new OrderInstructionSetRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)