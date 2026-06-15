# com.finbourne.sdk.services.lusid.model.Collateral
classname Collateral
Representation of the collateral of a repurchase agreement, along with related details of the agreement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyerReceivesCashflows** | **Boolean** | Does the buyer of the FlexibleRepo receive the cashflows from any collateral instruments, or do they get paid to the seller. | [default to Boolean]
**buyerReceivesCorporateActionPayments** | **Boolean** | Does the buyer of the FlexibleRepo receive any dividend or cash payments as the result of a corporate action  on any of the collateral instruments, or are these amounts paid to the seller.  Referred to as \&quot;manufactured payments\&quot; in the UK, and valid only under a repo with GMRA in Europe | [default to Boolean]
**collateralInstruments** | [**List&lt;CollateralInstrument&gt;**](CollateralInstrument.md) | List of any collateral instruments. | [optional] [default to List<CollateralInstrument>]
**collateralValue** | **java.math.BigDecimal** | Total value of the collateral before any margin or haircut applied.  Can be provided instead of PurchasePrice, so that PurchasePrice can be inferred from the CollateralValue and one of  Haircut or Margin. | [optional] [default to java.math.BigDecimal]
**deferManufacturedPayments** | **Boolean** | Indicates whether manufactured collateral payments are capitalised (i.e. deferred). Capitalised payments will  be deferred to the maturity date of the repo and if applicable interest will be accrued at the repo rate.  Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.Collateral;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean buyerReceivesCashflows = true;
Boolean buyerReceivesCorporateActionPayments = true;
@javax.annotation.Nullable List<CollateralInstrument> collateralInstruments = new List<CollateralInstrument>();
@javax.annotation.Nullable java.math.BigDecimal collateralValue = new java.math.BigDecimal("100.00");
Boolean deferManufacturedPayments = true;


Collateral collateralInstance = new Collateral()
    .buyerReceivesCashflows(buyerReceivesCashflows)
    .buyerReceivesCorporateActionPayments(buyerReceivesCorporateActionPayments)
    .collateralInstruments(collateralInstruments)
    .collateralValue(collateralValue)
    .deferManufacturedPayments(deferManufacturedPayments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)