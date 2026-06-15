# com.finbourne.sdk.services.lusid.model.NavActivityAdjustmentResponseType
classname NavActivityAdjustmentResponseType
Discriminator for NavActivityAdjustmentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NavActivityAdjustmentResponseType** | [**String**](.md) | **Discriminator for NavActivityAdjustmentResponse** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.NavActivityAdjustmentResponseType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of NavActivityAdjustmentResponseType:
NavActivityAdjustmentResponseType method = NavActivityAdjustmentResponseType.PORTFOLIO_TRANSACTION_ADJUSTMENT;
NavActivityAdjustmentResponseType method = NavActivityAdjustmentResponseType.PORTFOLIO_SETTLEMENT_INSTRUCTION_ADJUSTMENT;
NavActivityAdjustmentResponseType method = NavActivityAdjustmentResponseType.INSTRUMENT_ACTIVITY_ADJUSTMENT;
NavActivityAdjustmentResponseType method = NavActivityAdjustmentResponseType.QUOTE_ACTIVITY_ADJUSTMENT;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)