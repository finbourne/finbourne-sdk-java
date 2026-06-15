# com.finbourne.sdk.services.lusid.model.ModelOptions
classname ModelOptions
Base class for representing model options in LUSID, which provide config for instrument analytics.  This base class should not be directly instantiated; each supported ModelOptionsType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String modelOptionsType = "example modelOptionsType";


ModelOptions modelOptionsInstance = new ModelOptions()
    .modelOptionsType(modelOptionsType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)