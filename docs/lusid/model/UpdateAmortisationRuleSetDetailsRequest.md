# com.finbourne.sdk.services.lusid.model.UpdateAmortisationRuleSetDetailsRequest
classname UpdateAmortisationRuleSetDetailsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdateAmortisationRuleSetDetailsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


UpdateAmortisationRuleSetDetailsRequest updateAmortisationRuleSetDetailsRequestInstance = new UpdateAmortisationRuleSetDetailsRequest()
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)