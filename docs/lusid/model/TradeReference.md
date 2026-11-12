# com.finbourne.sdk.services.lusid.model.TradeReference
classname TradeReference

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingId** | **String** | The holding the trade&#39;s line was valued from. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TradeReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
String holdingId = "example holdingId";


TradeReference tradeReferenceInstance = new TradeReference()
    .portfolioId(portfolioId)
    .holdingId(holdingId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)