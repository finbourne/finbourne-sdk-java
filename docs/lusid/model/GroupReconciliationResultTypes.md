# com.finbourne.sdk.services.lusid.model.GroupReconciliationResultTypes
classname GroupReconciliationResultTypes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countMatch** | **Integer** | The number of comparison results of resultType \&quot;Match\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkMatches** | [**Link**](Link.md) |  | [default to Link]
**countPartialMatch** | **Integer** | The number of comparison results of resultType \&quot;PartialMatch\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkPartialMatches** | [**Link**](Link.md) |  | [default to Link]
**countBreak** | **Integer** | The number of comparison results of resultType \&quot;Break\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkBreaks** | [**Link**](Link.md) |  | [default to Link]
**countResolved** | **Integer** | The number of comparison results of resultType \&quot;Resolved\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkResolved** | [**Link**](Link.md) |  | [default to Link]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationResultTypes;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer countMatch = new Integer("100.00");
Link linkMatches = new Link();
Integer countPartialMatch = new Integer("100.00");
Link linkPartialMatches = new Link();
Integer countBreak = new Integer("100.00");
Link linkBreaks = new Link();
Integer countResolved = new Integer("100.00");
Link linkResolved = new Link();


GroupReconciliationResultTypes groupReconciliationResultTypesInstance = new GroupReconciliationResultTypes()
    .countMatch(countMatch)
    .linkMatches(linkMatches)
    .countPartialMatch(countPartialMatch)
    .linkPartialMatches(linkPartialMatches)
    .countBreak(countBreak)
    .linkBreaks(linkBreaks)
    .countResolved(countResolved)
    .linkResolved(linkResolved);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)