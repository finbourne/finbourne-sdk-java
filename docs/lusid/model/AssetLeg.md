# com.finbourne.sdk.services.lusid.model.AssetLeg
classname AssetLeg
The underlying instrument representing one side of the TRS and its pay-receive direction.                Note that TRS currently only supports an asset of Bond or ComplexBond, no other instruments are allowed.  Support for additional instrument types will be added in the future.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]
**payReceive** | **String** | Either Pay or Receive stating direction of the asset in the swap.    Supported string (enumeration) values are: [Pay, Receive]. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AssetLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidInstrument asset = new LusidInstrument();
String payReceive = "example payReceive";


AssetLeg assetLegInstance = new AssetLeg()
    .asset(asset)
    .payReceive(payReceive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)