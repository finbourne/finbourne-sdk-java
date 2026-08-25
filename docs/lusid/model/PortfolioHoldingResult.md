# com.finbourne.sdk.services.lusid.model.PortfolioHoldingResult
classname PortfolioHoldingResult
Represents holding details for a data quality check result, where LusidEntityResult represents a scope-and-code  or identifier-addressed entity. A holding has no scope and code of its own, so it is identified by the portfolio  it came from plus what distinguishes it within that portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity. Always \&quot;Holding\&quot;. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp for the holding | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective-at timestamp for the holding | [optional] [default to OffsetDateTime]
**sourcePortfolioScope** | **String** | The scope of the portfolio this holding came from | [optional] [default to String]
**sourcePortfolioCode** | **String** | The code of the portfolio this holding came from | [optional] [default to String]
**sourcePortfolioEntityUniqueId** | **String** | The unique identifier of the portfolio this holding came from | [optional] [default to String]
**sourcePortfolioDisplayName** | **String** | The display name of the portfolio this holding came from | [optional] [default to String]
**holdingId** | **String** | The holding&#39;s identifier within its portfolio | [optional] [default to String]
**taxlotId** | **String** | The tax lot identifier, where the holding was expanded to tax lots. Null otherwise. | [optional] [default to String]
**subEntityId** | **String** | Identifies the holding to the derived property explain API: the holding id on its own, or the holding id  and tax lot id colon-separated where a tax lot is present. | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument identifier of the instrument held | [optional] [default to String]
**instrumentDisplayName** | **String** | The name of the instrument held | [optional] [default to String]
**holdingTypeName** | **String** | The kind of holding, e.g. Position, Balance | [optional] [default to String]
**currency** | **String** | The currency of the holding | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioHoldingResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String entityType = "example entityType";
OffsetDateTime asAt = OffsetDateTime.now();
OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String sourcePortfolioScope = "example sourcePortfolioScope";
@javax.annotation.Nullable String sourcePortfolioCode = "example sourcePortfolioCode";
@javax.annotation.Nullable String sourcePortfolioEntityUniqueId = "example sourcePortfolioEntityUniqueId";
@javax.annotation.Nullable String sourcePortfolioDisplayName = "example sourcePortfolioDisplayName";
@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String taxlotId = "example taxlotId";
@javax.annotation.Nullable String subEntityId = "example subEntityId";
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentDisplayName = "example instrumentDisplayName";
@javax.annotation.Nullable String holdingTypeName = "example holdingTypeName";
@javax.annotation.Nullable String currency = "example currency";


PortfolioHoldingResult portfolioHoldingResultInstance = new PortfolioHoldingResult()
    .entityType(entityType)
    .asAt(asAt)
    .effectiveAt(effectiveAt)
    .sourcePortfolioScope(sourcePortfolioScope)
    .sourcePortfolioCode(sourcePortfolioCode)
    .sourcePortfolioEntityUniqueId(sourcePortfolioEntityUniqueId)
    .sourcePortfolioDisplayName(sourcePortfolioDisplayName)
    .holdingId(holdingId)
    .taxlotId(taxlotId)
    .subEntityId(subEntityId)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentDisplayName(instrumentDisplayName)
    .holdingTypeName(holdingTypeName)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)