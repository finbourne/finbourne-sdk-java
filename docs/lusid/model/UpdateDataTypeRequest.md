# com.finbourne.sdk.services.lusid.model.UpdateDataTypeRequest
classname UpdateDataTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the data type. | [optional] [default to String]
**description** | **String** | The description of the data type. | [optional] [default to String]
**acceptableValues** | **List&lt;String&gt;** | The acceptable set of values for this data type. Only applies to &#39;open&#39; value type range. | [optional] [default to List<String>]
**acceptableUnits** | [**List&lt;UpdateUnitRequest&gt;**](UpdateUnitRequest.md) | The definitions of the acceptable units. | [optional] [default to List<UpdateUnitRequest>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateDataTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> acceptableValues = new List<String>();
@javax.annotation.Nullable List<UpdateUnitRequest> acceptableUnits = new List<UpdateUnitRequest>();


UpdateDataTypeRequest updateDataTypeRequestInstance = new UpdateDataTypeRequest()
    .displayName(displayName)
    .description(description)
    .acceptableValues(acceptableValues)
    .acceptableUnits(acceptableUnits);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)