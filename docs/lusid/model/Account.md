# com.finbourne.sdk.services.lusid.model.Account
classname Account
An account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Account. | [default to String]
**description** | **String** | A description for the Account. | [optional] [default to String]
**type** | **String** | The Account type. Available values: Asset, Liabilities, Income, Expense, Capital, Revenue. | [default to String]
**status** | **String** | The Account status. Available values: Active, Inactive, Deleted. | [default to String]
**control** | **String** | This allows users to specify whether this a protected Account that prevents direct manual journal adjustment. Default value: Manual. Available values: Manual, System. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Account. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.Account;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String description = "example description";
String type = "example type";
String status = "example status";
@javax.annotation.Nullable String control = "example control";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


Account accountInstance = new Account()
    .code(code)
    .description(description)
    .type(type)
    .status(status)
    .control(control)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)