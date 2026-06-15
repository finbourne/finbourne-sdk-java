# com.finbourne.sdk.services.lusid.model.EconomicDependencyType
classname EconomicDependencyType
Discriminator for EconomicDependency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EconomicDependencyType** | [**String**](.md) | **Discriminator for EconomicDependency.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EconomicDependencyType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of EconomicDependencyType:
EconomicDependencyType method = EconomicDependencyType.OPAQUE_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.CASH_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.DISCOUNTING_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.EQUITY_CURVE_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.EQUITY_VOL_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.FX_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.FX_FORWARDS_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.FX_VOL_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.INDEX_PROJECTION_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.IR_VOL_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.QUOTE_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.VENDOR;
EconomicDependencyType method = EconomicDependencyType.CALENDAR_DEPENDENCY;
EconomicDependencyType method = EconomicDependencyType.INFLATION_FIXING_DEPENDENCY;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)