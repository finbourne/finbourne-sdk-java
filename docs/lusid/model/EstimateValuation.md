# com.finbourne.sdk.services.lusid.model.EstimateValuation
classname EstimateValuation
The swing decision read at both unit prices the transfer agency's unit-denominated orders could be valued at: this valuation point's estimate price and the last official price, with which one the decision used and how far apart they are.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decisionPrice** | **String** | The unit price the swing decision was taken on. &#39;EstimatePrice&#39; is the price struck at this valuation point; &#39;LastOfficialPrice&#39; is the unit price the previous valuation point published or, for a share class that has not published one yet, the launch price the class was set up with. | [default to String]
**atEstimatePrice** | [**DealingFlowValuation**](DealingFlowValuation.md) |  | [default to DealingFlowValuation]
**atLastOfficialPrice** | [**DealingFlowValuation**](DealingFlowValuation.md) |  | [optional] [default to DealingFlowValuation]
**difference** | [**EstimateValuationDifference**](EstimateValuationDifference.md) |  | [optional] [default to EstimateValuationDifference]

```java
import com.finbourne.sdk.services.lusid.model.EstimateValuation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String decisionPrice = "example decisionPrice";
DealingFlowValuation atEstimatePrice = new DealingFlowValuation();
DealingFlowValuation atLastOfficialPrice = new DealingFlowValuation();
EstimateValuationDifference difference = new EstimateValuationDifference();


EstimateValuation estimateValuationInstance = new EstimateValuation()
    .decisionPrice(decisionPrice)
    .atEstimatePrice(atEstimatePrice)
    .atLastOfficialPrice(atLastOfficialPrice)
    .difference(difference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)