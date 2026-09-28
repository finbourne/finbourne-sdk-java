# com.finbourne.sdk.services.lusid.model.IdentifierForResolution
classname IdentifierForResolution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierKey** | **String** | Identifier key in the format &#39;{domain}/{scope}/{code}&#39;. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.IdentifierForResolution;
import java.util.*;
import java.lang.System;
import java.net.URI;

String identifierKey = "example identifierKey";


IdentifierForResolution identifierForResolutionInstance = new IdentifierForResolution()
    .identifierKey(identifierKey);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)