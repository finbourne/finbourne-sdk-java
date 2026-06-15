# com.finbourne.sdk.services.lusid.model.RoundingConfiguration
classname RoundingConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stockUnits** | [**RoundingConfigurationComponent**](RoundingConfigurationComponent.md) |  | [optional] [default to RoundingConfigurationComponent]

```java
import com.finbourne.sdk.services.lusid.model.RoundingConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

RoundingConfigurationComponent stockUnits = new RoundingConfigurationComponent();


RoundingConfiguration roundingConfigurationInstance = new RoundingConfiguration()
    .stockUnits(stockUnits);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)