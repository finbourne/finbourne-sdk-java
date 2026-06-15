# com.finbourne.sdk.services.configuration.model.PersonalAccessToken
classname PersonalAccessToken
Representation of a Personal Access Token under a Configuration Item format.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Value of the Personal Access Token. | [readonly] [default to String]
**type** | **String** | The type of the Personal Access Token. | [readonly] [default to String]
**description** | **String** | The description of the Personal Access Token. | [readonly] [default to String]
**ref** | **String** | The reference to the Personal Access Token | [readonly] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.configuration.model.PersonalAccessToken;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";
String type = "example type";
String description = "example description";
String ref = "example ref";
@javax.annotation.Nullable List<Link> links = new List<Link>();


PersonalAccessToken personalAccessTokenInstance = new PersonalAccessToken()
    .value(value)
    .type(type)
    .description(description)
    .ref(ref)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)