# com.finbourne.sdk.services.lusid.model.PackAccount
classname PackAccount
An account on a partnership configuration pack's chart of accounts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The account code. | [default to String]
**name** | **String** | The account name. | [default to String]
**type** | **String** | The account type: Asset, Liability, Capital, Income or Expense. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PackAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String name = "example name";
String type = "example type";


PackAccount packAccountInstance = new PackAccount()
    .code(code)
    .name(name)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)