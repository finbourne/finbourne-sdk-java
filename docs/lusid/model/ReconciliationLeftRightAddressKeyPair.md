# com.finbourne.sdk.services.lusid.model.ReconciliationLeftRightAddressKeyPair
classname ReconciliationLeftRightAddressKeyPair

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | Address key defined by the lhs aggregation | [default to String]
**right** | **String** | Address key defined by the rhs aggregation | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReconciliationLeftRightAddressKeyPair;
import java.util.*;
import java.lang.System;
import java.net.URI;

String left = "example left";
String right = "example right";


ReconciliationLeftRightAddressKeyPair reconciliationLeftRightAddressKeyPairInstance = new ReconciliationLeftRightAddressKeyPair()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)