# com.finbourne.sdk.services.lusid.model.RecResultHoldingImpact
classname RecResultHoldingImpact
One holding, and where known the tax lot within it, that a transaction or settlement activity item impacted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The impacted holding, at holding level: the id a holding item over it carries. | [default to String]
**taxLotId** | **String** | The impacted tax lot within the holding, where the source states one; null when the impact is known at holding level only. Opaque: compare it whole, do not parse it. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecResultHoldingImpact;
import java.util.*;
import java.lang.System;
import java.net.URI;

String holdingId = "example holdingId";
@javax.annotation.Nullable String taxLotId = "example taxLotId";


RecResultHoldingImpact recResultHoldingImpactInstance = new RecResultHoldingImpact()
    .holdingId(holdingId)
    .taxLotId(taxLotId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)