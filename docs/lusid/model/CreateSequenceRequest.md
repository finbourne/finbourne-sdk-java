# com.finbourne.sdk.services.lusid.model.CreateSequenceRequest
classname CreateSequenceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the sequence definition to create | [default to String]
**increment** | **Long** | The value to increment between each value in the sequence | [optional] [default to Long]
**minValue** | **Long** | The minimum value of the sequence | [optional] [default to Long]
**maxValue** | **Long** | The maximum value of the sequence | [optional] [default to Long]
**start** | **Long** | The start value of the sequence | [optional] [default to Long]
**cycle** | **Boolean** | Set to true to start the sequence over again when it reaches the end. Defaults to false if not provided. | [optional] [default to Boolean]
**pattern** | **String** | The pattern to be used to generate next values in the sequence. Defaults to null if not provided. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateSequenceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable Long increment = new Long("100.00");
@javax.annotation.Nullable Long minValue = new Long("100.00");
@javax.annotation.Nullable Long maxValue = new Long("100.00");
@javax.annotation.Nullable Long start = new Long("100.00");
Boolean cycle = true;
@javax.annotation.Nullable String pattern = "example pattern";


CreateSequenceRequest createSequenceRequestInstance = new CreateSequenceRequest()
    .code(code)
    .increment(increment)
    .minValue(minValue)
    .maxValue(maxValue)
    .start(start)
    .cycle(cycle)
    .pattern(pattern);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)