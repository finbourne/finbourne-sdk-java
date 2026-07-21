# com.finbourne.sdk.services.lusid.model.ApportionmentMemberFactor
classname ApportionmentMemberFactor
One member share class's outcome within an apportionment result: the base value the method produced for it  and the resulting apportionment factor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberIdentifier** | **String** | The member share class&#39;s short code. | [default to String]
**fundScope** | **String** | The scope of the fund the member share class belongs to. | [optional] [default to String]
**fundCode** | **String** | The code of the fund the member share class belongs to. | [optional] [default to String]
**baseValue** | **java.math.BigDecimal** | The base value the method produced for the member, or null for the SetFactor method. | [optional] [default to java.math.BigDecimal]
**apportionmentFactor** | **java.math.BigDecimal** | The member&#39;s apportionment factor: its base value over the total across the group or fund. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ApportionmentMemberFactor;
import java.util.*;
import java.lang.System;
import java.net.URI;

String memberIdentifier = "example memberIdentifier";
@javax.annotation.Nullable String fundScope = "example fundScope";
@javax.annotation.Nullable String fundCode = "example fundCode";
@javax.annotation.Nullable java.math.BigDecimal baseValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal apportionmentFactor = new java.math.BigDecimal("100.00");


ApportionmentMemberFactor apportionmentMemberFactorInstance = new ApportionmentMemberFactor()
    .memberIdentifier(memberIdentifier)
    .fundScope(fundScope)
    .fundCode(fundCode)
    .baseValue(baseValue)
    .apportionmentFactor(apportionmentFactor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)