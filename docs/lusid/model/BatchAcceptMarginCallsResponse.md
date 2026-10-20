# com.finbourne.sdk.services.lusid.model.BatchAcceptMarginCallsResponse
classname BatchAcceptMarginCallsResponse
The outcome of accepting several margin calls: those accepted, and those refused with the reason.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;MarginCall&gt;**](MarginCall.md) | The calls that were accepted. | [default to List<MarginCall>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The calls that could not be accepted, keyed by call id, with the reason. | [default to Map<String, ErrorDetail>]

```java
import com.finbourne.sdk.services.lusid.model.BatchAcceptMarginCallsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<MarginCall> values = new List<MarginCall>();
Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();


BatchAcceptMarginCallsResponse batchAcceptMarginCallsResponseInstance = new BatchAcceptMarginCallsResponse()
    .values(values)
    .failed(failed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)