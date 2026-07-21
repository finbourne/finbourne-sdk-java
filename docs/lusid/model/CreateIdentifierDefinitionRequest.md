# com.finbourne.sdk.services.lusid.model.CreateIdentifierDefinitionRequest
classname CreateIdentifierDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | The type of entity to which the identifier can be attached. Available values: Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, PortfolioGroup, Person, Order, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, TaskDefinition, Workflow, IdentifierDefinition, SettlementInstruction, TransactionFeeType, PaymentInstruction. | [default to String]
**identifierScope** | **String** | The scope that the identifier definition exists in. | [default to String]
**identifierType** | **String** | What the identifier represents. Together with \&quot;domain\&quot; and \&quot;identifierScope\&quot; this uniquely identifies the identifier definition. | [default to String]
**lifeTime** | **String** | Describes whether an identifier value is associated with an entity for all effective dates or applies within a specified effective date range. Available values: Perpetual, TimeVariant. | [default to String]
**hierarchyUsage** | **String** | MasterIdentifier (aka unique)  An entity can have one value for this identifier definition on a given effective date.  A value for this identifier definition can only be associated with one entity (in a given scope) on a given effective date.  ParentIdentifier (aka non-unique)  An entity can have one value for this identifier definition on a given effective date.  A value for this identifier definition can be associated with many entities (in a given scope) on a given effective date.  Default value: MasterIdentifier. Available values: MasterIdentifier, ParentIdentifier. | [optional] [default to String]
**hierarchyLevel** | **String** | Optional metadata associated with the identifier definition. | [optional] [default to String]
**displayName** | **String** | A display name for the identifier. E.g. Figi. | [optional] [default to String]
**description** | **String** | An optional description for the identifier. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the identifier definition. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.CreateIdentifierDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domain = "example domain";
String identifierScope = "example identifierScope";
String identifierType = "example identifierType";
String lifeTime = "example lifeTime";
@javax.annotation.Nullable String hierarchyUsage = "example hierarchyUsage";
@javax.annotation.Nullable String hierarchyLevel = "example hierarchyLevel";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


CreateIdentifierDefinitionRequest createIdentifierDefinitionRequestInstance = new CreateIdentifierDefinitionRequest()
    .domain(domain)
    .identifierScope(identifierScope)
    .identifierType(identifierType)
    .lifeTime(lifeTime)
    .hierarchyUsage(hierarchyUsage)
    .hierarchyLevel(hierarchyLevel)
    .displayName(displayName)
    .description(description)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)