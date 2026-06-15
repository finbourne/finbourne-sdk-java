# com.finbourne.sdk.services.lusid.model.WeightedInstrument
classname WeightedInstrument
Specification for a holding or quantity of (weight for) an instrument on a given date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | The quantity of the instrument that is owned. | [optional] [default to java.math.BigDecimal]
**holdingIdentifier** | **String** | Identifier for the instrument.  For a single, unique trade or transaction this can be thought of as equivalent to the transaction identifier, or  a composite of the sub-holding keys for a regular sub-holding. When there are multiple transactions sharing the same underlying instrument  such as purchase of shares on multiple dates where tax implications are different this would not be the case.    In an inlined aggregation request if this is wanted to identify a line item, it can be specified in the set of aggregation keys given on the aggregation  request that accompanies the set of weighted instruments. | [optional] [default to String]
**instrument** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**inLineLookupIdentifiers** | [**WeightedInstrumentInLineLookupIdentifiers**](WeightedInstrumentInLineLookupIdentifiers.md) |  | [optional] [default to WeightedInstrumentInLineLookupIdentifiers]
**instrumentScope** | **String** | The scope in which to resolve the instrument, if no inlined definition is provided.  If left empty, the default scope will be used. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WeightedInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String holdingIdentifier = "example holdingIdentifier";
LusidInstrument instrument = new LusidInstrument();
@javax.annotation.Nullable WeightedInstrumentInLineLookupIdentifiers inLineLookupIdentifiers = new WeightedInstrumentInLineLookupIdentifiers();
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";


WeightedInstrument weightedInstrumentInstance = new WeightedInstrument()
    .quantity(quantity)
    .holdingIdentifier(holdingIdentifier)
    .instrument(instrument)
    .inLineLookupIdentifiers(inLineLookupIdentifiers)
    .instrumentScope(instrumentScope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)