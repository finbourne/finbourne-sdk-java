# com.finbourne.sdk.services.configuration.model.UpdateConfigurationItem
classname UpdateConfigurationItem
The information required to update a configuration item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The new value of the configuration item | [default to String]
**description** | **String** | The new description of the configuration item | [optional] [default to String]
**blockReveal** | **Boolean** | The requested new state of BlockReveal | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.configuration.model.UpdateConfigurationItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";
@javax.annotation.Nullable String description = "example description";
Boolean blockReveal = true;


UpdateConfigurationItem updateConfigurationItemInstance = new UpdateConfigurationItem()
    .value(value)
    .description(description)
    .blockReveal(blockReveal);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)