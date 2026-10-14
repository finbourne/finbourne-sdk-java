# com.finbourne.sdk.services.lusid.model.FeeDefinition
classname FeeDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeCode** | **String** |  | [default to String]
**basis** | **String** | Available values: CommittedCapital, InvestedCapital, NetInvestedCapital, Nav. | [default to String]
**rate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**tiers** | [**List&lt;FeeSizeTier&gt;**](FeeSizeTier.md) |  | [optional] [default to List<FeeSizeTier>]
**dayCountConvention** | **String** |  | [optional] [default to String]
**stepDown** | [**FeeStepDown**](FeeStepDown.md) |  | [optional] [default to FeeStepDown]
**offsetPercentage** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**waiverPercentage** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FeeDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String feeCode = "example feeCode";
String basis = "example basis";
@javax.annotation.Nullable java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<FeeSizeTier> tiers = new List<FeeSizeTier>();
@javax.annotation.Nullable String dayCountConvention = "example dayCountConvention";
FeeStepDown stepDown = new FeeStepDown();
@javax.annotation.Nullable java.math.BigDecimal offsetPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal waiverPercentage = new java.math.BigDecimal("100.00");


FeeDefinition feeDefinitionInstance = new FeeDefinition()
    .feeCode(feeCode)
    .basis(basis)
    .rate(rate)
    .tiers(tiers)
    .dayCountConvention(dayCountConvention)
    .stepDown(stepDown)
    .offsetPercentage(offsetPercentage)
    .waiverPercentage(waiverPercentage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)