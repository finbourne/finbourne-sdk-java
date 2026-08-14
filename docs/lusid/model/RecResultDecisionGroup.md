# com.finbourne.sdk.services.lusid.model.RecResultDecisionGroup
classname RecResultDecisionGroup
The group-decision detail carried on every member of a FixAsGroup or ForceMatch decision.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupNumber** | **Integer** | Server-allocated, monotonic group number, unique within the RecResultSet and never reused. | [default to Integer]
**coreRulesExcused** | **List&lt;String&gt;** | The ruleNames of the core rules excused by a ForceMatch. Identical on every group member; non-null only for ForceMatch. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultDecisionGroup;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer groupNumber = new Integer("100.00");
@javax.annotation.Nullable List<String> coreRulesExcused = new List<String>();


RecResultDecisionGroup recResultDecisionGroupInstance = new RecResultDecisionGroup()
    .groupNumber(groupNumber)
    .coreRulesExcused(coreRulesExcused);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)