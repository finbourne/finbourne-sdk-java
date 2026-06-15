# com.finbourne.sdk.services.lusid.model.PortfolioTransactionAdjustment
classname PortfolioTransactionAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransactionAdjustment, PortfolioSettlementInstructionAdjustment, InstrumentActivityAdjustment, QuoteActivityAdjustment. | [default to String]
**navActivityAdjustmentSource** | **String** | The post closed activity source of the given entity, for example Manual. Available values: Undefined, Manual, Auto. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**portfolioScope** | **String** | The portfolio scope of the given entity | [default to String]
**portfolioCode** | **String** | The portfolio code of the given entity | [default to String]
**transactionId** | **String** | The transaction Id of the PortfolioTransaction being adjusted | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioTransactionAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String navActivityAdjustmentSource = "example navActivityAdjustmentSource";
OffsetDateTime asAt = OffsetDateTime.now();
String portfolioScope = "example portfolioScope";
String portfolioCode = "example portfolioCode";
String transactionId = "example transactionId";


PortfolioTransactionAdjustment portfolioTransactionAdjustmentInstance = new PortfolioTransactionAdjustment()
    .navActivityAdjustmentSource(navActivityAdjustmentSource)
    .asAt(asAt)
    .portfolioScope(portfolioScope)
    .portfolioCode(portfolioCode)
    .transactionId(transactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)