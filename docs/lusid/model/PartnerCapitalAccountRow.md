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
**details** | [**List&lt;PartnerCapitalAccountRowDetail&gt;**](PartnerCapitalAccountRowDetail.md) | Labelled parts of the row&#39;s total, each already included in the row&#39;s columns. Tax withheld from a distribution on the partner&#39;s behalf is counted as distributed and shown here as its own entry against the distribution it was withheld on. Empty for a row with nothing to break out. | [optional] [default to List<PartnerCapitalAccountRowDetail>]

```java
import com.finbourne.sdk.services.lusid.model.PartnerCapitalAccountRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String rowType = "example rowType";
java.math.BigDecimal qtd = new java.math.BigDecimal("100.00");
java.math.BigDecimal ytd = new java.math.BigDecimal("100.00");
java.math.BigDecimal itd = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<PartnerCapitalAccountRowDetail> details = new List<PartnerCapitalAccountRowDetail>();


PartnerCapitalAccountRow partnerCapitalAccountRowInstance = new PartnerCapitalAccountRow()
    .rowType(rowType)
    .qtd(qtd)
    .ytd(ytd)
    .itd(itd)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)