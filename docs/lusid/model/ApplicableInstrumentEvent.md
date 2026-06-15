# com.finbourne.sdk.services.lusid.model.ApplicableInstrumentEvent
classname ApplicableInstrumentEvent
Represents applicable instrument event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingId** | **Long** |  | [default to Long]
**lusidInstrumentId** | **String** |  | [default to String]
**instrumentScope** | **String** |  | [default to String]
**instrumentType** | **String** |  | [default to String]
**instrumentEventType** | **String** |  | [default to String]
**instrumentEventId** | **String** |  | [default to String]
**generatedEvent** | [**InstrumentEventHolder**](InstrumentEventHolder.md) |  | [optional] [default to InstrumentEventHolder]
**generatedEventDiagnostics** | [**GeneratedEventDiagnostics**](GeneratedEventDiagnostics.md) |  | [optional] [default to GeneratedEventDiagnostics]
**loadedEvent** | [**InstrumentEventHolder**](InstrumentEventHolder.md) |  | [optional] [default to InstrumentEventHolder]
**appliedInstrumentEventInstructionId** | **String** |  | [optional] [default to String]
**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) |  | [optional] [default to List<Transaction>]
**transactionDiagnostics** | [**TransactionDiagnostics**](TransactionDiagnostics.md) |  | [optional] [default to TransactionDiagnostics]
**appliedInstrumentEventInstruction** | [**InstrumentEventInstruction**](InstrumentEventInstruction.md) |  | [optional] [default to InstrumentEventInstruction]
**eligibleBalance** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ApplicableInstrumentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
Long holdingId = new Long("100.00");
String lusidInstrumentId = "example lusidInstrumentId";
String instrumentScope = "example instrumentScope";
String instrumentType = "example instrumentType";
String instrumentEventType = "example instrumentEventType";
String instrumentEventId = "example instrumentEventId";
InstrumentEventHolder generatedEvent = new InstrumentEventHolder();
GeneratedEventDiagnostics generatedEventDiagnostics = new GeneratedEventDiagnostics();
InstrumentEventHolder loadedEvent = new InstrumentEventHolder();
@javax.annotation.Nullable String appliedInstrumentEventInstructionId = "example appliedInstrumentEventInstructionId";
@javax.annotation.Nullable List<Transaction> transactions = new List<Transaction>();
TransactionDiagnostics transactionDiagnostics = new TransactionDiagnostics();
InstrumentEventInstruction appliedInstrumentEventInstruction = new InstrumentEventInstruction();
@javax.annotation.Nullable java.math.BigDecimal eligibleBalance = new java.math.BigDecimal("100.00");


ApplicableInstrumentEvent applicableInstrumentEventInstance = new ApplicableInstrumentEvent()
    .portfolioId(portfolioId)
    .holdingId(holdingId)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .instrumentType(instrumentType)
    .instrumentEventType(instrumentEventType)
    .instrumentEventId(instrumentEventId)
    .generatedEvent(generatedEvent)
    .generatedEventDiagnostics(generatedEventDiagnostics)
    .loadedEvent(loadedEvent)
    .appliedInstrumentEventInstructionId(appliedInstrumentEventInstructionId)
    .transactions(transactions)
    .transactionDiagnostics(transactionDiagnostics)
    .appliedInstrumentEventInstruction(appliedInstrumentEventInstruction)
    .eligibleBalance(eligibleBalance);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)