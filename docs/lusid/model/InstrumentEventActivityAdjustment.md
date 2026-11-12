# com.finbourne.sdk.services.lusid.model.InstrumentEventActivityAdjustment
classname InstrumentEventActivityAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransactionAdjustment, PortfolioSettlementInstructionAdjustment, InstrumentActivityAdjustment, QuoteActivityAdjustment, ComplexMarketDataActivityAdjustment, InstrumentEventActivityAdjustment. | [default to String]
**navActivityAdjustmentSource** | **String** | The post closed activity source of the given entity, for example Manual. Available values: Undefined, Manual, Auto. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**corporateActionSourceScope** | **String** | The scope of the corporate action source that the instrument event belongs to. | [default to String]
**corporateActionSourceCode** | **String** | The code of the corporate action source that the instrument event belongs to. | [default to String]
**instrumentEventId** | **String** | The Id of the instrument event being adjusted. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentEventActivityAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String navActivityAdjustmentSource = "example navActivityAdjustmentSource";
OffsetDateTime asAt = OffsetDateTime.now();
String corporateActionSourceScope = "example corporateActionSourceScope";
String corporateActionSourceCode = "example corporateActionSourceCode";
String instrumentEventId = "example instrumentEventId";


InstrumentEventActivityAdjustment instrumentEventActivityAdjustmentInstance = new InstrumentEventActivityAdjustment()
    .navActivityAdjustmentSource(navActivityAdjustmentSource)
    .asAt(asAt)
    .corporateActionSourceScope(corporateActionSourceScope)
    .corporateActionSourceCode(corporateActionSourceCode)
    .instrumentEventId(instrumentEventId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)