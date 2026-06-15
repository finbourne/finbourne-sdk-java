# com.finbourne.sdk.services.lusid.model.TransactionFeeCapitalisation
classname TransactionFeeCapitalisation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capitalisation** | **String** | Whether the transaction fee should be capitalised, not capitalised, or conditionally capitalised. Available values: Capitalised, NonCapitalised, Conditional. | [optional] [default to String]
**capitalisedCondition** | **String** | The condition that determines whether the fee is capitalised when applied to the transaction. Required only when Capitalisation is &#39;Conditional&#39;. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionFeeCapitalisation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String capitalisation = "example capitalisation";
@javax.annotation.Nullable String capitalisedCondition = "example capitalisedCondition";


TransactionFeeCapitalisation transactionFeeCapitalisationInstance = new TransactionFeeCapitalisation()
    .capitalisation(capitalisation)
    .capitalisedCondition(capitalisedCondition);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)