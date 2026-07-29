# com.finbourne.sdk.services.lusid.model.ShareClassPnlBreakdown
classname ShareClassPnlBreakdown
The breakdown of PnL for a Share Class on a specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apportionedNonClassSpecificPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for PnL within the queried period not explicitly allocated to any share class but has been apportioned to the share class. | [default to Map<String, ShareClassAmount>]
**classPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for PnL specific to the share class within the queried period. | [default to Map<String, ShareClassAmount>]
**groupApportionedPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for the share class&#39;s apportioned share of PnL allocated to the allocation groups it belongs to, within the queried period. | [default to Map<String, ShareClassAmount>]
**totalPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for the total PnL within the queried period: the sum of the class-specific, apportioned non-class-specific and allocation-group-apportioned PnL. | [default to Map<String, ShareClassAmount>]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassPnlBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ShareClassAmount> apportionedNonClassSpecificPnl = new Map<String, ShareClassAmount>();
Map<String, ShareClassAmount> classPnl = new Map<String, ShareClassAmount>();
Map<String, ShareClassAmount> groupApportionedPnl = new Map<String, ShareClassAmount>();
Map<String, ShareClassAmount> totalPnl = new Map<String, ShareClassAmount>();


ShareClassPnlBreakdown shareClassPnlBreakdownInstance = new ShareClassPnlBreakdown()
    .apportionedNonClassSpecificPnl(apportionedNonClassSpecificPnl)
    .classPnl(classPnl)
    .groupApportionedPnl(groupApportionedPnl)
    .totalPnl(totalPnl);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)