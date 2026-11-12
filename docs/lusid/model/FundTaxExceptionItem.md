# com.finbourne.sdk.services.lusid.model.FundTaxExceptionItem
classname FundTaxExceptionItem
A tax exception row seen across funds, so the fund and the owning life-company entity travel with it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**fund** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**id** | **String** | An identifier stable within a response, built from the category, portfolio and instrument. | [default to String]
**category** | **String** | The kind of exception: UnmatchedDisposal, NegativePool, MissingValuation or UnclassifiedInstrument. | [default to String]
**severity** | **String** | Error when the exception blocks the tax computation, Warning when it casts doubt on it. | [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrument** | **String** | The LUSID unique identifier of the instrument the exception was raised against. | [optional] [default to String]
**message** | **String** | A description of the exception. | [default to String]
**raisedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the exception was observed at. | [default to OffsetDateTime]
**taxAtStake** | **java.math.BigDecimal** | The tax effect, in the Fund&#39;s base currency, of the position or gain the exception blocks, at the Fund&#39;s configured rate. Absent when the rate or the exposure is not known. | [optional] [default to java.math.BigDecimal]
**rootCause** | [**TaxExceptionRootCause**](TaxExceptionRootCause.md) |  | [optional] [default to TaxExceptionRootCause]

```java
import com.finbourne.sdk.services.lusid.model.FundTaxExceptionItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId client = new ResourceId();
ResourceId fund = new ResourceId();
String id = "example id";
String category = "example category";
String severity = "example severity";
ResourceId portfolio = new ResourceId();
@javax.annotation.Nullable String instrument = "example instrument";
String message = "example message";
OffsetDateTime raisedAt = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal taxAtStake = new java.math.BigDecimal("100.00");
TaxExceptionRootCause rootCause = new TaxExceptionRootCause();


FundTaxExceptionItem fundTaxExceptionItemInstance = new FundTaxExceptionItem()
    .client(client)
    .fund(fund)
    .id(id)
    .category(category)
    .severity(severity)
    .portfolio(portfolio)
    .instrument(instrument)
    .message(message)
    .raisedAt(raisedAt)
    .taxAtStake(taxAtStake)
    .rootCause(rootCause);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)