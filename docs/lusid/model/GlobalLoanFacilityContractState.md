# com.finbourne.sdk.services.lusid.model.GlobalLoanFacilityContractState
classname GlobalLoanFacilityContractState
The desired global state of a single FlexibleLoan contract. Balances are global - across all investors -  rather than investor specific.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]
**balance** | **java.math.BigDecimal** | The desired global balance for this contract, in the contract&#39;s own currency. Must be non-negative. | [default to java.math.BigDecimal]
**balanceInFacilityCcy** | **java.math.BigDecimal** | The desired global balance expressed in the facility currency. Required when the contract currency  differs from the facility currency, and defaults to Balance otherwise. | [optional] [default to java.math.BigDecimal]
**agencyFxRate** | **java.math.BigDecimal** | The agency FX rate converting contract currency to facility currency. Required when the contract  currency differs from the facility currency. When omitted it is derived from the two balances where  possible, and otherwise defaults to 1. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.GlobalLoanFacilityContractState;
import java.util.*;
import java.lang.System;
import java.net.URI;

ContractDetails contractDetails = new ContractDetails();
java.math.BigDecimal balance = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal balanceInFacilityCcy = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal agencyFxRate = new java.math.BigDecimal("100.00");


GlobalLoanFacilityContractState globalLoanFacilityContractStateInstance = new GlobalLoanFacilityContractState()
    .contractDetails(contractDetails)
    .balance(balance)
    .balanceInFacilityCcy(balanceInFacilityCcy)
    .agencyFxRate(agencyFxRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)