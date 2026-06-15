# com.finbourne.sdk.services.lusid.model.ReconcileStringRule
classname ReconcileStringRule
Comparison of string values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleType** | **String** | Available values: ReconcileNumericRule, ReconcileDateTimeRule, ReconcileStringRule, ReconcileExact. | [default to String]
**comparisonType** | **String** | Available values: Exact, Contains, CaseInsensitive, ContainsAnyCase, IsOneOf, IsOneOfCaseInsensitive. | [default to String]
**oneOfCandidates** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | For cases of \&quot;IsOneOf\&quot; or \&quot;IsOneOfCaseInsensitive\&quot;, a mapping from the left hand to side to lists of  equivalent alternative values on the right hand side.  Fuzzy matching of strings against one of a set. There can be cases where systems \&quot;A\&quot; and \&quot;B\&quot; might use different terms for the same logical entity. A common case would be  comparison of something like a day count fraction where some convention like the \&quot;actual 365\&quot; convention might be represented as one of [\&quot;A365\&quot;, \&quot;Act365\&quot;, \&quot;Actual365\&quot;] or similar.  This is to allow this kind of fuzzy matching of values. Note that as this is exhaustive comparison across sets it will be slow and should therefore be used sparingly. | [optional] [default to Map<String, List<String>>]
**appliesTo** | [**AggregateSpec**](AggregateSpec.md) |  | [default to AggregateSpec]

```java
import com.finbourne.sdk.services.lusid.model.ReconcileStringRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String comparisonType = "example comparisonType";
@javax.annotation.Nullable Map<String, List<String>> oneOfCandidates = new Map<String, List<String>>();
AggregateSpec appliesTo = new AggregateSpec();


ReconcileStringRule reconcileStringRuleInstance = new ReconcileStringRule()
    .comparisonType(comparisonType)
    .oneOfCandidates(oneOfCandidates)
    .appliesTo(appliesTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)