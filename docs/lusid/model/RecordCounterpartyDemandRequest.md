# com.finbourne.sdk.services.lusid.model.RecordCounterpartyDemandRequest
classname RecordCounterpartyDemandRequest
The counterparty's figure for a margin call, to match against ours.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The counterparty&#39;s figure for the call, signed as the call. | [default to java.math.BigDecimal]
**receivedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the demand was received. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**statementReference** | **String** | A reference to the counterparty&#39;s statement, such as a Drive path. Optional. | [optional] [default to String]
**note** | **String** | A note to record with the demand. Optional. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecordCounterpartyDemandRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime receivedAt = OffsetDateTime.now();
@javax.annotation.Nullable String statementReference = "example statementReference";
@javax.annotation.Nullable String note = "example note";


RecordCounterpartyDemandRequest recordCounterpartyDemandRequestInstance = new RecordCounterpartyDemandRequest()
    .amount(amount)
    .receivedAt(receivedAt)
    .statementReference(statementReference)
    .note(note);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)