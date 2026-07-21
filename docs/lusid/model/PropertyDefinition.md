# com.finbourne.sdk.services.lusid.model.PropertyDefinition
classname PropertyDefinition
A list of property definitions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**key** | **String** | The property key which uniquely identifies the property. The format for the property key is {domain}/{scope}/{code}, e.g. &#39;Portfolio/Manager/Id&#39;. | [optional] [default to String]
**valueType** | **String** | The type of values that can be associated with this property. This is defined by the property&#39;s data type. Available values: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText. | [optional] [default to String]
**displayName** | **String** | The display name of the property. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**type** | **String** | The type of the property. Available values: Label, Metric, Information. | [optional] [default to String]
**unitSchema** | **String** | The units that can be associated with the property&#39;s values. This is defined by the property&#39;s data type. Available values: NoUnits, Basic, Iso4217Currency. | [optional] [default to String]
**domain** | **String** | The domain that the property exists in. Available values: Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, PortfolioGroup, Person, Order, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, TaskDefinition, Workflow, IdentifierDefinition, SettlementInstruction, TransactionFeeType, PaymentInstruction. | [optional] [default to String]
**scope** | **String** | The scope that the property exists in. | [optional] [readonly] [default to String]
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. | [optional] [readonly] [default to String]
**valueRequired** | **Boolean** | This field is not implemented and should be disregarded. | [optional] [default to Boolean]
**lifeTime** | **String** | Describes how the property&#39;s values can change over time. Available values: Perpetual, TimeVariant. | [optional] [default to String]
**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. | [optional] [default to String]
**propertyDefinitionType** | **String** | The definition type. Available values: ValueProperty, DerivedDefinition. | [optional] [default to String]
**propertyDescription** | **String** | A brief description of what a property of this property definition contains. | [optional] [default to String]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. | [optional] [default to String]
**collectionType** | **String** | Describes whether a collection property should behave as a Set or as an Array. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Set of unique property definition properties and associated values to store with the property definition. Each property must be from the &#39;PropertyDefinition&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**isFilterable** | **Boolean** | Bool indicating whether the values of this property are fitlerable, this is true for all non-derived property defintions.  For a derived definition this must be set true to enable filtering. | [optional] [default to Boolean]
**customEntityTypes** | **List&lt;String&gt;** | The custom entity types that properties relating to this property definition can be applied to. | [optional] [default to List<String>]
**valueFormat** | **String** | The format in which values for this property definition should be represented. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PropertyDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String key = "example key";
String valueType = "example valueType";
@javax.annotation.Nullable String displayName = "example displayName";
ResourceId dataTypeId = new ResourceId();
String type = "example type";
String unitSchema = "example unitSchema";
String domain = "example domain";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String code = "example code";
Boolean valueRequired = true;
String lifeTime = "example lifeTime";
@javax.annotation.Nullable String constraintStyle = "example constraintStyle";
String propertyDefinitionType = "example propertyDefinitionType";
@javax.annotation.Nullable String propertyDescription = "example propertyDescription";
@javax.annotation.Nullable String derivationFormula = "example derivationFormula";
@javax.annotation.Nullable String collectionType = "example collectionType";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
Boolean isFilterable = true;
@javax.annotation.Nullable List<String> customEntityTypes = new List<String>();
@javax.annotation.Nullable String valueFormat = "example valueFormat";
@javax.annotation.Nullable List<Link> links = new List<Link>();


PropertyDefinition propertyDefinitionInstance = new PropertyDefinition()
    .href(href)
    .key(key)
    .valueType(valueType)
    .displayName(displayName)
    .dataTypeId(dataTypeId)
    .type(type)
    .unitSchema(unitSchema)
    .domain(domain)
    .scope(scope)
    .code(code)
    .valueRequired(valueRequired)
    .lifeTime(lifeTime)
    .constraintStyle(constraintStyle)
    .propertyDefinitionType(propertyDefinitionType)
    .propertyDescription(propertyDescription)
    .derivationFormula(derivationFormula)
    .collectionType(collectionType)
    .properties(properties)
    .version(version)
    .stagedModifications(stagedModifications)
    .isFilterable(isFilterable)
    .customEntityTypes(customEntityTypes)
    .valueFormat(valueFormat)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)