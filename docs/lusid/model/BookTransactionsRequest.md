# com.finbourne.sdk.services.lusid.model.BookTransactionsRequest
classname BookTransactionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | A collection of Allocation IDs | [default to List<ResourceId>]
**transactionProperties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | A collection of properties | [optional] [default to Map<String, PerpetualProperty>]
**fxInstrumentType** | **String** | The type of FX instrument to create when settlement currency differs from portfolio base currency. Use None to suppress FX instrument and order creation. Defaults to None. Available values: None, FxForward, FxSpot. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BookTransactionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> allocationIds = new List<ResourceId>();
@javax.annotation.Nullable Map<String, PerpetualProperty> transactionProperties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String fxInstrumentType = "example fxInstrumentType";


BookTransactionsRequest bookTransactionsRequestInstance = new BookTransactionsRequest()
    .allocationIds(allocationIds)
    .transactionProperties(transactionProperties)
    .fxInstrumentType(fxInstrumentType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)