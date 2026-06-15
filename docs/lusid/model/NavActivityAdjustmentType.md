# com.finbourne.sdk.services.lusid.model.NavActivityAdjustmentType
classname NavActivityAdjustmentType
Discriminator for NavActivityAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NavActivityAdjustmentType** | [**String**](.md) | **Discriminator for NavActivityAdjustment** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.NavActivityAdjustmentType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of NavActivityAdjustmentType:
NavActivityAdjustmentType method = NavActivityAdjustmentType.PORTFOLIO_TRANSACTION;
NavActivityAdjustmentType method = NavActivityAdjustmentType.PORTFOLIO_SETTLEMENT_INSTRUCTION;
NavActivityAdjustmentType method = NavActivityAdjustmentType.INSTRUMENT_ACTIVITY;
NavActivityAdjustmentType method = NavActivityAdjustmentType.QUOTE_ACTIVITY;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)