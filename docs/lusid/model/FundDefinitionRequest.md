# com.finbourne.sdk.services.lusid.model.FundDefinitionRequest
classname FundDefinitionRequest
The request used to create a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Fund. | [default to String]
**shortCode** | **String** | A short code for the Fund. A fund structure tags journal entry lines with the short code of the member they originated from, so it should be unique across the funds of one structure. Optional. | [optional] [default to String]
**displayName** | **String** | The name of the Fund. | [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**baseCurrency** | **String** | The base currency of the Fund in ISO 4217 currency code format. All portfolios must be of a matching base currency. | [default to String]
**investorStructure** | **String** | The Investor structure to be used by the Fund. Available values: NonUnitised, Classes. | [optional] [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | A list of the Portfolio IDs associated with the fund, which are part of the Fund. Note: These must all have the same base currency, which must also match the Fund Base Currency. | [default to List<PortfolioEntityId>]
**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**shareClassInstrumentScopes** | **List&lt;String&gt;** | The scopes in which the instruments lie, currently limited to one. | [optional] [default to List<String>]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. These would be decommissioned in favour of the new AllocationGroups and ShareClasses structures. | [optional] [default to List<InstrumentResolutionDetail>]
**type** | **String** | The kind of vehicle the fund is, one of the values of the system/fundVehicleType data type. Master and Feeder are deprecated: the structural role of a fund now lives on its fund structure node, and a fund with either type cannot be a member of a fund structure. Available values: Standalone, Master, Feeder, SPV, AIV, TaxBlocker, CarryVehicle, SponsorCommitmentVehicle, CoInvestVehicle, GPInterestHolder, SMA, CTA. | [optional] [default to String]
**taxTransparency** | **String** | Whether the Fund is looked through for tax: Transparent passes its income and gains to its holders as their own, Opaque is taxed in its own right. Optional; if not set, a TaxBlocker is Opaque and a CarryVehicle or GPInterestHolder is Transparent. A fund structure requires it on every SPV and AIV member. Available values: Transparent, Opaque. | [optional] [default to String]
**inceptionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Inception date of the Fund | [default to OffsetDateTime]
**decimalPlaces** | **Integer** | Number of decimal places for reporting | [optional] [default to Integer]
**primaryNavType** | [**NavTypeDefinition**](NavTypeDefinition.md) |  | [default to NavTypeDefinition]
**additionalNavTypes** | [**List&lt;NavTypeDefinition&gt;**](NavTypeDefinition.md) | The definitions for any additional NAVs on the Fund. | [optional] [default to List<NavTypeDefinition>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. | [optional] [default to Map<String, Property>]
**createInstrument** | **Boolean** | Whether to create instruments for the Fund&#39;s share classes, series, or partner classes upon creation. Defaults to false. | [optional] [default to Boolean]
**shareClasses** | [**List&lt;ShareClassDefinition&gt;**](ShareClassDefinition.md) | An optional list of Share Class definitions for the Fund. | [optional] [default to List<ShareClassDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.FundDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String shortCode = "example shortCode";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String baseCurrency = "example baseCurrency";
@javax.annotation.Nullable String investorStructure = "example investorStructure";
List<PortfolioEntityId> portfolioIds = new List<PortfolioEntityId>();
ResourceId fundConfigurationId = new ResourceId();
@javax.annotation.Nullable List<String> shareClassInstrumentScopes = new List<String>();
@javax.annotation.Nullable List<InstrumentResolutionDetail> shareClassInstruments = new List<InstrumentResolutionDetail>();
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String taxTransparency = "example taxTransparency";
OffsetDateTime inceptionDate = OffsetDateTime.now();
@javax.annotation.Nullable Integer decimalPlaces = new Integer("100.00");
NavTypeDefinition primaryNavType = new NavTypeDefinition();
@javax.annotation.Nullable List<NavTypeDefinition> additionalNavTypes = new List<NavTypeDefinition>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Boolean createInstrument = true;
@javax.annotation.Nullable List<ShareClassDefinition> shareClasses = new List<ShareClassDefinition>();


FundDefinitionRequest fundDefinitionRequestInstance = new FundDefinitionRequest()
    .code(code)
    .shortCode(shortCode)
    .displayName(displayName)
    .description(description)
    .baseCurrency(baseCurrency)
    .investorStructure(investorStructure)
    .portfolioIds(portfolioIds)
    .fundConfigurationId(fundConfigurationId)
    .shareClassInstrumentScopes(shareClassInstrumentScopes)
    .shareClassInstruments(shareClassInstruments)
    .type(type)
    .taxTransparency(taxTransparency)
    .inceptionDate(inceptionDate)
    .decimalPlaces(decimalPlaces)
    .primaryNavType(primaryNavType)
    .additionalNavTypes(additionalNavTypes)
    .properties(properties)
    .createInstrument(createInstrument)
    .shareClasses(shareClasses);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)