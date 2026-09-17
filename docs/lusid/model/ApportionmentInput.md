# com.finbourne.sdk.services.lusid.model.ApportionmentInput
classname ApportionmentInput
One named amount that contributed to a member share class's apportionment base value - the workings behind  the figure rather than the figure alone. A member's inputs always sum to its base value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The input&#39;s identifier within its apportionment method, for example &#39;openingNav&#39;. | [default to String]
**displayName** | **String** | The input&#39;s human-readable name, for example &#39;Opening NAV&#39;. | [default to String]
**value** | **java.math.BigDecimal** | The input&#39;s contribution to the base value, signed as it contributes. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ApportionmentInput;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
java.math.BigDecimal value = new java.math.BigDecimal("100.00");


ApportionmentInput apportionmentInputInstance = new ApportionmentInput()
    .code(code)
    .displayName(displayName)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)