# com.finbourne.sdk.services.lusid.model.InstrumentDefinition
classname InstrumentDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the instrument. | [default to String]
**identifiers** | [**Map&lt;String, InstrumentIdValue&gt;**](InstrumentIdValue.md) | A set of identifiers that can be used to identify the instrument. At least one of these must be configured to be a unique identifier. | [default to Map<String, InstrumentIdValue>]
**properties** | [**List&lt;Property&gt;**](Property.md) | Set of unique instrument properties and associated values to store with the instrument. Each property must be from the &#39;Instrument&#39; domain. | [optional] [default to List<Property>]
**lookThroughPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**definition** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**settlementCycle** | [**SettlementCycle**](SettlementCycle.md) |  | [optional] [default to SettlementCycle]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
Map<String, InstrumentIdValue> identifiers = new Map<String, InstrumentIdValue>();
@javax.annotation.Nullable List<Property> properties = new List<Property>();
ResourceId lookThroughPortfolioId = new ResourceId();
LusidInstrument definition = new LusidInstrument();
SettlementCycle settlementCycle = new SettlementCycle();


InstrumentDefinition instrumentDefinitionInstance = new InstrumentDefinition()
    .name(name)
    .identifiers(identifiers)
    .properties(properties)
    .lookThroughPortfolioId(lookThroughPortfolioId)
    .definition(definition)
    .settlementCycle(settlementCycle);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)