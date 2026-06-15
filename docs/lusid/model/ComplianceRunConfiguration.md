# com.finbourne.sdk.services.lusid.model.ComplianceRunConfiguration
classname ComplianceRunConfiguration
Specification object for the configuration parameters of a compliance run

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preTradeConfiguration** | [**PreTradeConfiguration**](PreTradeConfiguration.md) |  | [default to PreTradeConfiguration]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRunConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

PreTradeConfiguration preTradeConfiguration = new PreTradeConfiguration();


ComplianceRunConfiguration complianceRunConfigurationInstance = new ComplianceRunConfiguration()
    .preTradeConfiguration(preTradeConfiguration);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)