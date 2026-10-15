# com.finbourne.sdk.services.lusid.model.PartnerStatementLineDifference
classname PartnerStatementLineDifference
One figure that differs between two partner statements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the figure. | [default to String]
**before** | **java.math.BigDecimal** | The figure on the statement compared against. | [optional] [default to java.math.BigDecimal]
**after** | **java.math.BigDecimal** | The figure on this statement. | [optional] [default to java.math.BigDecimal]
**change** | **java.math.BigDecimal** | After less before. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerStatementLineDifference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
@javax.annotation.Nullable java.math.BigDecimal before = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal after = new java.math.BigDecimal("100.00");
java.math.BigDecimal change = new java.math.BigDecimal("100.00");


PartnerStatementLineDifference partnerStatementLineDifferenceInstance = new PartnerStatementLineDifference()
    .key(key)
    .before(before)
    .after(after)
    .change(change);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)