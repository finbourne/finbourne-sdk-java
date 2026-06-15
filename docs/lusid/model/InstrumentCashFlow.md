# com.finbourne.sdk.services.lusid.model.InstrumentCashFlow
classname InstrumentCashFlow
The details for the cashflow associated with an instrument from a given portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the given cash flow is due to be paid (SettlementDate is used somewhat interchangeably with PaymentDate.) | [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The quantity (amount) that will be paid. Note that this can be empty if the payment is in the future and a model is used that cannot estimate it. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The payment currency of the cash flow. | [default to String]
**sourcePortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceTransactionId** | **String** | The identifier for the parent transaction on the instrument that will pay/receive this cash flow. | [default to String]
**sourceInstrumentScope** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [default to String]
**sourceInstrumentId** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [default to String]
**diagnostics** | **Map&lt;String, String&gt;** | Whilst a cash flow is defined by an (amount,ccy) pair and the date it is paid on there is additional information required for diagnostics. This includes a range of information and can be empty in the case of a simple cash quantity or where further information is not available. Typical information includes items such as reset dates, RIC, accrual start/end, number of days and curve data. | [default to Map<String, String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentCashFlow;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";
ResourceId sourcePortfolioId = new ResourceId();
String sourceTransactionId = "example sourceTransactionId";
String sourceInstrumentScope = "example sourceInstrumentScope";
String sourceInstrumentId = "example sourceInstrumentId";
Map<String, String> diagnostics = new Map<String, String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


InstrumentCashFlow instrumentCashFlowInstance = new InstrumentCashFlow()
    .paymentDate(paymentDate)
    .amount(amount)
    .currency(currency)
    .sourcePortfolioId(sourcePortfolioId)
    .sourceTransactionId(sourceTransactionId)
    .sourceInstrumentScope(sourceInstrumentScope)
    .sourceInstrumentId(sourceInstrumentId)
    .diagnostics(diagnostics)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)