# com.finbourne.sdk.services.lusid.model.RevaluationProblem
classname RevaluationProblem
A reason why a revaluation amount could not be populated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | A machine-readable code identifying the type of problem (e.g. MissingFxRate, MissingBookedFxRate). | [optional] [default to String]
**message** | **String** | A human-readable description of why the revaluation amount could not be populated. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RevaluationProblem;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String message = "example message";


RevaluationProblem revaluationProblemInstance = new RevaluationProblem()
    .code(code)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)