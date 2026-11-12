# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3FilterNode
classname ComplianceRuleV3FilterNode
A node in a rule's filter tree: either a group combining child nodes with all/any, or a leaf condition.  The concrete kind is named by the FilterNodeType property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterNodeType** | **String** | Available values: ComplianceRuleV3FilterGroup, ComplianceRuleV3FilterCondition. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3FilterNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String filterNodeType = "example filterNodeType";


ComplianceRuleV3FilterNode complianceRuleV3FilterNodeInstance = new ComplianceRuleV3FilterNode()
    .filterNodeType(filterNodeType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)