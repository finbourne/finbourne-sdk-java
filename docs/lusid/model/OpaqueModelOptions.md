# com.finbourne.sdk.services.lusid.model.OpaqueModelOptions
classname OpaqueModelOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions. | [default to String]
**data** | **Map&lt;String, Object&gt;** |  | [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.lusid.model.OpaqueModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, Object> data = new Map<String, Object>();


OpaqueModelOptions opaqueModelOptionsInstance = new OpaqueModelOptions()
    .data(data);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)