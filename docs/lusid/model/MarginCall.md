# com.finbourne.sdk.services.lusid.model.MarginCall
classname MarginCall
A margin call a run produced under a collateral agreement: our figure, the counterparty's demand once recorded  and how they compare, and where the call is in its lifecycle.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The URI of this margin call. | [optional] [default to URI]
**id** | **String** | The identifier of the call: the run id and the call&#39;s business key joined with &#39;/&#39;. | [default to String]
**runId** | **String** | The run that produced the call. Filterable. | [default to String]
**agreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**counterparty** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [optional] [default to CounterpartyIdentifier]
**item** | **String** | The margin item of the agreement the call is for. Filterable. | [default to String]
**marginType** | **String** | The type of margin called. Currently VariationMargin. Filterable. | [default to String]
**method** | **String** | The calculation method of the margin item. | [optional] [default to String]
**settlement** | **String** | Whether the item is settled or collateralised. | [optional] [default to String]
**direction** | **String** | Who posts: WePost, TheyPost or None when the exposure is flat. Filterable. | [default to String]
**currency** | **String** | The currency of the call, the agreement&#39;s base currency. Filterable. | [default to String]
**required** | **java.math.BigDecimal** | The margin required under the agreement, signed as the call. | [default to java.math.BigDecimal]
**held** | **java.math.BigDecimal** | The collateral already held against the item, signed as the call. | [default to java.math.BigDecimal]
**call** | **java.math.BigDecimal** | Our figure for the amount to move: required less held. Filterable. | [default to java.math.BigDecimal]
**matchTolerance** | **java.math.BigDecimal** | The agreement&#39;s match tolerance captured on the call. | [optional] [default to java.math.BigDecimal]
**counterpartyDemand** | **java.math.BigDecimal** | The counterparty&#39;s figure for the call, once recorded. | [optional] [default to java.math.BigDecimal]
**difference** | **java.math.BigDecimal** | The counterparty&#39;s demand less our call, once recorded. | [optional] [default to java.math.BigDecimal]
**matchStatus** | **String** | How the counterparty&#39;s demand compares to our call. One of Unmatched, Matched, WithinTolerance, Break or NotRequired. Filterable. | [default to String]
**demandReceivedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the counterparty&#39;s demand was received. | [optional] [default to OffsetDateTime]
**statementReference** | **String** | A reference to the counterparty&#39;s statement, such as a Drive path. | [optional] [default to String]
**demandNote** | **String** | A note recorded with the counterparty&#39;s demand. | [optional] [default to String]
**agreedAmount** | **java.math.BigDecimal** | The amount agreed to move, once the call is accepted or disputed. | [optional] [default to java.math.BigDecimal]
**disputedAmount** | **java.math.BigDecimal** | The part of the counterparty&#39;s demand left in dispute. | [optional] [default to java.math.BigDecimal]
**disputeReason** | **String** | Why the call is disputed. | [optional] [default to String]
**disputeOwner** | **String** | Who owns the dispute. | [optional] [default to String]
**state** | **String** | Where the call is in its lifecycle. One of Calculated, Accepted or Disputed. Filterable. | [default to String]
**deadline** | [**OffsetDateTime**](OffsetDateTime.md) | The time the call must be agreed by. Empty until agreements carry a notification time. | [optional] [default to OffsetDateTime]
**supersedes** | [**MarginCallReference**](MarginCallReference.md) |  | [optional] [default to MarginCallReference]
**carriedFrom** | [**MarginCallReference**](MarginCallReference.md) |  | [optional] [default to MarginCallReference]
**carriedDisputedAmount** | **java.math.BigDecimal** | The amount left in dispute on the carried call. Informational; not added to this call. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MarginCall;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String id = "example id";
String runId = "example runId";
ResourceId agreementId = new ResourceId();
CounterpartyIdentifier counterparty = new CounterpartyIdentifier();
String item = "example item";
String marginType = "example marginType";
@javax.annotation.Nullable String method = "example method";
@javax.annotation.Nullable String settlement = "example settlement";
String direction = "example direction";
String currency = "example currency";
java.math.BigDecimal required = new java.math.BigDecimal("100.00");
java.math.BigDecimal held = new java.math.BigDecimal("100.00");
java.math.BigDecimal call = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal matchTolerance = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal counterpartyDemand = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal difference = new java.math.BigDecimal("100.00");
String matchStatus = "example matchStatus";
@javax.annotation.Nullable OffsetDateTime demandReceivedAt = OffsetDateTime.now();
@javax.annotation.Nullable String statementReference = "example statementReference";
@javax.annotation.Nullable String demandNote = "example demandNote";
@javax.annotation.Nullable java.math.BigDecimal agreedAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal disputedAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String disputeReason = "example disputeReason";
@javax.annotation.Nullable String disputeOwner = "example disputeOwner";
String state = "example state";
@javax.annotation.Nullable OffsetDateTime deadline = OffsetDateTime.now();
MarginCallReference supersedes = new MarginCallReference();
MarginCallReference carriedFrom = new MarginCallReference();
@javax.annotation.Nullable java.math.BigDecimal carriedDisputedAmount = new java.math.BigDecimal("100.00");


MarginCall marginCallInstance = new MarginCall()
    .href(href)
    .id(id)
    .runId(runId)
    .agreementId(agreementId)
    .counterparty(counterparty)
    .item(item)
    .marginType(marginType)
    .method(method)
    .settlement(settlement)
    .direction(direction)
    .currency(currency)
    .required(required)
    .held(held)
    .call(call)
    .matchTolerance(matchTolerance)
    .counterpartyDemand(counterpartyDemand)
    .difference(difference)
    .matchStatus(matchStatus)
    .demandReceivedAt(demandReceivedAt)
    .statementReference(statementReference)
    .demandNote(demandNote)
    .agreedAmount(agreedAmount)
    .disputedAmount(disputedAmount)
    .disputeReason(disputeReason)
    .disputeOwner(disputeOwner)
    .state(state)
    .deadline(deadline)
    .supersedes(supersedes)
    .carriedFrom(carriedFrom)
    .carriedDisputedAmount(carriedDisputedAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)