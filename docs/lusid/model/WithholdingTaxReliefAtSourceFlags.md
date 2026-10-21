# com.finbourne.sdk.services.lusid.model.WithholdingTaxReliefAtSourceFlags
classname WithholdingTaxReliefAtSourceFlags

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**treatyRas** | **Boolean** | Whether relief at source applies at the treaty rate. | [default to Boolean]
**betterRas** | **Boolean** | Whether relief at source applies at the better rate. | [default to Boolean]
**enhancedRas** | **Boolean** | Whether relief at source applies at the enhanced rate. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxReliefAtSourceFlags;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean treatyRas = true;
Boolean betterRas = true;
Boolean enhancedRas = true;


WithholdingTaxReliefAtSourceFlags withholdingTaxReliefAtSourceFlagsInstance = new WithholdingTaxReliefAtSourceFlags()
    .treatyRas(treatyRas)
    .betterRas(betterRas)
    .enhancedRas(enhancedRas);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)