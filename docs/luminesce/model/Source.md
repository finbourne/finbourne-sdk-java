# com.finbourne.sdk.services.luminesce.model.Source
classname Source
Information leading to choosing the provider

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **String** | The source location.  Start of a provider name, &#x60;Drive&#x60;, &#x60;LocalFs&#x60;, &#x60;AwsS3&#x60; etc. | [optional] [default to String]
**type** | [**SourceType**](SourceType.md) |  | [optional] [default to SourceType]

```java
import com.finbourne.sdk.services.luminesce.model.Source;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String location = "example location";
SourceType 

Source sourceInstance = new Source()
    .location(location)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)