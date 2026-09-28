# com.finbourne.sdk.services.lusid.model.RecResultLinkKey
classname RecResultLinkKey
One item pairing that established a link between two rec results: the identifiers both results' items carried.  Exactly one of holdingId and transactionId is populated; taxLotId only ever accompanies a holdingId, and only  where the pairing was established at tax-lot precision.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The holding both items carried, for a holding-keyed pairing. Null for a transaction-keyed one. | [optional] [default to String]
**taxLotId** | **String** | The tax lot both items carried within the holding, where the pairing was established at tax-lot precision. Null where it was established at holding precision, and always null for a transaction-keyed pairing. | [optional] [default to String]
**transactionId** | **String** | The transaction both items carried, for a transaction-keyed pairing. Null for a holding-keyed one. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecResultLinkKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String taxLotId = "example taxLotId";
@javax.annotation.Nullable String transactionId = "example transactionId";


RecResultLinkKey recResultLinkKeyInstance = new RecResultLinkKey()
    .holdingId(holdingId)
    .taxLotId(taxLotId)
    .transactionId(transactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)