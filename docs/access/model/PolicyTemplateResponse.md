# com.finbourne.sdk.services.access.model.PolicyTemplateResponse
classname PolicyTemplateResponse
Response object for a policy template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Display name of the policy template being created | [optional] [default to String]
**scope** | **String** | The Scope of the policy template being created | [optional] [default to String]
**code** | **String** | The Code of the policy template being created | [optional] [default to String]
**description** | **String** | Description of the policy template being created | [optional] [default to String]
**applications** | **List&lt;String&gt;** | List of applications that this policy template covers | [optional] [default to List<String>]
**tags** | **List&lt;String&gt;** | List of policy types that this policy template covers | [optional] [default to List<String>]
**templatedSelectors** | [**List&lt;PolicyTemplatedSelector&gt;**](PolicyTemplatedSelector.md) | The selector definitions of policies included in this policy template | [optional] [default to List<PolicyTemplatedSelector>]

```java
import com.finbourne.sdk.services.access.model.PolicyTemplateResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> applications = new List<String>();
@javax.annotation.Nullable List<String> tags = new List<String>();
@javax.annotation.Nullable List<PolicyTemplatedSelector> templatedSelectors = new List<PolicyTemplatedSelector>();


PolicyTemplateResponse policyTemplateResponseInstance = new PolicyTemplateResponse()
    .displayName(displayName)
    .scope(scope)
    .code(code)
    .description(description)
    .applications(applications)
    .tags(tags)
    .templatedSelectors(templatedSelectors);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)