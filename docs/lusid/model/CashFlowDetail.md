# com.finbourne.sdk.services.lusid.model.CashFlowDetail
classname CashFlowDetail
An individual cashflow inside a cashflow bucket, annotated with the source that produced it  in the cash flow waterfall (SRS > Transaction > Instrument).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the cashflow is paid. | [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The signed amount of the cashflow. A positive amount indicates money is received, a negative amount indicates money is paid. The amount is always the gross (pre-haircut) signed amount; when haircut rules are supplied the haircut and net amounts are reported separately. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The payment currency of the cashflow. | [default to String]
**sourceType** | **String** | The source that produced the cashflow in the cash flow waterfall. One of &#39;Instrument&#39; (produced by the valuation engine), &#39;Transaction&#39; (produced from a booked transaction or movement) or &#39;SRS&#39; (sourced from the structured results store). | [default to String]
**instrumentId** | **String** | The LUSID instrument identifier of the instrument that produced the cashflow. | [default to String]
**instrumentDisplayName** | **String** | The display name of the instrument that produced the cashflow. Not present when the instrument cannot be resolved (e.g. deleted, no permission). | [optional] [default to String]
**transactionId** | **String** | The identifier of the transaction from which the cashflow originates, where known. | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**flowType** | **String** | The type of the cashflow, e.g. Coupon, Principal or Premium. | [optional] [default to String]
**movementName** | **String** | The name of the movement that produced the cashflow (e.g. Coupon, Side1), falling back to the flow type when the movement is unnamed. Not present when the cashflow could not be valued. | [optional] [default to String]
**payReceive** | **String** | Indicates whether the cashflow is paid or received. | [optional] [default to String]
**grossAmount** | **java.math.BigDecimal** | The signed amount of the cashflow before any haircut was applied. Only populated when haircut rules were supplied on the request. | [optional] [default to java.math.BigDecimal]
**haircutFraction** | **java.math.BigDecimal** | The fraction of the gross amount removed by the haircut, in the range [0, 1]. Zero for outflows and for cashflows no rule matched. Only populated when haircut rules were supplied on the request. | [optional] [default to java.math.BigDecimal]
**netAmount** | **java.math.BigDecimal** | The signed amount of the cashflow net of the haircut. Only populated when haircut rules were supplied on the request. | [optional] [default to java.math.BigDecimal]
**haircutRuleApplied** | **String** | The identifier of the haircut rule that was applied to the cashflow, or not present when no rule matched or no haircut rules were supplied on the request. | [optional] [default to String]
**error** | **String** | Present when the cashflow could not be valued, for example because of missing market data: the valuation error, matching the CashflowError diagnostic reported by the QueryCashFlows endpoint. In that case the amount is null rather than zero. Error may also be set when only the portfolio-currency FX lookup failed (see AmountInPortfolioCcy), in which case the base Amount remains populated and only AmountInPortfolioCcy and TradeToPortfolioRate are null. | [optional] [default to String]
**amountInPortfolioCcy** | **java.math.BigDecimal** | The signed amount of the cashflow (see Amount), converted into the portfolio&#39;s base currency. Not present when the FX rate used to convert into the portfolio currency could not be resolved; see Error. | [optional] [default to java.math.BigDecimal]
**tradeToPortfolioRate** | **java.math.BigDecimal** | The FX rate used to convert the cashflow amount into the portfolio&#39;s base currency, resolved at the cashflow&#39;s transaction (trade) date, not its payment date. Not present when the rate could not be resolved; see Error. | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CashFlowDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";
String sourceType = "example sourceType";
String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentDisplayName = "example instrumentDisplayName";
@javax.annotation.Nullable String transactionId = "example transactionId";
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String flowType = "example flowType";
@javax.annotation.Nullable String movementName = "example movementName";
@javax.annotation.Nullable String payReceive = "example payReceive";
@javax.annotation.Nullable java.math.BigDecimal grossAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal haircutFraction = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal netAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String haircutRuleApplied = "example haircutRuleApplied";
@javax.annotation.Nullable String error = "example error";
@javax.annotation.Nullable java.math.BigDecimal amountInPortfolioCcy = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal tradeToPortfolioRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<Link> links = new List<Link>();


CashFlowDetail cashFlowDetailInstance = new CashFlowDetail()
    .paymentDate(paymentDate)
    .amount(amount)
    .currency(currency)
    .sourceType(sourceType)
    .instrumentId(instrumentId)
    .instrumentDisplayName(instrumentDisplayName)
    .transactionId(transactionId)
    .portfolioId(portfolioId)
    .flowType(flowType)
    .movementName(movementName)
    .payReceive(payReceive)
    .grossAmount(grossAmount)
    .haircutFraction(haircutFraction)
    .netAmount(netAmount)
    .haircutRuleApplied(haircutRuleApplied)
    .error(error)
    .amountInPortfolioCcy(amountInPortfolioCcy)
    .tradeToPortfolioRate(tradeToPortfolioRate)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)