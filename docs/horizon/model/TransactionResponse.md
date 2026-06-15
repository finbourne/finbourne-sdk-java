# com.finbourne.sdk.services.horizon.model.TransactionResponse
classname TransactionResponse
Response containing details of a single transaction for a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** |  | [default to String]
**publicationStatus** | **String** |  | [default to String]
**portfolioScope** | **String** |  | [optional] [default to String]
**portfolioCode** | **String** |  | [optional] [default to String]
**instrumentId** | **String** |  | [default to String]
**instrumentType** | **String** |  | [default to String]
**instrumentName** | **String** |  | [default to String]
**tradeDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**status** | **String** |  | [default to String]
**skipReason** | **String** |  | [optional] [default to String]
**failureReason** | **String** |  | [optional] [default to String]
**outputFileName** | **String** |  | [optional] [default to String]
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**destinations** | [**List&lt;DestinationResponse&gt;**](DestinationResponse.md) |  | [default to List<DestinationResponse>]

```java
import com.finbourne.sdk.services.horizon.model.TransactionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionId = "example transactionId";
String publicationStatus = "example publicationStatus";
@javax.annotation.Nullable String portfolioScope = "example portfolioScope";
@javax.annotation.Nullable String portfolioCode = "example portfolioCode";
String instrumentId = "example instrumentId";
String instrumentType = "example instrumentType";
String instrumentName = "example instrumentName";
OffsetDateTime tradeDate = OffsetDateTime.now();
OffsetDateTime settlementDate = OffsetDateTime.now();
String status = "example status";
@javax.annotation.Nullable String skipReason = "example skipReason";
@javax.annotation.Nullable String failureReason = "example failureReason";
@javax.annotation.Nullable String outputFileName = "example outputFileName";
@javax.annotation.Nullable OffsetDateTime sentAt = OffsetDateTime.now();
List<DestinationResponse> destinations = new List<DestinationResponse>();


TransactionResponse transactionResponseInstance = new TransactionResponse()
    .transactionId(transactionId)
    .publicationStatus(publicationStatus)
    .portfolioScope(portfolioScope)
    .portfolioCode(portfolioCode)
    .instrumentId(instrumentId)
    .instrumentType(instrumentType)
    .instrumentName(instrumentName)
    .tradeDate(tradeDate)
    .settlementDate(settlementDate)
    .status(status)
    .skipReason(skipReason)
    .failureReason(failureReason)
    .outputFileName(outputFileName)
    .sentAt(sentAt)
    .destinations(destinations);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)