# com.finbourne.sdk.services.lusid.model.UpdateFeeTypeRequest
classname UpdateFeeTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the fee type. | [default to String]
**description** | **String** | The description of the fee type. | [optional] [default to String]
**componentTransactions** | [**List&lt;ComponentTransaction&gt;**](ComponentTransaction.md) | A set of component transactions that relate to the fee type to be created. | [default to List<ComponentTransaction>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateFeeTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<ComponentTransaction> componentTransactions = new List<ComponentTransaction>();


UpdateFeeTypeRequest updateFeeTypeRequestInstance = new UpdateFeeTypeRequest()
    .displayName(displayName)
    .description(description)
    .componentTransactions(componentTransactions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)