# com.finbourne.sdk.services.lusid.model.TransactionMatchingAlternativeId
classname TransactionMatchingAlternativeId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | An property key (from the &#39;Transaction&#39; domain) that can be used as an alternative to TransactionId when matching transactions to settlement instructions. This property must be pre-defined and must be present on the transaction in order to be used for matching. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionMatchingAlternativeId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String propertyKey = "example propertyKey";


TransactionMatchingAlternativeId transactionMatchingAlternativeIdInstance = new TransactionMatchingAlternativeId()
    .propertyKey(propertyKey);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)