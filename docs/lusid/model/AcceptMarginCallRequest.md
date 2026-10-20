# com.finbourne.sdk.services.lusid.model.AcceptMarginCallRequest
classname AcceptMarginCallRequest
Accepts a margin call, at its default agreed amount or the amount given.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreedAmount** | **java.math.BigDecimal** | The amount to accept. Optional when the call is matched or within tolerance, when our call or the counterparty&#39;s demand is taken; required when the demand breaks tolerance or has not been recorded. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AcceptMarginCallRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal agreedAmount = new java.math.BigDecimal("100.00");


AcceptMarginCallRequest acceptMarginCallRequestInstance = new AcceptMarginCallRequest()
    .agreedAmount(agreedAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)