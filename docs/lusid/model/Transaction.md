# com.finbourne.sdk.services.lusid.model.Transaction
classname Transaction
A list of transactions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier for the transaction. | [default to String]
**type** | **String** | The type of the transaction e.g. &#39;Buy&#39;, &#39;Sell&#39;. The transaction type should have been pre-configured via the System Configuration API endpoint. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the transaction to a unique instrument. | [optional] [default to Map<String, String>]
**instrumentScope** | **String** | The scope in which the transaction&#39;s instrument lies. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the transaction is in. | [default to String]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the transaction. | [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the transaction. | [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The number of units transacted in the associated instrument. | [default to java.math.BigDecimal]
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  | [optional] [default to TransactionPrice]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**exchangeRate** | **java.math.BigDecimal** | The exchange rate between the transaction and settlement currency (settlement currency being represented by the TotalConsideration.Currency). For example if the transaction currency is in USD and the settlement currency is in GBP this this the USD/GBP rate. | [optional] [default to java.math.BigDecimal]
**transactionCurrency** | **String** | The transaction currency. | [optional] [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique transaction properties and associated values to stored with the transaction. Each property will be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**counterpartyId** | **String** | The identifier for the counterparty of the transaction. | [optional] [default to String]
**source** | **String** | The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. | [optional] [default to String]
**entryDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime that the transaction was added to LUSID. | [optional] [default to OffsetDateTime]
**otcConfirmation** | [**OtcConfirmation**](OtcConfirmation.md) |  | [optional] [default to OtcConfirmation]
**transactionStatus** | **String** | The status of the transaction. Available values: Active, Amended, Cancelled, ActiveReversal, ActiveTrueUp, CancelledTrueUp. | [optional] [default to String]
**cancelDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | If the transaction has been cancelled, the asAt datetime that the transaction was cancelled. | [optional] [default to OffsetDateTime]
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**allocationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccount** | [**CustodianAccount**](CustodianAccount.md) |  | [optional] [default to CustodianAccount]
**transactionGroupId** | **String** | The identifier for grouping economic events across multiple transactions | [optional] [default to String]
**strategyTag** | [**List&lt;Strategy&gt;**](Strategy.md) | A list of strategies representing the allocation of units across multiple sub-holding keys | [optional] [default to List<Strategy>]
**resolvedTransactionTypeDetails** | [**TransactionTypeDetails**](TransactionTypeDetails.md) |  | [optional] [default to TransactionTypeDetails]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**custodianEntries** | [**List&lt;CustodianEntry&gt;**](CustodianEntry.md) | A list of Custodian Entries associated with the transaction. | [optional] [default to List<CustodianEntry>]

```java
import com.finbourne.sdk.services.lusid.model.Transaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionId = "example transactionId";
String type = "example type";
@javax.annotation.Nullable Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String instrumentUid = "example instrumentUid";
OffsetDateTime transactionDate = OffsetDateTime.now();
OffsetDateTime settlementDate = OffsetDateTime.now();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
TransactionPrice transactionPrice = new TransactionPrice();
CurrencyAndAmount totalConsideration = new CurrencyAndAmount();
@javax.annotation.Nullable java.math.BigDecimal exchangeRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String transactionCurrency = "example transactionCurrency";
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String counterpartyId = "example counterpartyId";
@javax.annotation.Nullable String source = "example source";
OffsetDateTime entryDateTime = OffsetDateTime.now();
OtcConfirmation otcConfirmation = new OtcConfirmation();
String transactionStatus = "example transactionStatus";
@javax.annotation.Nullable OffsetDateTime cancelDateTime = OffsetDateTime.now();
ResourceId orderId = new ResourceId();
ResourceId allocationId = new ResourceId();
CustodianAccount custodianAccount = new CustodianAccount();
@javax.annotation.Nullable String transactionGroupId = "example transactionGroupId";
@javax.annotation.Nullable List<Strategy> strategyTag = new List<Strategy>();
TransactionTypeDetails resolvedTransactionTypeDetails = new TransactionTypeDetails();
DataModelMembership dataModelMembership = new DataModelMembership();
Version version = new Version();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
@javax.annotation.Nullable List<CustodianEntry> custodianEntries = new List<CustodianEntry>();


Transaction transactionInstance = new Transaction()
    .transactionId(transactionId)
    .type(type)
    .instrumentIdentifiers(instrumentIdentifiers)
    .instrumentScope(instrumentScope)
    .instrumentUid(instrumentUid)
    .transactionDate(transactionDate)
    .settlementDate(settlementDate)
    .units(units)
    .transactionPrice(transactionPrice)
    .totalConsideration(totalConsideration)
    .exchangeRate(exchangeRate)
    .transactionCurrency(transactionCurrency)
    .properties(properties)
    .counterpartyId(counterpartyId)
    .source(source)
    .entryDateTime(entryDateTime)
    .otcConfirmation(otcConfirmation)
    .transactionStatus(transactionStatus)
    .cancelDateTime(cancelDateTime)
    .orderId(orderId)
    .allocationId(allocationId)
    .custodianAccount(custodianAccount)
    .transactionGroupId(transactionGroupId)
    .strategyTag(strategyTag)
    .resolvedTransactionTypeDetails(resolvedTransactionTypeDetails)
    .dataModelMembership(dataModelMembership)
    .version(version)
    .stagedModifications(stagedModifications)
    .custodianEntries(custodianEntries);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)