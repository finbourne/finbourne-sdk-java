# com.finbourne.sdk.services.lusid.model.TrialBalance
classname TrialBalance
A TrialBalance entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generalLedgerAccountCode** | **String** | The Account code that the trial balance results have been grouped against. | [default to String]
**description** | **String** | The description of the record. | [optional] [default to String]
**levels** | **List&lt;String&gt;** | The levels that have been derived from the specified General Ledger Profile. | [default to List<String>]
**accountType** | **String** | The account type attributed to the record. | [default to String]
**localCurrency** | **String** | The local currency for the amounts specified. Defaults to base currency if multiple different currencies present in the grouped line. | [default to String]
**opening** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  | [default to MultiCurrencyAmounts]
**closing** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  | [default to MultiCurrencyAmounts]
**debit** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  | [default to MultiCurrencyAmounts]
**credit** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  | [default to MultiCurrencyAmounts]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties found on the mapped &#39;Account&#39;, as specified in request. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TrialBalance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String generalLedgerAccountCode = "example generalLedgerAccountCode";
@javax.annotation.Nullable String description = "example description";
List<String> levels = new List<String>();
String accountType = "example accountType";
String localCurrency = "example localCurrency";
MultiCurrencyAmounts opening = new MultiCurrencyAmounts();
MultiCurrencyAmounts closing = new MultiCurrencyAmounts();
MultiCurrencyAmounts debit = new MultiCurrencyAmounts();
MultiCurrencyAmounts credit = new MultiCurrencyAmounts();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TrialBalance trialBalanceInstance = new TrialBalance()
    .generalLedgerAccountCode(generalLedgerAccountCode)
    .description(description)
    .levels(levels)
    .accountType(accountType)
    .localCurrency(localCurrency)
    .opening(opening)
    .closing(closing)
    .debit(debit)
    .credit(credit)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)