# com.finbourne.sdk.services.lusid.model.BatchAcceptMarginCallsRequest
classname BatchAcceptMarginCallsRequest
Accepts several margin calls at their default agreed amounts, reporting the ones that could not be accepted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calls** | [**List&lt;MarginCallKey&gt;**](MarginCallKey.md) | The calls to accept, each at its default agreed amount. A call that cannot be accepted is reported in failed and does not stop the others. | [default to List<MarginCallKey>]

```java
import com.finbourne.sdk.services.lusid.model.BatchAcceptMarginCallsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<MarginCallKey> calls = new List<MarginCallKey>();


BatchAcceptMarginCallsRequest batchAcceptMarginCallsRequestInstance = new BatchAcceptMarginCallsRequest()
    .calls(calls);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)