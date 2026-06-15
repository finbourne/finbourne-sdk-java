# com.finbourne.sdk.services.lusid.model.ReconciliationLine
classname ReconciliationLine
In evaluating a left and right hand side holding or valuation set, two data records result. These are then compared based on a set of  rules. This results in either a match or failure to match. If there is a match both left and right will be present, otherwise one will not.  A difference will be present if a match was calculated.  The options used in comparison may result in elision of results where an exact or tolerable match is made.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **Map&lt;String, Object&gt;** | Left hand side of the comparison | [optional] [default to Map<String, Object>]
**right** | **Map&lt;String, Object&gt;** | Right hand side of the comparison | [optional] [default to Map<String, Object>]
**difference** | **Map&lt;String, Object&gt;** | Difference between LHS and RHS of comparison | [optional] [default to Map<String, Object>]
**resultComparison** | **Map&lt;String, Object&gt;** | The logical or semantic description of the difference, e.g. \&quot;Matches\&quot; or \&quot;MatchesWithTolerance\&quot; or \&quot;Failed\&quot;. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.lusid.model.ReconciliationLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, Object> left = new Map<String, Object>();
@javax.annotation.Nullable Map<String, Object> right = new Map<String, Object>();
@javax.annotation.Nullable Map<String, Object> difference = new Map<String, Object>();
@javax.annotation.Nullable Map<String, Object> resultComparison = new Map<String, Object>();


ReconciliationLine reconciliationLineInstance = new ReconciliationLine()
    .left(left)
    .right(right)
    .difference(difference)
    .resultComparison(resultComparison);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)