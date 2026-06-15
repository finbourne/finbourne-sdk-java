# com.finbourne.sdk.services.configuration.model.UpdateConfigurationSet
classname UpdateConfigurationSet
The information required to update a configuration set

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The new description of the configuration set | [optional] [default to String]

```java
import com.finbourne.sdk.services.configuration.model.UpdateConfigurationSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String description = "example description";


UpdateConfigurationSet updateConfigurationSetInstance = new UpdateConfigurationSet()
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)