# com.finbourne.sdk.services.lusid.model.InstrumentActivity
classname InstrumentActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransaction, PortfolioSettlementInstruction, InstrumentActivity, QuoteActivity. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**scope** | **String** | The Scope of the given entity | [default to String]
**lusidInstrumentId** | **String** | The LusidInstrumentId of the given entity | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAt = OffsetDateTime.now();
String scope = "example scope";
String lusidInstrumentId = "example lusidInstrumentId";


InstrumentActivity instrumentActivityInstance = new InstrumentActivity()
    .asAt(asAt)
    .scope(scope)
    .lusidInstrumentId(lusidInstrumentId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)