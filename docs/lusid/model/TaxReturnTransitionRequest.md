# com.finbourne.sdk.services.lusid.model.TaxReturnTransitionRequest
classname TaxReturnTransitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | The reason for advancing or sending back the return. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnTransitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String reason = "example reason";


TaxReturnTransitionRequest taxReturnTransitionRequestInstance = new TaxReturnTransitionRequest()
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)