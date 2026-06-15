# com.finbourne.sdk.services.lusid.model.PortfolioEntity
classname PortfolioEntity
A list of portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [default to URI]
**entityUniqueId** | **String** | The unique id of the entity. | [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) | [optional] [default to Integer]
**status** | **String** | The status of the entity at the current time. Available values: Prevailing, Deleted, DoesNotExist. | [default to String]
**asAtDeleted** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity was deleted. | [optional] [default to OffsetDateTime]
**userIdDeleted** | **String** | The unique id of the user who deleted the entity. | [optional] [default to String]
**requestIdDeleted** | **String** | The unique request id of the command that deleted the entity. | [optional] [default to String]
**effectiveAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The EffectiveAt this Entity is created, if entity does not currently exist in EffectiveAt. | [optional] [default to OffsetDateTime]
**prevailingPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**deletedPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**previewedStatus** | **String** | The status of the previewed entity. Available values: Prevailing, Deleted, DoesNotExist. | [optional] [default to String]
**previewedPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioEntity;
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
@javax.annotation.Nullable OffsetDateTime effectiveAtCreated = OffsetDateTime.now();
PortfolioWithoutHref prevailingPortfolio = new PortfolioWithoutHref();
PortfolioWithoutHref deletedPortfolio = new PortfolioWithoutHref();
@javax.annotation.Nullable String previewedStatus = "example previewedStatus";
PortfolioWithoutHref previewedPortfolio = new PortfolioWithoutHref();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PortfolioEntity portfolioEntityInstance = new PortfolioEntity()
    .href(href)
    .entityUniqueId(entityUniqueId)
    .asAtVersionNumber(asAtVersionNumber)
    .status(status)
    .asAtDeleted(asAtDeleted)
    .userIdDeleted(userIdDeleted)
    .requestIdDeleted(requestIdDeleted)
    .effectiveAtCreated(effectiveAtCreated)
    .prevailingPortfolio(prevailingPortfolio)
    .deletedPortfolio(deletedPortfolio)
    .previewedStatus(previewedStatus)
    .previewedPortfolio(previewedPortfolio)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)