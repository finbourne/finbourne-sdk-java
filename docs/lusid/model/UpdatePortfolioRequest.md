# com.finbourne.sdk.services.lusid.model.UpdatePortfolioRequest
classname UpdatePortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the transaction portfolio. | [default to String]
**description** | **String** | The description of the transaction portfolio. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdatePortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


UpdatePortfolioRequest updatePortfolioRequestInstance = new UpdatePortfolioRequest()
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)