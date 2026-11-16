# com.finbourne.sdk.services.lusid.model.UpdateDeemedDisposalDefinitionRequest
classname UpdateDeemedDisposalDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the deemed disposal definition. | [default to String]
**description** | **String** | The description of the deemed disposal definition. | [optional] [default to String]
**filter** | **String** | Selects the holdings the definition deems disposed of and re-acquired at market value at a valuation point. Written in the holding filter grammar of the portfolio cash flow endpoints (holdingType, holdingTypeName, instrumentUid, instrumentScope, units, settledUnits, unsettledUnits, overdueUnits, currentFace, cost.amount, cost.currency, costPortfolioCcy.amount, custodianAccountId, custodianAccount, subHoldingKeys[...] and properties[...]), for example \&quot;holdingType eq &#39;B&#39; and cost.currency eq &#39;USD&#39;\&quot;, with the additional system field &#39;InNavTypeBaseCurrency&#39; (true when the holding is in the NAV type&#39;s base currency). The GetHoldings fields &#39;currency&#39; and &#39;transaction&#39; are not accepted. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdateDeemedDisposalDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String filter = "example filter";


UpdateDeemedDisposalDefinitionRequest updateDeemedDisposalDefinitionRequestInstance = new UpdateDeemedDisposalDefinitionRequest()
    .displayName(displayName)
    .description(description)
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)