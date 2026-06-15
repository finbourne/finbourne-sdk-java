# com.finbourne.sdk.services.lusid.model.UpdateCutLabelDefinitionRequest
classname UpdateCutLabelDefinitionRequest
This request specifies a new Cut Label Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]
**cutLocalTime** | [**CutLocalTime**](CutLocalTime.md) |  | [default to CutLocalTime]
**timeZone** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdateCutLabelDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
CutLocalTime cutLocalTime = new CutLocalTime();
String timeZone = "example timeZone";


UpdateCutLabelDefinitionRequest updateCutLabelDefinitionRequestInstance = new UpdateCutLabelDefinitionRequest()
    .displayName(displayName)
    .description(description)
    .cutLocalTime(cutLocalTime)
    .timeZone(timeZone);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)