# com.finbourne.sdk.services.lusid.model.ChartOfAccountsRequest
classname ChartOfAccountsRequest
The request used to create a chart of account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Chart of Accounts. | [default to String]
**displayName** | **String** | The name of the Chart of Account. | [optional] [default to String]
**description** | **String** | A description of the Chart of Accounts. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Chart of Accounts. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.ChartOfAccountsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


ChartOfAccountsRequest chartOfAccountsRequestInstance = new ChartOfAccountsRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)