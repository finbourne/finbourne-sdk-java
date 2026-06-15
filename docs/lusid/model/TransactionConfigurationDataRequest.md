# com.finbourne.sdk.services.lusid.model.TransactionConfigurationDataRequest
classname TransactionConfigurationDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List&lt;TransactionConfigurationTypeAlias&gt;**](TransactionConfigurationTypeAlias.md) | List of transaction codes that map to this specific transaction model | [default to List<TransactionConfigurationTypeAlias>]
**movements** | [**List&lt;TransactionConfigurationMovementDataRequest&gt;**](TransactionConfigurationMovementDataRequest.md) | Movement data for the transaction code | [default to List<TransactionConfigurationMovementDataRequest>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties attached to the underlying holding. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionConfigurationDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionConfigurationTypeAlias> aliases = new List<TransactionConfigurationTypeAlias>();
List<TransactionConfigurationMovementDataRequest> movements = new List<TransactionConfigurationMovementDataRequest>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


TransactionConfigurationDataRequest transactionConfigurationDataRequestInstance = new TransactionConfigurationDataRequest()
    .aliases(aliases)
    .movements(movements)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)