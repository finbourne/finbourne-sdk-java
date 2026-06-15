# com.finbourne.sdk.services.lusid.model.CleardownModuleRequest
classname CleardownModuleRequest
A Cleardown Module request definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Cleardown Module. | [default to String]
**displayName** | **String** | The name of the Cleardown Module. | [default to String]
**description** | **String** | A description for the Cleardown Module. | [optional] [default to String]
**rules** | [**List&lt;CleardownModuleRule&gt;**](CleardownModuleRule.md) | The Cleardown Rules that apply for the Cleardown Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<CleardownModuleRule>]

```java
import com.finbourne.sdk.services.lusid.model.CleardownModuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<CleardownModuleRule> rules = new List<CleardownModuleRule>();


CleardownModuleRequest cleardownModuleRequestInstance = new CleardownModuleRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)