# com.finbourne.sdk.services.lusid.model.ShareClassBreakdown
classname ShareClassBreakdown
The Valuation Point Data for a Share Class on a specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backOut** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for the Valuation Point where data points have been &#39;backed out&#39;. | [default to Map<String, ShareClassAmount>]
**dealing** | [**ShareClassDealingBreakdown**](ShareClassDealingBreakdown.md) |  | [default to ShareClassDealingBreakdown]
**pnL** | [**ShareClassPnlBreakdown**](ShareClassPnlBreakdown.md) |  | [default to ShareClassPnlBreakdown]
**gav** | [**ShareClassAmount**](ShareClassAmount.md) |  | [default to ShareClassAmount]
**fees** | [**Map&lt;String, FeeAccrual&gt;**](FeeAccrual.md) | Bucket of detail for any &#39;Fees&#39; that have been charged in the selected period. | [default to Map<String, FeeAccrual>]
**nav** | [**ShareClassAmount**](ShareClassAmount.md) |  | [default to ShareClassAmount]
**unitisation** | [**UnitisationData**](UnitisationData.md) |  | [optional] [default to UnitisationData]
**miscellaneous** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Not used directly by the LUSID engines but serves as a holding area for any custom derived data points that may be useful in, for example, fee calculations). | [optional] [default to Map<String, ShareClassAmount>]
**shareClassToFundFxRate** | **java.math.BigDecimal** | The fx rate from the Share Class currency to the fund currency at this valuation point. | [default to java.math.BigDecimal]
**capitalRatio** | **java.math.BigDecimal** | The proportion of the fund&#39;s adjusted beginning equity (ie: the sum of the previous NAV and the net dealing) that is invested in the share class. | [default to java.math.BigDecimal]
**previousShareClassBreakdown** | [**PreviousShareClassBreakdown**](PreviousShareClassBreakdown.md) |  | [default to PreviousShareClassBreakdown]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ShareClassAmount> backOut = new Map<String, ShareClassAmount>();
ShareClassDealingBreakdown dealing = new ShareClassDealingBreakdown();
ShareClassPnlBreakdown pnL = new ShareClassPnlBreakdown();
ShareClassAmount gav = new ShareClassAmount();
Map<String, FeeAccrual> fees = new Map<String, FeeAccrual>();
ShareClassAmount nav = new ShareClassAmount();
UnitisationData unitisation = new UnitisationData();
@javax.annotation.Nullable Map<String, ShareClassAmount> miscellaneous = new Map<String, ShareClassAmount>();
java.math.BigDecimal shareClassToFundFxRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal capitalRatio = new java.math.BigDecimal("100.00");
PreviousShareClassBreakdown previousShareClassBreakdown = new PreviousShareClassBreakdown();


ShareClassBreakdown shareClassBreakdownInstance = new ShareClassBreakdown()
    .backOut(backOut)
    .dealing(dealing)
    .pnL(pnL)
    .gav(gav)
    .fees(fees)
    .nav(nav)
    .unitisation(unitisation)
    .miscellaneous(miscellaneous)
    .shareClassToFundFxRate(shareClassToFundFxRate)
    .capitalRatio(capitalRatio)
    .previousShareClassBreakdown(previousShareClassBreakdown);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)