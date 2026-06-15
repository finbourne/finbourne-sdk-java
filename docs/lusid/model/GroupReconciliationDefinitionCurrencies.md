# com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinitionCurrencies
classname GroupReconciliationDefinitionCurrencies

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | Currency for the left side of a reconciliation | [default to String]
**right** | **String** | Currency for the right side of a reconciliation | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinitionCurrencies;
import java.util.*;
import java.lang.System;
import java.net.URI;

String left = "example left";
String right = "example right";


GroupReconciliationDefinitionCurrencies groupReconciliationDefinitionCurrenciesInstance = new GroupReconciliationDefinitionCurrencies()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)