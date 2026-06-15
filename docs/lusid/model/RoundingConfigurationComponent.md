# com.finbourne.sdk.services.lusid.model.RoundingConfigurationComponent
classname RoundingConfigurationComponent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roundingType** | **String** | The type of rounding that should be used. Available values: Up, Down, NearestRoundHalfAwayFromZero. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RoundingConfigurationComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String roundingType = "example roundingType";


RoundingConfigurationComponent roundingConfigurationComponentInstance = new RoundingConfigurationComponent()
    .roundingType(roundingType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)