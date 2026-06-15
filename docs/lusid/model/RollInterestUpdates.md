# com.finbourne.sdk.services.lusid.model.RollInterestUpdates
classname RollInterestUpdates
Describes changes to the interest of a FlexibleDeposit instrument as the result of a DepositRollEvent.  Both the interest to be withdrawn and the interest to be reinvested must be specified (either as an amount or as a percentage).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withdrawInterestAmount** | **java.math.BigDecimal** | The amount of interest that should be withdrawn from a FlexibleDeposit as the result of a roll event. | [optional] [default to java.math.BigDecimal]
**withdrawInterestPercentage** | **java.math.BigDecimal** | The percentage of interest that should be withdrawn from a FlexibleDeposit instrument as the result of a roll event. | [optional] [default to java.math.BigDecimal]
**reinvestInterestAmount** | **java.math.BigDecimal** | The amount of interest that should be reinvested in a FlexibleDeposit instrument as the result of a roll event. | [optional] [default to java.math.BigDecimal]
**reinvestInterestPercentage** | **java.math.BigDecimal** | The percentage of interest that should be reinvested in a FlexibleDeposit instrument as the result of a roll event. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.RollInterestUpdates;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal withdrawInterestAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal withdrawInterestPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal reinvestInterestAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal reinvestInterestPercentage = new java.math.BigDecimal("100.00");


RollInterestUpdates rollInterestUpdatesInstance = new RollInterestUpdates()
    .withdrawInterestAmount(withdrawInterestAmount)
    .withdrawInterestPercentage(withdrawInterestPercentage)
    .reinvestInterestAmount(reinvestInterestAmount)
    .reinvestInterestPercentage(reinvestInterestPercentage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)