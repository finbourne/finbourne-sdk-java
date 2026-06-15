# com.finbourne.sdk.services.lusid.model.TransactionConfigurationData
classname TransactionConfigurationData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List&lt;TransactionConfigurationTypeAlias&gt;**](TransactionConfigurationTypeAlias.md) | List of transaction types that map to this specific transaction configuration | [default to List<TransactionConfigurationTypeAlias>]
**movements** | [**List&lt;TransactionConfigurationMovementData&gt;**](TransactionConfigurationMovementData.md) | Movement data for the transaction type | [default to List<TransactionConfigurationMovementData>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties attached to the transaction type | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionConfigurationData;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionConfigurationTypeAlias> aliases = new List<TransactionConfigurationTypeAlias>();
List<TransactionConfigurationMovementData> movements = new List<TransactionConfigurationMovementData>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


TransactionConfigurationData transactionConfigurationDataInstance = new TransactionConfigurationData()
    .aliases(aliases)
    .movements(movements)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)