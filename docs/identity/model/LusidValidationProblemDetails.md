# com.finbourne.sdk.services.identity.model.LusidValidationProblemDetails
classname LusidValidationProblemDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**errorDetails** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) |  | [optional] [default to List<Map<String, String>>]
**code** | **Integer** |  | [default to Integer]
**errors** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  | [optional] [default to Map<String, List<String>>]
**type** | **String** |  | [optional] [default to String]
**title** | **String** |  | [optional] [default to String]
**status** | **Integer** |  | [optional] [default to Integer]
**detail** | **String** |  | [optional] [default to String]
**instance** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.LusidValidationProblemDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable List<Map<String, String>> errorDetails = new List<Map<String, String>>();
Integer code = new Integer("100.00");
@javax.annotation.Nullable Map<String, List<String>> errors = new Map<String, List<String>>();
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String title = "example title";
@javax.annotation.Nullable Integer status = new Integer("100.00");
@javax.annotation.Nullable String detail = "example detail";
@javax.annotation.Nullable String instance = "example instance";


LusidValidationProblemDetails lusidValidationProblemDetailsInstance = new LusidValidationProblemDetails()
    .name(name)
    .errorDetails(errorDetails)
    .code(code)
    .errors(errors)
    .type(type)
    .title(title)
    .status(status)
    .detail(detail)
    .instance(instance);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)