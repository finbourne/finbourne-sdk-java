# com.finbourne.sdk.services.lusid.model.NavActivityAdjustment
classname NavActivityAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransaction, PortfolioSettlementInstruction, InstrumentActivity, QuoteActivity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.NavActivityAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String navActivityAdjustmentType = "example navActivityAdjustmentType";


NavActivityAdjustment navActivityAdjustmentInstance = new NavActivityAdjustment()
    .navActivityAdjustmentType(navActivityAdjustmentType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)