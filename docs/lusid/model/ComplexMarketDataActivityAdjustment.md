# com.finbourne.sdk.services.lusid.model.ComplexMarketDataActivityAdjustment
classname ComplexMarketDataActivityAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransactionAdjustment, PortfolioSettlementInstructionAdjustment, InstrumentActivityAdjustment, QuoteActivityAdjustment, ComplexMarketDataActivityAdjustment. | [default to String]
**navActivityAdjustmentSource** | **String** | The post closed activity source of the given entity, for example Manual. Available values: Undefined, Manual, Auto. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**effectiveAt** | **String** | The EffectiveAt time of the entity event that need to be added to the closed period. | [default to String]
**entityUniqueId** | **String** | The EntityUniqueId from the entity which needs to be added as a post close activity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplexMarketDataActivityAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String navActivityAdjustmentSource = "example navActivityAdjustmentSource";
OffsetDateTime asAt = OffsetDateTime.now();
String effectiveAt = "example effectiveAt";
String entityUniqueId = "example entityUniqueId";


ComplexMarketDataActivityAdjustment complexMarketDataActivityAdjustmentInstance = new ComplexMarketDataActivityAdjustment()
    .navActivityAdjustmentSource(navActivityAdjustmentSource)
    .asAt(asAt)
    .effectiveAt(effectiveAt)
    .entityUniqueId(entityUniqueId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)