# com.finbourne.sdk.services.lusid.model.CreatePropertyDefinitionRequest
classname CreatePropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | The domain that the property exists in. Available values: Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, PortfolioGroup, Person, Order, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, TaskDefinition, Workflow, IdentifierDefinition, SettlementInstruction, TransactionFeeType. | [default to String]
**scope** | **String** | The scope that the property exists in. | [default to String]
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. | [default to String]
**valueRequired** | **Boolean** | This field is not implemented and should be disregarded. | [optional] [default to Boolean]
**displayName** | **String** | The display name of the property. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**lifeTime** | **String** | Describes how the property&#39;s values can change over time. Available values: Perpetual, TimeVariant. | [optional] [default to String]
**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. Defaults to \&quot;Property\&quot; if not specified. Valid values for this field are: Property, Collection or Identifier. | [optional] [default to String]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**collectionType** | **String** | Describes whether a collection property should behave as a Set or as an Array. Available values: Set, Array. | [optional] [default to String]
**customEntityTypes** | **List&lt;String&gt;** | The custom entity types that properties relating to this property definition can be applied to. | [optional] [default to List<String>]
**valueFormat** | **String** | The format in which values for this property definition should be represented. Available values: Text, Html. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreatePropertyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domain = "example domain";
String scope = "example scope";
String code = "example code";
Boolean valueRequired = true;
String displayName = "example displayName";
ResourceId dataTypeId = new ResourceId();
String lifeTime = "example lifeTime";
@javax.annotation.Nullable String constraintStyle = "example constraintStyle";
@javax.annotation.Nullable String propertyDescription = "example propertyDescription";
@javax.annotation.Nullable String collectionType = "example collectionType";
@javax.annotation.Nullable List<String> customEntityTypes = new List<String>();
@javax.annotation.Nullable String valueFormat = "example valueFormat";


CreatePropertyDefinitionRequest createPropertyDefinitionRequestInstance = new CreatePropertyDefinitionRequest()
    .domain(domain)
    .scope(scope)
    .code(code)
    .valueRequired(valueRequired)
    .displayName(displayName)
    .dataTypeId(dataTypeId)
    .lifeTime(lifeTime)
    .constraintStyle(constraintStyle)
    .propertyDescription(propertyDescription)
    .collectionType(collectionType)
    .customEntityTypes(customEntityTypes)
    .valueFormat(valueFormat);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)