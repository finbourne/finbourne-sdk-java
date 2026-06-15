# com.finbourne.sdk.services.lusid.model.AccountingMethod
classname AccountingMethod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountingMethod** | [**String**](.md) | **** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AccountingMethod;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of AccountingMethod:
AccountingMethod method = AccountingMethod.DEFAULT;
AccountingMethod method = AccountingMethod.AVERAGE_COST;
AccountingMethod method = AccountingMethod.FIRST_IN_FIRST_OUT;
AccountingMethod method = AccountingMethod.LAST_IN_FIRST_OUT;
AccountingMethod method = AccountingMethod.HIGHEST_COST_FIRST;
AccountingMethod method = AccountingMethod.LOWEST_COST_FIRST;
AccountingMethod method = AccountingMethod.PRO_RATE_BY_UNITS;
AccountingMethod method = AccountingMethod.PRO_RATE_BY_COST;
AccountingMethod method = AccountingMethod.PRO_RATE_BY_COST_PORTFOLIO_CURRENCY;
AccountingMethod method = AccountingMethod.INTRA_DAY_THEN_FIRST_IN_FIRST_OUT;
AccountingMethod method = AccountingMethod.LONG_TERM_HIGHEST_COST_FIRST;
AccountingMethod method = AccountingMethod.LONG_TERM_HIGHEST_COST_FIRST_PORTFOLIO_CURRENCY;
AccountingMethod method = AccountingMethod.HIGHEST_COST_FIRST_PORTFOLIO_CURRENCY;
AccountingMethod method = AccountingMethod.LOWEST_COST_FIRST_PORTFOLIO_CURRENCY;
AccountingMethod method = AccountingMethod.MAXIMUM_LOSS_MINIMUM_GAIN;
AccountingMethod method = AccountingMethod.MAXIMUM_LOSS_MINIMUM_GAIN_PORTFOLIO_CURRENCY;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)