# com.finbourne.sdk.services.lusid.model.SeriesDefinitionRequest
classname SeriesDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassCode** | **String** | The code of the Share Class this Series belongs to. | [default to String]
**seriesDefinitions** | [**List&lt;SeriesDefinition&gt;**](SeriesDefinition.md) | The definitions of the Series to add to the Share Class. | [default to List<SeriesDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.SeriesDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String shareClassCode = "example shareClassCode";
List<SeriesDefinition> seriesDefinitions = new List<SeriesDefinition>();


SeriesDefinitionRequest seriesDefinitionRequestInstance = new SeriesDefinitionRequest()
    .shareClassCode(shareClassCode)
    .seriesDefinitions(seriesDefinitions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)