# com.finbourne.sdk.services.access.model.EvaluationResponse
classname EvaluationResponse
The result of an evaluation request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**EvaluationResult**](EvaluationResult.md) |  | [default to EvaluationResult]
**detailedMessage** | **String** | In the case of the evaluation being denied a message may be returned | [optional] [default to String]

```java
import com.finbourne.sdk.services.access.model.EvaluationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

EvaluationResult @javax.annotation.Nullable String detailedMessage = "example detailedMessage";


EvaluationResponse evaluationResponseInstance = new EvaluationResponse()
    .result(result)
    .detailedMessage(detailedMessage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)