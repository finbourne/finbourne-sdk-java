# com.finbourne.sdk.services.lusid.model.NavActivityAdjustmentResponse
classname NavActivityAdjustmentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransactionAdjustment, PortfolioSettlementInstructionAdjustment, InstrumentActivityAdjustment, QuoteActivityAdjustment. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.NavActivityAdjustmentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String navActivityAdjustmentType = "example navActivityAdjustmentType";


NavActivityAdjustmentResponse navActivityAdjustmentResponseInstance = new NavActivityAdjustmentResponse()
    .navActivityAdjustmentType(navActivityAdjustmentType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)