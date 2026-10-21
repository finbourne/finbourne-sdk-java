# com.finbourne.sdk.services.lusid.model.WithholdingTaxAlternativeMatch
classname WithholdingTaxAlternativeMatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ifValues** | **Map&lt;String, String&gt;** | The values of the unresolved dimensions that choose this row, one or more. | [default to Map<String, String>]
**matchedRuleId** | **String** | The identifier booking would stamp for the row that these values choose. | [default to String]
**stopAtSourceRate** | **java.math.BigDecimal** | The rate that this row would withhold at source. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxAlternativeMatch;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> ifValues = new Map<String, String>();
String matchedRuleId = "example matchedRuleId";
java.math.BigDecimal stopAtSourceRate = new java.math.BigDecimal("100.00");


WithholdingTaxAlternativeMatch withholdingTaxAlternativeMatchInstance = new WithholdingTaxAlternativeMatch()
    .ifValues(ifValues)
    .matchedRuleId(matchedRuleId)
    .stopAtSourceRate(stopAtSourceRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)