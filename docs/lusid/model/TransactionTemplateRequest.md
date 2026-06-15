# com.finbourne.sdk.services.lusid.model.TransactionTemplateRequest
classname TransactionTemplateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the transaction template. | [default to String]
**componentTransactions** | [**List&lt;ComponentTransaction&gt;**](ComponentTransaction.md) | A set of component transactions that relate to the template to be created. | [default to List<ComponentTransaction>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String description = "example description";
List<ComponentTransaction> componentTransactions = new List<ComponentTransaction>();


TransactionTemplateRequest transactionTemplateRequestInstance = new TransactionTemplateRequest()
    .description(description)
    .componentTransactions(componentTransactions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)