# com.finbourne.sdk.services.lusid.model.QuoteActivity
classname QuoteActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransaction, PortfolioSettlementInstruction, InstrumentActivity, QuoteActivity, ComplexMarketDataActivity. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**effectiveAt** | **String** | The EffectiveAt time of the entity event that need to be added to the closed period. | [default to String]
**entityUniqueId** | **String** | The EntityUniqueId from the entity which needs to be added as a post close activity. | [default to String]
**instrumentId** | **String** | The InstrumentId from the quote which needs to be added as a post close activity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.QuoteActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAt = OffsetDateTime.now();
String effectiveAt = "example effectiveAt";
String entityUniqueId = "example entityUniqueId";
String instrumentId = "example instrumentId";


QuoteActivity quoteActivityInstance = new QuoteActivity()
    .asAt(asAt)
    .effectiveAt(effectiveAt)
    .entityUniqueId(entityUniqueId)
    .instrumentId(instrumentId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)