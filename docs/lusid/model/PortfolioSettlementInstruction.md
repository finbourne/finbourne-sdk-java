# com.finbourne.sdk.services.lusid.model.PortfolioSettlementInstruction
classname PortfolioSettlementInstruction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransaction, PortfolioSettlementInstruction, InstrumentActivity, QuoteActivity, ComplexMarketDataActivity. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**portfolioScope** | **String** | The portfolio scope of the given entity | [default to String]
**portfolioCode** | **String** | The portfolio code of the given entity | [default to String]
**settlementInstructionId** | **String** | The settlement instruction Id of the SettlementInstruction being adjusted | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioSettlementInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAt = OffsetDateTime.now();
String portfolioScope = "example portfolioScope";
String portfolioCode = "example portfolioCode";
String settlementInstructionId = "example settlementInstructionId";


PortfolioSettlementInstruction portfolioSettlementInstructionInstance = new PortfolioSettlementInstruction()
    .asAt(asAt)
    .portfolioScope(portfolioScope)
    .portfolioCode(portfolioCode)
    .settlementInstructionId(settlementInstructionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)