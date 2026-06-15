# com.finbourne.sdk.services.lusid.model.Instrument
classname Instrument
A list of instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**scope** | **String** | The scope in which the instrument lies. | [optional] [default to String]
**lusidInstrumentId** | **String** | The unique LUSID Instrument Identifier (LUID) of the instrument. | [default to String]
**version** | [**Version**](Version.md) |  | [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**name** | **String** | The name of the instrument. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The set of identifiers that can be used to identify the instrument. | [default to Map<String, String>]
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested instrument properties. These will be from the &#39;Instrument&#39; domain. | [optional] [default to List<Property>]
**lookthroughPortfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentDefinition** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**state** | **String** | The state of of the instrument at the asAt datetime of this version of the instrument definition. Available values: Active, Inactive, Deleted. | [default to String]
**assetClass** | **String** | The nominal asset class of the instrument. Available values: InterestRates, FX, Inflation, Equities, Credit, Commodities, Money, Unknown. | [optional] [default to String]
**domCcy** | **String** | The domestic currency, meaning the currency in which the instrument would typically be expected to pay cashflows, e.g. a share in AAPL being USD. | [optional] [default to String]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the instrument. | [optional] [default to List<Relationship>]
**settlementCycle** | [**SettlementCycle**](SettlementCycle.md) |  | [optional] [default to SettlementCycle]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Instrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String scope = "example scope";
String lusidInstrumentId = "example lusidInstrumentId";
Version version = new Version();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
String name = "example name";
Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable List<Property> properties = new List<Property>();
ResourceId lookthroughPortfolio = new ResourceId();
LusidInstrument instrumentDefinition = new LusidInstrument();
String state = "example state";
String assetClass = "example assetClass";
@javax.annotation.Nullable String domCcy = "example domCcy";
@javax.annotation.Nullable List<Relationship> relationships = new List<Relationship>();
SettlementCycle settlementCycle = new SettlementCycle();
DataModelMembership dataModelMembership = new DataModelMembership();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Instrument instrumentInstance = new Instrument()
    .href(href)
    .scope(scope)
    .lusidInstrumentId(lusidInstrumentId)
    .version(version)
    .stagedModifications(stagedModifications)
    .name(name)
    .identifiers(identifiers)
    .properties(properties)
    .lookthroughPortfolio(lookthroughPortfolio)
    .instrumentDefinition(instrumentDefinition)
    .state(state)
    .assetClass(assetClass)
    .domCcy(domCcy)
    .relationships(relationships)
    .settlementCycle(settlementCycle)
    .dataModelMembership(dataModelMembership)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)