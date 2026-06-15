# com.finbourne.sdk.services.lusid.model.UpdateUnitRequest
classname UpdateUnitRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdateUnitRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


UpdateUnitRequest updateUnitRequestInstance = new UpdateUnitRequest()
    .code(code)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)