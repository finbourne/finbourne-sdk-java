# com.finbourne.sdk.services.lusid.model.TransactionDateWindows
classname TransactionDateWindows

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | Transaction Date Window for the left side of a reconciliation | [default to String]
**right** | **String** | Transaction Date Window for the right side of a reconciliation | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionDateWindows;
import java.util.*;
import java.lang.System;
import java.net.URI;

String left = "example left";
String right = "example right";


TransactionDateWindows transactionDateWindowsInstance = new TransactionDateWindows()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)