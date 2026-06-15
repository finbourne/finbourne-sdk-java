# com.finbourne.sdk.services.lusid.model.NavSettlementConfiguration
classname NavSettlementConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cashSettlement** | [**NavSettlementConfigurationCategory**](NavSettlementConfigurationCategory.md) |  | [optional] [default to NavSettlementConfigurationCategory]
**deferredCashReceipt** | [**NavSettlementConfigurationCategory**](NavSettlementConfigurationCategory.md) |  | [optional] [default to NavSettlementConfigurationCategory]

```java
import com.finbourne.sdk.services.lusid.model.NavSettlementConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

NavSettlementConfigurationCategory cashSettlement = new NavSettlementConfigurationCategory();
NavSettlementConfigurationCategory deferredCashReceipt = new NavSettlementConfigurationCategory();


NavSettlementConfiguration navSettlementConfigurationInstance = new NavSettlementConfiguration()
    .cashSettlement(cashSettlement)
    .deferredCashReceipt(deferredCashReceipt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)