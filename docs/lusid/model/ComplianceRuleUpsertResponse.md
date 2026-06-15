# com.finbourne.sdk.services.lusid.model.ComplianceRuleUpsertResponse
classname ComplianceRuleUpsertResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, ComplianceRule&gt;**](ComplianceRule.md) |  | [default to Map<String, ComplianceRule>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleUpsertResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ComplianceRule> values = new Map<String, ComplianceRule>();


ComplianceRuleUpsertResponse complianceRuleUpsertResponseInstance = new ComplianceRuleUpsertResponse()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)