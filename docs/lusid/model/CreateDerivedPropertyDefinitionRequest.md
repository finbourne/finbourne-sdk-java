# com.finbourne.sdk.services.lusid.model.CreateDerivedPropertyDefinitionRequest
classname CreateDerivedPropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | The domain that the property exists in. Not all available values are currently supported, please check the documentation: https://support.lusid.com/knowledgebase/article/KA-01719/. Available values: Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, PortfolioGroup, Person, Order, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, TaskDefinition, Workflow, IdentifierDefinition, SettlementInstruction, TransactionFeeType, PaymentInstruction. | [default to String]
**scope** | **String** | The scope that the property exists in. | [default to String]
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. | [default to String]
**displayName** | **String** | The display name of the property. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. | [default to String]
**isFilterable** | **Boolean** | Bool indicating whether the values of this property are fitlerable, this is true for all non-derived property defintions.  For a derived definition this must be set true to enable filtering. | [default to Boolean]
**valueFormat** | **String** | The format in which values for this property definition should be represented. Available values: Text, Html. | [optional] [default to String]
**customEntityType** | **String** | The custom entity type that this derived property definition can be applied to. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateDerivedPropertyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domain = "example domain";
String scope = "example scope";
String code = "example code";
String displayName = "example displayName";
ResourceId dataTypeId = new ResourceId();
@javax.annotation.Nullable String propertyDescription = "example propertyDescription";
String derivationFormula = "example derivationFormula";
Boolean isFilterable = true;
@javax.annotation.Nullable String valueFormat = "example valueFormat";
@javax.annotation.Nullable String customEntityType = "example customEntityType";


CreateDerivedPropertyDefinitionRequest createDerivedPropertyDefinitionRequestInstance = new CreateDerivedPropertyDefinitionRequest()
    .domain(domain)
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .dataTypeId(dataTypeId)
    .propertyDescription(propertyDescription)
    .derivationFormula(derivationFormula)
    .isFilterable(isFilterable)
    .valueFormat(valueFormat)
    .customEntityType(customEntityType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)