# com.finbourne.sdk.services.lusid.model.ShareClassPnlBreakdown
classname ShareClassPnlBreakdown
The breakdown of PnL for a Share Class on a specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apportionedNonClassSpecificPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for PnL within the queried period not explicitly allocated to any share class but has been apportioned to the share class. | [default to Map<String, ShareClassAmount>]
**classPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for PnL specific to the share class within the queried period. | [default to Map<String, ShareClassAmount>]
**totalPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for the sum of class PnL and PnL not specific to a class within the queried period. | [default to Map<String, ShareClassAmount>]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassPnlBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ShareClassAmount> apportionedNonClassSpecificPnl = new Map<String, ShareClassAmount>();
Map<String, ShareClassAmount> classPnl = new Map<String, ShareClassAmount>();
Map<String, ShareClassAmount> totalPnl = new Map<String, ShareClassAmount>();


ShareClassPnlBreakdown shareClassPnlBreakdownInstance = new ShareClassPnlBreakdown()
    .apportionedNonClassSpecificPnl(apportionedNonClassSpecificPnl)
    .classPnl(classPnl)
    .totalPnl(totalPnl);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)