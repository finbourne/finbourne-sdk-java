# com.finbourne.sdk.services.lusid.model.UpdatePortfolioGroupRequest
classname UpdatePortfolioGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the portfolio group. | [default to String]
**description** | **String** | A long form description of the portfolio group. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdatePortfolioGroupRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


UpdatePortfolioGroupRequest updatePortfolioGroupRequestInstance = new UpdatePortfolioGroupRequest()
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)