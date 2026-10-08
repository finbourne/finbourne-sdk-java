# com.finbourne.sdk.services.lusid.model.TransactionEntityLink
classname TransactionEntityLink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | Available values: Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, PortfolioGroup, Person, Order, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, FundStructure, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, TaskDefinition, Workflow, IdentifierDefinition, SettlementInstruction, TransactionFeeType, PaymentInstruction, Transfer, RecDefinition, RecResult, JournalEntry. | [default to String]
**entityId** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**restrictEditing** | **Boolean** |  | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.TransactionEntityLink;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
Map<String, String> entityId = new Map<String, String>();
Boolean restrictEditing = true;


TransactionEntityLink transactionEntityLinkInstance = new TransactionEntityLink()
    .entityType(entityType)
    .entityId(entityId)
    .restrictEditing(restrictEditing);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)