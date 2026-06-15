# com.finbourne.sdk.services.lusid.model.BookTransactionsResponse
classname BookTransactionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, Transaction&gt;**](Transaction.md) |  | [optional] [default to Map<String, Transaction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) |  | [optional] [default to Map<String, ErrorDetail>]
**fxOrders** | [**List&lt;BlockAndOrders&gt;**](BlockAndOrders.md) |  | [optional] [default to List<BlockAndOrders>]

```java
import com.finbourne.sdk.services.lusid.model.BookTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, Transaction> values = new Map<String, Transaction>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<BlockAndOrders> fxOrders = new List<BlockAndOrders>();


BookTransactionsResponse bookTransactionsResponseInstance = new BookTransactionsResponse()
    .values(values)
    .failed(failed)
    .fxOrders(fxOrders);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)