# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3DescribeResponse
classname ComplianceRuleV3DescribeResponse
A plain-English description of a V3 compliance rule: its identity, the kind of entity it examines, and a  single sentence describing what it checks. The sentence is empty for a rule the generator cannot fully  express.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**subject** | **String** | Available values: Holdings, Orders. | [optional] [default to String]
**plainEnglish** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3DescribeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String subject = "example subject";
@javax.annotation.Nullable String plainEnglish = "example plainEnglish";


ComplianceRuleV3DescribeResponse complianceRuleV3DescribeResponseInstance = new ComplianceRuleV3DescribeResponse()
    .id(id)
    .subject(subject)
    .plainEnglish(plainEnglish);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)