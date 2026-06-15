# com.finbourne.sdk.services.lusid.model.CustodianAccount
classname CustodianAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**status** | **String** | The Account status. Available values: Active, Inactive, Deleted. | [default to String]
**accountNumber** | **String** | The Custodian Account Number | [default to String]
**accountName** | **String** | The identifiable name given to the Custodian Account | [default to String]
**accountingMethod** | **String** | The Accounting method to be used. Available values: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [default to String]
**currency** | **String** | The Currency for the Account | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Set of unique Custodian Account properties and associated values to store with the Custodian Account. Each property must be from the &#39;CustodianAccount&#39; domain. | [optional] [default to Map<String, Property>]
**custodian** | [**LegalEntity**](LegalEntity.md) |  | [default to LegalEntity]
**accountType** | **String** | The Type of the Custodian Account. Default value: Margin. Available values: Margin, Cash, Swap. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CustodianAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId custodianAccountId = new ResourceId();
String status = "example status";
String accountNumber = "example accountNumber";
String accountName = "example accountName";
String accountingMethod = "example accountingMethod";
String currency = "example currency";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
LegalEntity custodian = new LegalEntity();
String accountType = "example accountType";


CustodianAccount custodianAccountInstance = new CustodianAccount()
    .custodianAccountId(custodianAccountId)
    .status(status)
    .accountNumber(accountNumber)
    .accountName(accountName)
    .accountingMethod(accountingMethod)
    .currency(currency)
    .properties(properties)
    .custodian(custodian)
    .accountType(accountType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)