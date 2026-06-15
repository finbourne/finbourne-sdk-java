# com.finbourne.sdk.services.lusid.model.AdjustHoldingRequest
classname AdjustHoldingRequest
This request specifies target holdings. i.e. holding data that the  system should match. When processed by the movement  engine, it will create 'true-up' adjustments on the fly.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the holding adjustment to a unique instrument. | [default to Map<String, String>]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique transaction properties and associated values to store with the holding adjustment transaction automatically created by LUSID. Each property must be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique holding properties and associated values to store with the target holding. Each property must be from the &#39;Holding&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**taxLots** | [**List&lt;TargetTaxLotRequest&gt;**](TargetTaxLotRequest.md) | The tax-lots that together make up the target holding. | [default to List<TargetTaxLotRequest>]
**currency** | **String** | The Holding currency. This needs to be equal with the one on the TaxLot -&gt; cost if one is specified | [optional] [default to String]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.AdjustHoldingRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
List<TargetTaxLotRequest> taxLots = new List<TargetTaxLotRequest>();
@javax.annotation.Nullable String currency = "example currency";
ResourceId custodianAccountId = new ResourceId();


AdjustHoldingRequest adjustHoldingRequestInstance = new AdjustHoldingRequest()
    .instrumentIdentifiers(instrumentIdentifiers)
    .subHoldingKeys(subHoldingKeys)
    .properties(properties)
    .taxLots(taxLots)
    .currency(currency)
    .custodianAccountId(custodianAccountId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)