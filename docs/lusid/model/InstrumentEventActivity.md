# com.finbourne.sdk.services.lusid.model.InstrumentEventActivity
classname InstrumentEventActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransaction, PortfolioSettlementInstruction, InstrumentActivity, QuoteActivity, ComplexMarketDataActivity, InstrumentEventActivity. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**corporateActionSourceScope** | **String** | The scope of the corporate action source that the instrument event belongs to. | [default to String]
**corporateActionSourceCode** | **String** | The code of the corporate action source that the instrument event belongs to. | [default to String]
**instrumentEventId** | **String** | The Id of the instrument event being adjusted. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentEventActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAt = OffsetDateTime.now();
String corporateActionSourceScope = "example corporateActionSourceScope";
String corporateActionSourceCode = "example corporateActionSourceCode";
String instrumentEventId = "example instrumentEventId";


InstrumentEventActivity instrumentEventActivityInstance = new InstrumentEventActivity()
    .asAt(asAt)
    .corporateActionSourceScope(corporateActionSourceScope)
    .corporateActionSourceCode(corporateActionSourceCode)
    .instrumentEventId(instrumentEventId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)