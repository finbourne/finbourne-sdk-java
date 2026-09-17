# com.finbourne.sdk.services.lusid.model.RecAsAtPolicy
classname RecAsAtPolicy
The knowledge-date policy of each side of a rec definition. Optional as a whole, defaulting to Latest on both  sides, but both sides are required when it is supplied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The left side&#39;s policy. Latest: the left asAt may not be supplied at instantiation, is stamped as the latest at run time and advances on re-run. Explicit: the left asAt is the caller&#39;s, defaulting to the current date-time, and is pinned on the instance. Available values: Latest, Explicit. | [default to String]
**right** | **String** | The right side&#39;s policy. Latest: the right asAt may not be supplied at instantiation, is stamped as the latest at run time and advances on re-run. Explicit: the right asAt is the caller&#39;s, defaulting to the current date-time, and is pinned on the instance. Available values: Latest, Explicit. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecAsAtPolicy;
import java.util.*;
import java.lang.System;
import java.net.URI;

String left = "example left";
String right = "example right";


RecAsAtPolicy recAsAtPolicyInstance = new RecAsAtPolicy()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)