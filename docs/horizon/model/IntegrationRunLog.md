# com.finbourne.sdk.services.horizon.model.IntegrationRunLog
classname IntegrationRunLog
Integration run log

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Long** |  | [default to Long]
**link** | [**IntegrationRunLogLink**](IntegrationRunLogLink.md) |  | [default to IntegrationRunLogLink]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationRunLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long count = new Long("100.00");
IntegrationRunLogLink link = new IntegrationRunLogLink();


IntegrationRunLog integrationRunLogInstance = new IntegrationRunLog()
    .count(count)
    .link(link);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)