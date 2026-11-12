# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3DescribeResponse
classname ComplianceRuleV3DescribeResponse
A plain-English description of a V3 compliance rule. This is a minimal placeholder shape: the plain-English  generator is delivered separately, so the Lines property is currently empty and only the rule's identity  and subject are populated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**subject** | **String** | Available values: Holdings, Orders. | [optional] [default to String]
**lines** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3DescribeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String subject = "example subject";
@javax.annotation.Nullable List<String> lines = new List<String>();


ComplianceRuleV3DescribeResponse complianceRuleV3DescribeResponseInstance = new ComplianceRuleV3DescribeResponse()
    .id(id)
    .subject(subject)
    .lines(lines);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)