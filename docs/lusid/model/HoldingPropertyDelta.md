# com.finbourne.sdk.services.lusid.model.HoldingPropertyDelta
classname HoldingPropertyDelta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingPropertyKey** | **String** | The running balance on the holding to adjust. Allowed values: &#39;CommittedCapital&#39;, &#39;FundedCapital&#39;, &#39;UnfundedCapital&#39;, &#39;RecallableCapital&#39; and &#39;NonRecallableCapital&#39;. Available values: CommittedCapital, FundedCapital, UnfundedCapital, RecallableCapital, NonRecallableCapital. | [default to String]
**source** | **String** | The movement value that sources the adjustment. Allowed values: &#39;Amount&#39; (the movement&#39;s signed amount in transaction currency), &#39;Units&#39; (the movement&#39;s signed units) and &#39;PortfolioAmount&#39; (the movement&#39;s signed amount converted to portfolio currency). Available values: Amount, Units, PortfolioAmount. | [default to String]
**direction** | **String** | Whether the sourced value increases or decreases the balance. Allowed values: &#39;Increase&#39; and &#39;Decrease&#39;. Available values: Increase, Decrease. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.HoldingPropertyDelta;
import java.util.*;
import java.lang.System;
import java.net.URI;

String holdingPropertyKey = "example holdingPropertyKey";
String source = "example source";
String direction = "example direction";


HoldingPropertyDelta holdingPropertyDeltaInstance = new HoldingPropertyDelta()
    .holdingPropertyKey(holdingPropertyKey)
    .source(source)
    .direction(direction);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)