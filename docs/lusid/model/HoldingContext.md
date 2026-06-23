# com.finbourne.sdk.services.lusid.model.HoldingContext
classname HoldingContext
Holding context node.  Contains settings that control how LUSID handles holdings within portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxLotLevelHoldings** | **Boolean** | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to True. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.HoldingContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean taxLotLevelHoldings = true;


HoldingContext holdingContextInstance = new HoldingContext()
    .taxLotLevelHoldings(taxLotLevelHoldings);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)