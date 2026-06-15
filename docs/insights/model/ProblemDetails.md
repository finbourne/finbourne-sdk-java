# com.finbourne.sdk.services.insights.model.ProblemDetails
classname ProblemDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**title** | **String** |  | [optional] [default to String]
**status** | **Integer** |  | [optional] [default to Integer]
**detail** | **String** |  | [optional] [default to String]
**instance** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.insights.model.ProblemDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String title = "example title";
@javax.annotation.Nullable Integer status = new Integer("100.00");
@javax.annotation.Nullable String detail = "example detail";
@javax.annotation.Nullable String instance = "example instance";


ProblemDetails problemDetailsInstance = new ProblemDetails()
    .type(type)
    .title(title)
    .status(status)
    .detail(detail)
    .instance(instance);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)