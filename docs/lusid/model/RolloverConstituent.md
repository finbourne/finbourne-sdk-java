# com.finbourne.sdk.services.lusid.model.RolloverConstituent
classname RolloverConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]
**balanceChange** | **java.math.BigDecimal** | Balance of the new contract holding. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.RolloverConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

ContractDetails contractDetails = new ContractDetails();
java.math.BigDecimal balanceChange = new java.math.BigDecimal("100.00");


RolloverConstituent rolloverConstituentInstance = new RolloverConstituent()
    .contractDetails(contractDetails)
    .balanceChange(balanceChange);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)