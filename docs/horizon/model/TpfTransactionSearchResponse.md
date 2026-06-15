# com.finbourne.sdk.services.horizon.model.TpfTransactionSearchResponse
classname TpfTransactionSearchResponse
TPF send history record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Transaction identifier | [default to String]
**instanceId** | [**UUID**](UUID.md) | Integration instance ID where the transaction was processed | [default to UUID]
**instanceName** | **String** | Integration instance name | [default to String]
**batchId** | [**UUID**](UUID.md) | Unique identifier of the batch | [default to UUID]
**runStartTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the batch/run started | [default to OffsetDateTime]
**publicationStatus** | **String** | Publication status of the transaction (Sent | Skipped | Failed) | [default to String]
**instrumentName** | **String** | Instrument name | [default to String]
**instrumentType** | **String** | Instrument type | [default to String]
**tradeDate** | [**OffsetDateTime**](OffsetDateTime.md) | Trade date of the transaction | [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date of the transaction | [optional] [default to OffsetDateTime]
**skipReason** | **String** | Reason the transaction was skipped (if applicable) | [optional] [default to String]
**fileName** | **String** | Output file associated with the publication run | [optional] [default to String]
**destinations** | **List&lt;String&gt;** | Destinations to which the transaction was published | [optional] [default to List<String>]
**portfolioCode** | **String** | PortfolioCode showing portfolio code | [optional] [default to String]
**portfolioScope** | **String** | PortfolioScope displaying portfolio scope | [optional] [default to String]
**failureReason** | **String** | FailureReason to show failure reason | [optional] [default to String]
**instrumentId** | **String** | InstrumentId showing instrument id of transaction | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.TpfTransactionSearchResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionId = "example transactionId";
UUID instanceId = "example instanceId";
String instanceName = "example instanceName";
UUID batchId = "example batchId";
OffsetDateTime runStartTime = OffsetDateTime.now();
String publicationStatus = "example publicationStatus";
String instrumentName = "example instrumentName";
String instrumentType = "example instrumentType";
OffsetDateTime tradeDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime settlementDate = OffsetDateTime.now();
@javax.annotation.Nullable String skipReason = "example skipReason";
@javax.annotation.Nullable String fileName = "example fileName";
@javax.annotation.Nullable List<String> destinations = new List<String>();
@javax.annotation.Nullable String portfolioCode = "example portfolioCode";
@javax.annotation.Nullable String portfolioScope = "example portfolioScope";
@javax.annotation.Nullable String failureReason = "example failureReason";
@javax.annotation.Nullable String instrumentId = "example instrumentId";


TpfTransactionSearchResponse tpfTransactionSearchResponseInstance = new TpfTransactionSearchResponse()
    .transactionId(transactionId)
    .instanceId(instanceId)
    .instanceName(instanceName)
    .batchId(batchId)
    .runStartTime(runStartTime)
    .publicationStatus(publicationStatus)
    .instrumentName(instrumentName)
    .instrumentType(instrumentType)
    .tradeDate(tradeDate)
    .settlementDate(settlementDate)
    .skipReason(skipReason)
    .fileName(fileName)
    .destinations(destinations)
    .portfolioCode(portfolioCode)
    .portfolioScope(portfolioScope)
    .failureReason(failureReason)
    .instrumentId(instrumentId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)