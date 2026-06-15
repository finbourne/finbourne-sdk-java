# com.finbourne.sdk.services.lusid.model.CreateAmortisationRuleSetRequest
classname CreateAmortisationRuleSetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateAmortisationRuleSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


CreateAmortisationRuleSetRequest createAmortisationRuleSetRequestInstance = new CreateAmortisationRuleSetRequest()
    .code(code)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)