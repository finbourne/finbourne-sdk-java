# com.finbourne.sdk.services.lusid.model.Fund
classname Fund
A Fund entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Fund. | [optional] [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**baseCurrency** | **String** | The base currency of the Fund in ISO 4217 currency code format. All portfolios must be of a matching base currency. | [optional] [default to String]
**investorStructure** | **String** | The Investor structure to be used by the Fund. Available values: NonUnitised, Classes. | [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityIdWithDetails&gt;**](PortfolioEntityIdWithDetails.md) | A list of the portfolios on the fund, which are part of the Fund. Note: These must all have the same base currency, which must also match the Fund Base Currency. | [optional] [default to List<PortfolioEntityIdWithDetails>]
**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**shortCode** | **String** | A short code for the Fund. A fund structure tags journal entry lines with the short code of the member they originated from, so it should be unique across the funds of one structure. Optional. | [optional] [default to String]
**aborId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. These would be decommissioned in favour of the new AllocationGroups and ShareClasses structures. | [optional] [default to List<InstrumentResolutionDetail>]
**type** | **String** | The kind of vehicle the fund is, one of the values of the system/fundVehicleType data type. Master and Feeder are deprecated: the structural role of a fund now lives on its fund structure node, and a fund with either type cannot be a member of a fund structure. Available values: Standalone, Master, Feeder, SPV, AIV, TaxBlocker, CarryVehicle, SponsorCommitmentVehicle, CoInvestVehicle, GPInterestHolder, SMA, CTA. | [optional] [default to String]
**taxTransparency** | **String** | Whether the Fund is looked through for tax: Transparent passes its income and gains to its holders as their own, Opaque is taxed in its own right. Optional; if not set, a TaxBlocker is Opaque and a CarryVehicle or GPInterestHolder is Transparent. A fund structure requires it on every SPV and AIV member. Available values: Transparent, Opaque. | [optional] [default to String]
**inceptionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Inception date of the Fund | [default to OffsetDateTime]
**decimalPlaces** | **Integer** | Number of decimal places for reporting | [optional] [default to Integer]
**yearEndDate** | [**DayMonth**](DayMonth.md) |  | [optional] [default to DayMonth]
**primaryNavType** | [**NavType**](NavType.md) |  | [optional] [default to NavType]
**additionalNavTypes** | [**List&lt;NavType&gt;**](NavType.md) | The definitions for any additional NAVs on the Fund. | [optional] [default to List<NavType>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. | [optional] [default to Map<String, Property>]
**createInstrument** | **Boolean** | Whether to create instruments for the Fund&#39;s share classes, series, or partner classes upon creation. Defaults to false. | [optional] [default to Boolean]
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Group definitions for the Fund. | [optional] [default to List<AllocationGroup>]
**shareClasses** | [**List&lt;ShareClass&gt;**](ShareClass.md) | An optional list of Share Class definitions for the Fund. | [optional] [default to List<ShareClass>]
**fundInstrument** | [**FundInstrument**](FundInstrument.md) |  | [optional] [default to FundInstrument]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Fund;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";
String investorStructure = "example investorStructure";
@javax.annotation.Nullable List<PortfolioEntityIdWithDetails> portfolioIds = new List<PortfolioEntityIdWithDetails>();
ResourceId fundConfigurationId = new ResourceId();
@javax.annotation.Nullable String shortCode = "example shortCode";
ResourceId aborId = new ResourceId();
@javax.annotation.Nullable List<InstrumentResolutionDetail> shareClassInstruments = new List<InstrumentResolutionDetail>();
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String taxTransparency = "example taxTransparency";
OffsetDateTime inceptionDate = OffsetDateTime.now();
@javax.annotation.Nullable Integer decimalPlaces = new Integer("100.00");
DayMonth yearEndDate = new DayMonth();
NavType primaryNavType = new NavType();
@javax.annotation.Nullable List<NavType> additionalNavTypes = new List<NavType>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Boolean createInstrument = true;
@javax.annotation.Nullable List<AllocationGroup> allocationGroups = new List<AllocationGroup>();
@javax.annotation.Nullable List<ShareClass> shareClasses = new List<ShareClass>();
FundInstrument fundInstrument = new FundInstrument();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Fund fundInstance = new Fund()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .baseCurrency(baseCurrency)
    .investorStructure(investorStructure)
    .portfolioIds(portfolioIds)
    .fundConfigurationId(fundConfigurationId)
    .shortCode(shortCode)
    .aborId(aborId)
    .shareClassInstruments(shareClassInstruments)
    .type(type)
    .taxTransparency(taxTransparency)
    .inceptionDate(inceptionDate)
    .decimalPlaces(decimalPlaces)
    .yearEndDate(yearEndDate)
    .primaryNavType(primaryNavType)
    .additionalNavTypes(additionalNavTypes)
    .properties(properties)
    .createInstrument(createInstrument)
    .allocationGroups(allocationGroups)
    .shareClasses(shareClasses)
    .fundInstrument(fundInstrument)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)