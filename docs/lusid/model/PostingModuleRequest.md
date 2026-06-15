# com.finbourne.sdk.services.lusid.model.PostingModuleRequest
classname PostingModuleRequest
A Posting Module request definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Posting Module. | [default to String]
**displayName** | **String** | The name of the Posting Module. | [default to String]
**description** | **String** | A description for the Posting Module. | [optional] [default to String]
**rules** | [**List&lt;PostingModuleRule&gt;**](PostingModuleRule.md) | The Posting Rules that apply for the Posting Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<PostingModuleRule>]

```java
import com.finbourne.sdk.services.lusid.model.PostingModuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<PostingModuleRule> rules = new List<PostingModuleRule>();


PostingModuleRequest postingModuleRequestInstance = new PostingModuleRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)