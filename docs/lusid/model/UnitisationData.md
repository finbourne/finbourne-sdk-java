# com.finbourne.sdk.services.lusid.model.UnitisationData
classname UnitisationData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sharesInIssue** | **java.math.BigDecimal** | The number of shares in issue at a valuation point. | [default to java.math.BigDecimal]
**unitPrice** | **java.math.BigDecimal** | The price of one unit of the share class at a valuation point. | [default to java.math.BigDecimal]
**netDealingUnits** | **java.math.BigDecimal** | The net dealing in units for the share class at a valuation point. This could be the sum of negative redemptions (in units) and positive subscriptions (in units). | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.UnitisationData;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal sharesInIssue = new java.math.BigDecimal("100.00");
java.math.BigDecimal unitPrice = new java.math.BigDecimal("100.00");
java.math.BigDecimal netDealingUnits = new java.math.BigDecimal("100.00");


UnitisationData unitisationDataInstance = new UnitisationData()
    .sharesInIssue(sharesInIssue)
    .unitPrice(unitPrice)
    .netDealingUnits(netDealingUnits);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)