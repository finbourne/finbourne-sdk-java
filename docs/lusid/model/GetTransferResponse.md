# com.finbourne.sdk.services.lusid.model.GetTransferResponse
classname GetTransferResponse
A transfer and both of the transactions it booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transferType** | **String** |  | [optional] [default to String]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionOut** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**transactionIn** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) |  | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.GetTransferResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId transferId = new ResourceId();
@javax.annotation.Nullable String transferType = "example transferType";
ResourceId portfolioIdOut = new ResourceId();
ResourceId portfolioIdIn = new ResourceId();
Transaction transactionOut = new Transaction();
Transaction transactionIn = new Transaction();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


GetTransferResponse getTransferResponseInstance = new GetTransferResponse()
    .transferId(transferId)
    .transferType(transferType)
    .portfolioIdOut(portfolioIdOut)
    .portfolioIdIn(portfolioIdIn)
    .transactionOut(transactionOut)
    .transactionIn(transactionIn)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)