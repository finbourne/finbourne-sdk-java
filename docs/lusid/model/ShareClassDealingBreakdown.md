# com.finbourne.sdk.services.lusid.model.ShareClassDealingBreakdown
classname ShareClassDealingBreakdown
The breakdown of Dealing for a Share Class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classDealing** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for any &#39;Dealing&#39; specific to the share class that has occurred inside the queried period. | [default to Map<String, ShareClassAmount>]
**classDealingUnits** | [**Map&lt;String, Amount&gt;**](Amount.md) | Bucket of detail for any &#39;Dealing&#39; units specific to the share class that has occurred inside the queried period. | [default to Map<String, Amount>]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassDealingBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ShareClassAmount> classDealing = new Map<String, ShareClassAmount>();
Map<String, Amount> classDealingUnits = new Map<String, Amount>();


ShareClassDealingBreakdown shareClassDealingBreakdownInstance = new ShareClassDealingBreakdown()
    .classDealing(classDealing)
    .classDealingUnits(classDealingUnits);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)