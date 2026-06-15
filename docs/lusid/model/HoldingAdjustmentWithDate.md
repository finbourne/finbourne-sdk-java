# com.finbourne.sdk.services.lusid.model.HoldingAdjustmentWithDate
classname HoldingAdjustmentWithDate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the holding adjustment | [optional] [default to OffsetDateTime]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the holding adjustment to a unique instrument. | [optional] [default to Map<String, String>]
**instrumentScope** | **String** | The scope of the instrument that the holding adjustment is in. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding adjustment is in. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The set of unique transaction properties and associated values stored with the holding adjustment transactions automatically created by LUSID. Each property will be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The set of unique holding properties and associated values stored with the target holding. Each property will be from the &#39;Holding&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**taxLots** | [**List&lt;TargetTaxLot&gt;**](TargetTaxLot.md) | The tax-lots that together make up the target holding. | [default to List<TargetTaxLot>]
**currency** | **String** | The Holding currency. | [optional] [default to String]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.HoldingAdjustmentWithDate;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String instrumentUid = "example instrumentUid";
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
List<TargetTaxLot> taxLots = new List<TargetTaxLot>();
@javax.annotation.Nullable String currency = "example currency";
ResourceId custodianAccountId = new ResourceId();


HoldingAdjustmentWithDate holdingAdjustmentWithDateInstance = new HoldingAdjustmentWithDate()
    .effectiveAt(effectiveAt)
    .instrumentIdentifiers(instrumentIdentifiers)
    .instrumentScope(instrumentScope)
    .instrumentUid(instrumentUid)
    .subHoldingKeys(subHoldingKeys)
    .properties(properties)
    .taxLots(taxLots)
    .currency(currency)
    .custodianAccountId(custodianAccountId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)