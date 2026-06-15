# com.finbourne.sdk.services.access.model.PolicyTemplateCreationRequest
classname PolicyTemplateCreationRequest
Request to create a policy template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The Code of the policy template being created | [default to String]
**displayName** | **String** | The display name of the policy template being created | [default to String]
**description** | **String** | Description of the policy template being craeted | [default to String]
**templatedSelectors** | [**List&lt;PolicyTemplatedSelector&gt;**](PolicyTemplatedSelector.md) | The selector definitions of policies included in this policy template | [default to List<PolicyTemplatedSelector>]

```java
import com.finbourne.sdk.services.access.model.PolicyTemplateCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
String description = "example description";
List<PolicyTemplatedSelector> templatedSelectors = new List<PolicyTemplatedSelector>();


PolicyTemplateCreationRequest policyTemplateCreationRequestInstance = new PolicyTemplateCreationRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .templatedSelectors(templatedSelectors);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)