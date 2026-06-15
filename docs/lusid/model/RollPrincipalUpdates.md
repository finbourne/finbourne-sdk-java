# com.finbourne.sdk.services.lusid.model.RollPrincipalUpdates
classname RollPrincipalUpdates
Describes changes to the principal on a FlexibleDeposit instrument as the result of a DepositRollEvent.  Either the principal to be withdrawn or the principal increase must be specified (either as an amount or a percentage).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withdrawPrincipalAmount** | **java.math.BigDecimal** | The amount of principal that should be withdrawn from the FlexibleDeposit. | [optional] [default to java.math.BigDecimal]
**withdrawPrincipalPercentage** | **java.math.BigDecimal** | The percentage of principal that should be withdrawn from the FlexibleDeposit. | [optional] [default to java.math.BigDecimal]
**increasePrincipalAmount** | **java.math.BigDecimal** | The amount of principal that should be added to the FlexibleDeposit. | [optional] [default to java.math.BigDecimal]
**increasePrincipalPercentage** | **java.math.BigDecimal** | The percentage of principal that should be added to the FlexibleDeposit. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.RollPrincipalUpdates;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal withdrawPrincipalAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal withdrawPrincipalPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal increasePrincipalAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal increasePrincipalPercentage = new java.math.BigDecimal("100.00");


RollPrincipalUpdates rollPrincipalUpdatesInstance = new RollPrincipalUpdates()
    .withdrawPrincipalAmount(withdrawPrincipalAmount)
    .withdrawPrincipalPercentage(withdrawPrincipalPercentage)
    .increasePrincipalAmount(increasePrincipalAmount)
    .increasePrincipalPercentage(increasePrincipalPercentage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)