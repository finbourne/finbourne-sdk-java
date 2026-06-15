# com.finbourne.sdk.services.lusid.model.FundValuationPointData
classname FundValuationPointData
The Valuation Point Data for a Fund on a specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backOut** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for the Valuation Point where data points have been &#39;backed out&#39;. | [default to Map<String, FundAmount>]
**dealing** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for any &#39;Dealing&#39; that has occurred inside the queried period. | [default to Map<String, FundAmount>]
**pnL** | [**FundPnlBreakdown**](FundPnlBreakdown.md) |  | [default to FundPnlBreakdown]
**gav** | **java.math.BigDecimal** | The Gross Asset Value of the Fund or Share Class at the Valuation Point. This is effectively a summation of all Trial balance entries linked to accounts of types &#39;Asset&#39; and &#39;Liabilities&#39;. | [default to java.math.BigDecimal]
**fees** | [**Map&lt;String, FeeAccrual&gt;**](FeeAccrual.md) | Bucket of detail for any &#39;Fees&#39; that have been charged in the selected period. | [default to Map<String, FeeAccrual>]
**nav** | **java.math.BigDecimal** | The Net Asset Value of the Fund or Share Class at the Valuation Point. This represents the GAV with any fees applied in the period. | [default to java.math.BigDecimal]
**miscellaneous** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Not used directly by the LUSID engines but serves as a holding area for any custom derived data points that may be useful in, for example, fee calculations). | [optional] [default to Map<String, FundAmount>]
**previousValuationPointData** | [**PreviousFundValuationPointData**](PreviousFundValuationPointData.md) |  | [optional] [default to PreviousFundValuationPointData]

```java
import com.finbourne.sdk.services.lusid.model.FundValuationPointData;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, FundAmount> backOut = new Map<String, FundAmount>();
Map<String, FundAmount> dealing = new Map<String, FundAmount>();
FundPnlBreakdown pnL = new FundPnlBreakdown();
java.math.BigDecimal gav = new java.math.BigDecimal("100.00");
Map<String, FeeAccrual> fees = new Map<String, FeeAccrual>();
java.math.BigDecimal nav = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, FundAmount> miscellaneous = new Map<String, FundAmount>();
PreviousFundValuationPointData previousValuationPointData = new PreviousFundValuationPointData();


FundValuationPointData fundValuationPointDataInstance = new FundValuationPointData()
    .backOut(backOut)
    .dealing(dealing)
    .pnL(pnL)
    .gav(gav)
    .fees(fees)
    .nav(nav)
    .miscellaneous(miscellaneous)
    .previousValuationPointData(previousValuationPointData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)