# com.finbourne.sdk.services.lusid.model.RecResultDecisionUpdate
classname RecResultDecisionUpdate
The decision update within a batch review item. Omitting the object leaves the existing decision  untouched; a null value nullifies it (dissolving any group).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The decision value. Null nullifies the decision. Available values: Acknowledge, FixAtSource, FixAsGroup, Accept, ForceMatch, Tolerate. | [optional] [default to String]
**affirm** | **Boolean** | Whether to affirm an existing decision (e.g. after revisions were requested). | [optional] [default to Boolean]
**coreRulesExcused** | **List&lt;String&gt;** | The ruleNames of the core rules excused by a ForceMatch. Identical on every group member; non-null only for ForceMatch. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultDecisionUpdate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String value = "example value";
Boolean affirm = true;
@javax.annotation.Nullable List<String> coreRulesExcused = new List<String>();


RecResultDecisionUpdate recResultDecisionUpdateInstance = new RecResultDecisionUpdate()
    .value(value)
    .affirm(affirm)
    .coreRulesExcused(coreRulesExcused);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)