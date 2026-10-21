# com.finbourne.sdk.services.lusid.model.ResolveWithholdingTaxRequest
classname ResolveWithholdingTaxRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | **String** | Where the dimension values come from. Raw: from Dimensions. InstrumentResolved: from the instrument, through the configuration&#39;s value sources, as in booking. Available values: Raw, InstrumentResolved. | [default to String]
**taxCountry** | **String** | The tax country of the holder. It is matched like any other dimension. | [default to String]
**profileType** | **String** | The profile type of the holder. It is matched like any other dimension. | [default to String]
**dimensions** | **Map&lt;String, String&gt;** | The value of each matching dimension, keyed by its field name in the rate datasets. A dimension left out is null, as in booking. taxCountry, profileType and ruleSource are not allowed here, and a name that neither dataset matches on is refused. With InstrumentResolved, a value here overrides the derived one, or gives one that the lookup cannot derive (see unresolvedDimensions in the response). | [optional] [default to Map<String, String>]
**whtConfig** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**anomalyDataset** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**mainDataset** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**sourcePriority** | **List&lt;String&gt;** | Optional. The source priority, most preferred first: it replaces the configuration&#39;s, or is used on its own when there is no configuration. An empty list applies no source filter. | [optional] [default to List<String>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The identifiers of the instrument, resolved as for a transaction. Required with InstrumentResolved, not allowed with Raw. | [optional] [default to Map<String, String>]
**instrumentScope** | **String** | Optional. The scope to resolve the instrument in, before the default scope. Only with InstrumentResolved. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResolveWithholdingTaxRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String mode = "example mode";
String taxCountry = "example taxCountry";
String profileType = "example profileType";
@javax.annotation.Nullable Map<String, String> dimensions = new Map<String, String>();
ResourceId whtConfig = new ResourceId();
ResourceId anomalyDataset = new ResourceId();
ResourceId mainDataset = new ResourceId();
@javax.annotation.Nullable List<String> sourcePriority = new List<String>();
@javax.annotation.Nullable Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";


ResolveWithholdingTaxRequest resolveWithholdingTaxRequestInstance = new ResolveWithholdingTaxRequest()
    .mode(mode)
    .taxCountry(taxCountry)
    .profileType(profileType)
    .dimensions(dimensions)
    .whtConfig(whtConfig)
    .anomalyDataset(anomalyDataset)
    .mainDataset(mainDataset)
    .sourcePriority(sourcePriority)
    .instrumentIdentifiers(instrumentIdentifiers)
    .instrumentScope(instrumentScope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)