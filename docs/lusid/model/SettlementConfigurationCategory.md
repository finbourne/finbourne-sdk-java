# com.finbourne.sdk.services.lusid.model.SettlementConfigurationCategory
classname SettlementConfigurationCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | **String** | The method of settlement for the movements of the relevant type(s). A value of Instructed means that such movements can only be settled with a SettlementInstruction. A value of Automatic means that such movements will settle automatically but a SettlementInstruction will still override automatic settlement. Available values: Automatic, Instructed. | [optional] [default to String]
**calculateInstructionToPortfolioRate** | **Boolean** | An optional flag that allows for the calculation of the instruction to portfolio rate for instructions with settlement category CashSettlement or DeferredCashReceipt, if it is not provided on the settlement instruction. Defaults to false if not specified. | [optional] [default to Boolean]
**calculateInLieuSettlementAmount** | **Boolean** | An optional flag that allows for the calculation of the in lieu amount for instructions with settlement category CashSettlement or DeferredCashReceipt, if it is not provided on the settlement instruction. Defaults to false if not specified. | [optional] [default to Boolean]
**methodOverride** | [**SettlementConfigurationMethodOverride**](SettlementConfigurationMethodOverride.md) |  | [optional] [default to SettlementConfigurationMethodOverride]
**calculateTradeDateToSettlementFxPnL** | **Boolean** | An optional flag that allows for the calculation of the in lieu amount for instructions with settlement category CashSettlement or DeferredCashReceipt, if it is not provided on the settlement instruction. Defaults to false if not specified. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.SettlementConfigurationCategory;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String method = "example method";
Boolean calculateInstructionToPortfolioRate = true;
Boolean calculateInLieuSettlementAmount = true;
SettlementConfigurationMethodOverride methodOverride = new SettlementConfigurationMethodOverride();
Boolean calculateTradeDateToSettlementFxPnL = true;


SettlementConfigurationCategory settlementConfigurationCategoryInstance = new SettlementConfigurationCategory()
    .method(method)
    .calculateInstructionToPortfolioRate(calculateInstructionToPortfolioRate)
    .calculateInLieuSettlementAmount(calculateInLieuSettlementAmount)
    .methodOverride(methodOverride)
    .calculateTradeDateToSettlementFxPnL(calculateTradeDateToSettlementFxPnL);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)