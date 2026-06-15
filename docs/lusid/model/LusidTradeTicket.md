# com.finbourne.sdk.services.lusid.model.LusidTradeTicket
classname LusidTradeTicket
A LUSID Trade Ticket comprising an instrument, a transaction, and a counterparty.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Transaction ID. Must be unique. | [default to String]
**transactionType** | **String** | Type of transaction for processing. Referenced by Transaction Configuration. | [default to String]
**source** | **String** | Transaction Source. Referenced by Transaction Configuration. | [optional] [default to String]
**transactionDate** | **String** | Transaction Date. Date at which transaction is known. | [default to String]
**settlementDate** | **String** | Transaction settlement. Date at which transaction is finalised and realised into the system. | [default to String]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**units** | **java.math.BigDecimal** | Number of units in the transaction. For an OTC this is somewhat interchangeable with the quantity booked in the  instrument. As M x N or N x M are equivalent it is advised a client chooses one approach and sticks to it.  Arguably either the unit or holding is best unitised. | [default to java.math.BigDecimal]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Identifiers for the instrument. | [default to Map<String, String>]
**instrumentScope** | **String** | Scope of instrument | [optional] [default to String]
**instrumentName** | **String** | Name of instrument | [optional] [default to String]
**instrumentDefinition** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**counterpartyAgreementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**counterparty** | **String** | Counterparty | [optional] [default to String]
**instrumentProperties** | [**List&lt;Property&gt;**](Property.md) | Set of instrument properties (as defined by client/user). | [optional] [default to List<Property>]
**transactionProperties** | [**List&lt;Property&gt;**](Property.md) | Set of transaction properties (as defined by client/user). | [optional] [default to List<Property>]
**tradeTicketType** | **String** | Available values: LusidTradeTicket, ExternalTradeTicket. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.LusidTradeTicket;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionId = "example transactionId";
String transactionType = "example transactionType";
@javax.annotation.Nullable String source = "example source";
String transactionDate = "example transactionDate";
String settlementDate = "example settlementDate";
CurrencyAndAmount totalConsideration = new CurrencyAndAmount();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
LusidInstrument instrumentDefinition = new LusidInstrument();
ResourceId counterpartyAgreementId = new ResourceId();
@javax.annotation.Nullable String counterparty = "example counterparty";
@javax.annotation.Nullable List<Property> instrumentProperties = new List<Property>();
@javax.annotation.Nullable List<Property> transactionProperties = new List<Property>();
String tradeTicketType = "example tradeTicketType";


LusidTradeTicket lusidTradeTicketInstance = new LusidTradeTicket()
    .transactionId(transactionId)
    .transactionType(transactionType)
    .source(source)
    .transactionDate(transactionDate)
    .settlementDate(settlementDate)
    .totalConsideration(totalConsideration)
    .units(units)
    .instrumentIdentifiers(instrumentIdentifiers)
    .instrumentScope(instrumentScope)
    .instrumentName(instrumentName)
    .instrumentDefinition(instrumentDefinition)
    .counterpartyAgreementId(counterpartyAgreementId)
    .counterparty(counterparty)
    .instrumentProperties(instrumentProperties)
    .transactionProperties(transactionProperties)
    .tradeTicketType(tradeTicketType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)