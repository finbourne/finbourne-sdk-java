# com.finbourne.sdk.services.lusid.model.CreateTransferResponse
classname CreateTransferResponse
The transfer that was created, and the transaction legs it booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transferType** | **String** | The derived type of the transfer: &#39;Transfer&#39; when the position moves between portfolios, &#39;Switch&#39; when one instrument is exchanged for another within a portfolio, and &#39;Twitch&#39; when the position moves between portfolios and changes instrument at the same time. | [optional] [default to String]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionIdOut** | **String** | The transaction id of the created outgoing leg. | [optional] [default to String]
**transactionIdIn** | **String** | The transaction id of the created incoming leg. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateTransferResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId transferId = new ResourceId();
@javax.annotation.Nullable String transferType = "example transferType";
ResourceId portfolioIdOut = new ResourceId();
ResourceId portfolioIdIn = new ResourceId();
@javax.annotation.Nullable String transactionIdOut = "example transactionIdOut";
@javax.annotation.Nullable String transactionIdIn = "example transactionIdIn";


CreateTransferResponse createTransferResponseInstance = new CreateTransferResponse()
    .transferId(transferId)
    .transferType(transferType)
    .portfolioIdOut(portfolioIdOut)
    .portfolioIdIn(portfolioIdIn)
    .transactionIdOut(transactionIdOut)
    .transactionIdIn(transactionIdIn);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)