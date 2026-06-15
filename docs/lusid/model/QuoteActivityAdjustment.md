# com.finbourne.sdk.services.lusid.model.QuoteActivityAdjustment
classname QuoteActivityAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransactionAdjustment, PortfolioSettlementInstructionAdjustment, InstrumentActivityAdjustment, QuoteActivityAdjustment. | [default to String]
**navActivityAdjustmentSource** | **String** | The post closed activity source of the given entity, for example Manual. Available values: Undefined, Manual, Auto. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**effectiveAt** | **String** | The EffectiveAt time of the quote event that need to be added to the closed period. | [default to String]
**entityUniqueId** | **String** | The EntityUniqueId from the quote which needs to be added as a post close activity. | [default to String]
**instrumentId** | **String** | The InstrumentId from the quote which needs to be added as a post close activity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.QuoteActivityAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String navActivityAdjustmentSource = "example navActivityAdjustmentSource";
OffsetDateTime asAt = OffsetDateTime.now();
String effectiveAt = "example effectiveAt";
String entityUniqueId = "example entityUniqueId";
String instrumentId = "example instrumentId";


QuoteActivityAdjustment quoteActivityAdjustmentInstance = new QuoteActivityAdjustment()
    .navActivityAdjustmentSource(navActivityAdjustmentSource)
    .asAt(asAt)
    .effectiveAt(effectiveAt)
    .entityUniqueId(entityUniqueId)
    .instrumentId(instrumentId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)