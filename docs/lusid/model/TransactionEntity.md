# com.finbourne.sdk.services.lusid.model.TransactionEntity
classname TransactionEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The link to the transaction entity. | [default to URI]
**entityUniqueId** | **String** | The unique id of the transaction, combining the portfolio and transaction identifiers. | [default to String]
**asAtVersionNumber** | **Integer** | The version number of the transaction entity at the requested asAt. | [optional] [default to Integer]
**status** | **String** | The status of the transaction entity. &#39;Prevailing&#39; when the transaction exists — including a cancelled transaction, whose cancellation is reflected in its own status rather than here; &#39;Deleted&#39; when the transaction&#39;s portfolio has been deleted; &#39;DoesNotExist&#39; when the transaction does not yet exist (e.g. staged creation preview). Available values: Prevailing, Deleted, DoesNotExist. | [default to String]
**asAtDeleted** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the portfolio (and by extension, the transaction) was deleted. | [optional] [default to OffsetDateTime]
**userIdDeleted** | **String** | The unique id of the user who deleted the portfolio. | [optional] [default to String]
**requestIdDeleted** | **String** | The unique request id of the command that deleted the portfolio. | [optional] [default to String]
**prevailingPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**prevailingInputTransaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**deletedPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**deletedInputTransaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**previewedStatus** | **String** | The status of the transaction after the staged modification is applied. Always &#39;Prevailing&#39; for transaction previews. Available values: Prevailing, Deleted, DoesNotExist. | [optional] [default to String]
**previewedPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**previewedInputTransaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

URI href = URI.create("http://example.com/href");
String entityUniqueId = "example entityUniqueId";
@javax.annotation.Nullable Integer asAtVersionNumber = new Integer("100.00");
String status = "example status";
@javax.annotation.Nullable OffsetDateTime asAtDeleted = OffsetDateTime.now();
@javax.annotation.Nullable String userIdDeleted = "example userIdDeleted";
@javax.annotation.Nullable String requestIdDeleted = "example requestIdDeleted";
PortfolioWithoutHref prevailingPortfolio = new PortfolioWithoutHref();
Transaction prevailingInputTransaction = new Transaction();
PortfolioWithoutHref deletedPortfolio = new PortfolioWithoutHref();
Transaction deletedInputTransaction = new Transaction();
@javax.annotation.Nullable String previewedStatus = "example previewedStatus";
PortfolioWithoutHref previewedPortfolio = new PortfolioWithoutHref();
Transaction previewedInputTransaction = new Transaction();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TransactionEntity transactionEntityInstance = new TransactionEntity()
    .href(href)
    .entityUniqueId(entityUniqueId)
    .asAtVersionNumber(asAtVersionNumber)
    .status(status)
    .asAtDeleted(asAtDeleted)
    .userIdDeleted(userIdDeleted)
    .requestIdDeleted(requestIdDeleted)
    .prevailingPortfolio(prevailingPortfolio)
    .prevailingInputTransaction(prevailingInputTransaction)
    .deletedPortfolio(deletedPortfolio)
    .deletedInputTransaction(deletedInputTransaction)
    .previewedStatus(previewedStatus)
    .previewedPortfolio(previewedPortfolio)
    .previewedInputTransaction(previewedInputTransaction)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)