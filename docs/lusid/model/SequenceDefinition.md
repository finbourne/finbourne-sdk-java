# com.finbourne.sdk.services.lusid.model.SequenceDefinition
classname SequenceDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**increment** | **Long** | The Resource Id of the sequence definition | [default to Long]
**minValue** | **Long** | The minimum value of the sequence | [default to Long]
**maxValue** | **Long** | The maximum value of the sequence | [default to Long]
**start** | **Long** | The start value of the sequence | [default to Long]
**value** | **Long** | The last used value of the sequence | [optional] [default to Long]
**cycle** | **Boolean** | Indicates if the sequence would start from minimun value once it reaches maximum value. If set to false, a failure would return if the sequence reaches maximum value. | [default to Boolean]
**pattern** | **String** | The pattern to be used to generate next values in the sequence. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.SequenceDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
Long increment = new Long("100.00");
Long minValue = new Long("100.00");
Long maxValue = new Long("100.00");
Long start = new Long("100.00");
@javax.annotation.Nullable Long value = new Long("100.00");
Boolean cycle = true;
@javax.annotation.Nullable String pattern = "example pattern";
@javax.annotation.Nullable List<Link> links = new List<Link>();


SequenceDefinition sequenceDefinitionInstance = new SequenceDefinition()
    .id(id)
    .increment(increment)
    .minValue(minValue)
    .maxValue(maxValue)
    .start(start)
    .value(value)
    .cycle(cycle)
    .pattern(pattern)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)