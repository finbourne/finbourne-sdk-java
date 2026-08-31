# com.finbourne.sdk.services.lusid.model.FlexibleLoanPricerOptions
classname FlexibleLoanPricerOptions
Model options for instruments of type flexibleDeposit and flexibleLoan when used on a standalone basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions, FlexibleLoanPricerOptions, HullWhiteModelOptions, BondLookupModelOptions. | [default to String]
**setCleanPVToZero** | **Boolean** | If set to true the CleanPV will be set to zero in valuations and PV will effectively just be the Accrual. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.FlexibleLoanPricerOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean setCleanPVToZero = true;


FlexibleLoanPricerOptions flexibleLoanPricerOptionsInstance = new FlexibleLoanPricerOptions()
    .setCleanPVToZero(setCleanPVToZero);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)