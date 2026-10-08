# com.finbourne.sdk.services.lusid.model.WritebackSuggestion
classname WritebackSuggestion
A writeback suggested against a target-side item of a rec result. Polymorphic by WritebackType; each  supported type has a corresponding inherited class carrying the upsertable request it proposes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultPattern** | [**WritebackResultPattern**](WritebackResultPattern.md) |  | [default to WritebackResultPattern]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**settlementInstructionRequest** | [**SettlementInstructionRequest**](SettlementInstructionRequest.md) |  | [default to SettlementInstructionRequest]
**writebackType** | **String** | Polymorphic discriminator, carrying the same values as writebackType on the matching ruleset&#39;s writeback configuration. Supported types: SettleExpectedActivity. Available values: SettleExpectedActivity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WritebackSuggestion;
import java.util.*;
import java.lang.System;
import java.net.URI;

WritebackResultPattern resultPattern = new WritebackResultPattern();
ResourceId portfolioId = new ResourceId();
SettlementInstructionRequest settlementInstructionRequest = new SettlementInstructionRequest();
String writebackType = "example writebackType";


WritebackSuggestion writebackSuggestionInstance = new WritebackSuggestion()
    .resultPattern(resultPattern)
    .portfolioId(portfolioId)
    .settlementInstructionRequest(settlementInstructionRequest)
    .writebackType(writebackType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)