# com.finbourne.sdk.services.lusid.model.CancelSingleHoldingAdjustmentRequest
classname CancelSingleHoldingAdjustmentRequest
This request specifies single target holding. i.e. holding data that the  system should match. And deletes previous adjustment made to that holding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the holding adjustment to a unique instrument. | [default to Map<String, String>]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property must be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**currency** | **String** | The Holding currency. | [default to String]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.CancelSingleHoldingAdjustmentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
String currency = "example currency";
ResourceId custodianAccountId = new ResourceId();


CancelSingleHoldingAdjustmentRequest cancelSingleHoldingAdjustmentRequestInstance = new CancelSingleHoldingAdjustmentRequest()
    .instrumentIdentifiers(instrumentIdentifiers)
    .subHoldingKeys(subHoldingKeys)
    .currency(currency)
    .custodianAccountId(custodianAccountId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)