# com.finbourne.sdk.services.lusid.model.NavSettlementConfigurationCategory
classname NavSettlementConfigurationCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculateInstructionToPortfolioRate** | **Boolean** | An optional flag that allows for the calculation of the instruction to portfolio rate for instructions with settlement category CashSettlement or DeferredCashReceipt, if it is not provided on the settlement instruction. | [optional] [default to Boolean]
**calculateTradeDateToSettlementFxPnL** | **Boolean** | An optional flag that allows for the calculation of FxPnL between Trade and Settlement Date. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.NavSettlementConfigurationCategory;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Boolean calculateInstructionToPortfolioRate = true;
@javax.annotation.Nullable Boolean calculateTradeDateToSettlementFxPnL = true;


NavSettlementConfigurationCategory navSettlementConfigurationCategoryInstance = new NavSettlementConfigurationCategory()
    .calculateInstructionToPortfolioRate(calculateInstructionToPortfolioRate)
    .calculateTradeDateToSettlementFxPnL(calculateTradeDateToSettlementFxPnL);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)