# com.finbourne.sdk.services.lusid.model.PartnerStatementLine
classname PartnerStatementLine
One figure on a partner statement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the figure. | [default to String]
**label** | **String** | The label of the figure. | [default to String]
**amount** | **java.math.BigDecimal** | The amount of the figure. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerStatementLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String label = "example label";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


PartnerStatementLine partnerStatementLineInstance = new PartnerStatementLine()
    .key(key)
    .label(label)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)