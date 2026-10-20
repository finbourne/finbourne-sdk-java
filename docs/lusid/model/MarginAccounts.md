# com.finbourne.sdk.services.lusid.model.MarginAccounts
classname MarginAccounts
The custodian account each party's collateral is held in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wePost** | **String** | The code of the custodian account, within each applicable portfolio, that holds collateral we post. Empty means collateral we post is not held in a custodian account the item knows of. | [optional] [default to String]
**theyPost** | **String** | The code of the custodian account, within each applicable portfolio, that holds collateral the counterparty posts. Empty means collateral they post is not held in a custodian account the item knows of. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarginAccounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String wePost = "example wePost";
@javax.annotation.Nullable String theyPost = "example theyPost";


MarginAccounts marginAccountsInstance = new MarginAccounts()
    .wePost(wePost)
    .theyPost(theyPost);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)