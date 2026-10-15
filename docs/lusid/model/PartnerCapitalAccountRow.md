# com.finbourne.sdk.services.lusid.model.PartnerCapitalAccountRow
classname PartnerCapitalAccountRow
One row of the capital account statement with its quarter-, year- and inception-to-date amounts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowType** | **String** | The row type: BeginningCapital, Contributions, Distributions, TransfersIn, TransfersOut, NetOperatingIncome, ManagementFeesGross, ManagementFeeOffsets, RealisedGainLoss, UnrealisedGainLoss, CarriedInterest or EndingCapital. | [default to String]
**qtd** | **java.math.BigDecimal** | The quarter-to-date amount for the row. | [default to java.math.BigDecimal]
**ytd** | **java.math.BigDecimal** | The year-to-date amount for the row. | [default to java.math.BigDecimal]
**itd** | **java.math.BigDecimal** | The inception-to-date amount for the row. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerCapitalAccountRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String rowType = "example rowType";
java.math.BigDecimal qtd = new java.math.BigDecimal("100.00");
java.math.BigDecimal ytd = new java.math.BigDecimal("100.00");
java.math.BigDecimal itd = new java.math.BigDecimal("100.00");


PartnerCapitalAccountRow partnerCapitalAccountRowInstance = new PartnerCapitalAccountRow()
    .rowType(rowType)
    .qtd(qtd)
    .ytd(ytd)
    .itd(itd);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)