# com.finbourne.sdk.services.lusid.model.PortfolioSettlementConfiguration
classname PortfolioSettlementConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stockSettlement** | [**SettlementConfigurationCategory**](SettlementConfigurationCategory.md) |  | [optional] [default to SettlementConfigurationCategory]
**cashSettlement** | [**SettlementConfigurationCategory**](SettlementConfigurationCategory.md) |  | [optional] [default to SettlementConfigurationCategory]
**deferredCashReceipt** | [**SettlementConfigurationCategory**](SettlementConfigurationCategory.md) |  | [optional] [default to SettlementConfigurationCategory]
**transactionMatchingAlternativeId** | [**TransactionMatchingAlternativeId**](TransactionMatchingAlternativeId.md) |  | [optional] [default to TransactionMatchingAlternativeId]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioSettlementConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

SettlementConfigurationCategory stockSettlement = new SettlementConfigurationCategory();
SettlementConfigurationCategory cashSettlement = new SettlementConfigurationCategory();
SettlementConfigurationCategory deferredCashReceipt = new SettlementConfigurationCategory();
TransactionMatchingAlternativeId transactionMatchingAlternativeId = new TransactionMatchingAlternativeId();


PortfolioSettlementConfiguration portfolioSettlementConfigurationInstance = new PortfolioSettlementConfiguration()
    .stockSettlement(stockSettlement)
    .cashSettlement(cashSettlement)
    .deferredCashReceipt(deferredCashReceipt)
    .transactionMatchingAlternativeId(transactionMatchingAlternativeId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)