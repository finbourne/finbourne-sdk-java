# com.finbourne.sdk.services.access.model.TemplateMetadata
classname TemplateMetadata
Extra policy template metadata information, used during a generation request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateSelection** | [**List&lt;TemplateSelection&gt;**](TemplateSelection.md) | List of policy templates used for a generation request | [optional] [default to List<TemplateSelection>]
**buildAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | Policy template build AsAt time used for a generation request | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.access.model.TemplateMetadata;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<TemplateSelection> templateSelection = new List<TemplateSelection>();
OffsetDateTime buildAsAt = OffsetDateTime.now();


TemplateMetadata templateMetadataInstance = new TemplateMetadata()
    .templateSelection(templateSelection)
    .buildAsAt(buildAsAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)