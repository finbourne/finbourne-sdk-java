# com.finbourne.sdk.services.access.model.PolicyTemplatedSelector
classname PolicyTemplatedSelector
Templated selector for a policy template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** | The application that this selector definition applies to | [default to String]
**tag** | **String** | The type of policy that this selector definition applies to | [default to String]
**selector** | [**SelectorDefinition**](SelectorDefinition.md) |  | [default to SelectorDefinition]

```java
import com.finbourne.sdk.services.access.model.PolicyTemplatedSelector;
import java.util.*;
import java.lang.System;
import java.net.URI;

String application = "example application";
String tag = "example tag";
SelectorDefinition selector = new SelectorDefinition();


PolicyTemplatedSelector policyTemplatedSelectorInstance = new PolicyTemplatedSelector()
    .application(application)
    .tag(tag)
    .selector(selector);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)