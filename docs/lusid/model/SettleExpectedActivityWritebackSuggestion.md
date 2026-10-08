# com.finbourne.sdk.services.lusid.model.SettleExpectedActivityWritebackSuggestion
classname SettleExpectedActivityWritebackSuggestion
Suggests a settlement instruction that settles the expected activity of the target item, using the  settlement confirmed by the origin item on the other side of the result. The request is upsertable as-is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultPattern** | [**WritebackResultPattern**](WritebackResultPattern.md) |  | [default to WritebackResultPattern]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**settlementInstructionRequest** | [**SettlementInstructionRequest**](SettlementInstructionRequest.md) |  | [default to SettlementInstructionRequest]
**writebackType** | **String** | Polymorphic discriminator, carrying the same values as writebackType on the matching ruleset&#39;s writeback configuration. Supported types: SettleExpectedActivity. Available values: SettleExpectedActivity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SettleExpectedActivityWritebackSuggestion;
import java.util.*;
import java.lang.System;
import java.net.URI;

WritebackResultPattern resultPattern = new WritebackResultPattern();
ResourceId portfolioId = new ResourceId();
SettlementInstructionRequest settlementInstructionRequest = new SettlementInstructionRequest();
String writebackType = "example writebackType";


SettleExpectedActivityWritebackSuggestion settleExpectedActivityWritebackSuggestionInstance = new SettleExpectedActivityWritebackSuggestion()
    .resultPattern(resultPattern)
    .portfolioId(portfolioId)
    .settlementInstructionRequest(settlementInstructionRequest)
    .writebackType(writebackType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)