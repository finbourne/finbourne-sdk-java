# com.finbourne.sdk.services.lusid.model.ResponseMetaData
classname ResponseMetaData
Metadata related to an api response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of meta data information being provided | [optional] [default to String]
**description** | **String** | The description of what occurred for this specific piece of meta data | [optional] [default to String]
**identifierType** | **String** | The type of the listed identifiers | [optional] [default to String]
**identifiers** | **List&lt;String&gt;** | The related identifiers that were impacted by this event | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ResponseMetaData;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String identifierType = "example identifierType";
@javax.annotation.Nullable List<String> identifiers = new List<String>();


ResponseMetaData responseMetaDataInstance = new ResponseMetaData()
    .type(type)
    .description(description)
    .identifierType(identifierType)
    .identifiers(identifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)