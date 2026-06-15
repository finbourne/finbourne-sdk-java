# com.finbourne.sdk.services.lusid.model.SetTransactionConfigurationSourceRequest
classname SetTransactionConfigurationSourceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List&lt;SetTransactionConfigurationAlias&gt;**](SetTransactionConfigurationAlias.md) |  | [default to List<SetTransactionConfigurationAlias>]
**movements** | [**List&lt;TransactionConfigurationMovementDataRequest&gt;**](TransactionConfigurationMovementDataRequest.md) |  | [default to List<TransactionConfigurationMovementDataRequest>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.SetTransactionConfigurationSourceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<SetTransactionConfigurationAlias> aliases = new List<SetTransactionConfigurationAlias>();
List<TransactionConfigurationMovementDataRequest> movements = new List<TransactionConfigurationMovementDataRequest>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


SetTransactionConfigurationSourceRequest setTransactionConfigurationSourceRequestInstance = new SetTransactionConfigurationSourceRequest()
    .aliases(aliases)
    .movements(movements)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)