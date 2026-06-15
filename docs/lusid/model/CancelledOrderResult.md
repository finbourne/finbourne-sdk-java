# com.finbourne.sdk.services.lusid.model.CancelledOrderResult
classname CancelledOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderState** | [**Order**](Order.md) |  | [optional] [default to Order]

```java
import com.finbourne.sdk.services.lusid.model.CancelledOrderResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

Order orderState = new Order();


CancelledOrderResult cancelledOrderResultInstance = new CancelledOrderResult()
    .orderState(orderState);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)