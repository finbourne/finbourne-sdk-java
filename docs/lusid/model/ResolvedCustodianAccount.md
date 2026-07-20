# com.finbourne.sdk.services.lusid.model.ResolvedCustodianAccount
classname ResolvedCustodianAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountSelector** | **String** | Available values: From, To. | [optional] [default to String]
**custodianAccount** | [**CustodianAccount**](CustodianAccount.md) |  | [default to CustodianAccount]
**resolutionType** | **String** | Available values: BookingEntry, ContextCustodian, RelatedAccount, PortfolioDefault. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResolvedCustodianAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String accountSelector = "example accountSelector";
CustodianAccount custodianAccount = new CustodianAccount();
String resolutionType = "example resolutionType";


ResolvedCustodianAccount resolvedCustodianAccountInstance = new ResolvedCustodianAccount()
    .accountSelector(accountSelector)
    .custodianAccount(custodianAccount)
    .resolutionType(resolutionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)