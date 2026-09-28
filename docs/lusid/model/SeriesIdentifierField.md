# com.finbourne.sdk.services.lusid.model.SeriesIdentifierField
classname SeriesIdentifierField
A series identifier field, carrying the same fields as the CreateSeriesIdentifierField that asks for one, so  that a caller reads back what they wrote. The field category is not among them, because every field of this  shape is a series identifier; nor is a required flag, which is not the caller's to set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The unique identifier for the field within the dataset. | [default to String]
**displayName** | **String** | A user-friendly display name for the field. | [optional] [default to String]
**description** | **String** | A detailed description of the field and its purpose. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.SeriesIdentifierField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fieldName = "example fieldName";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId dataTypeId = new ResourceId();


SeriesIdentifierField seriesIdentifierFieldInstance = new SeriesIdentifierField()
    .fieldName(fieldName)
    .displayName(displayName)
    .description(description)
    .dataTypeId(dataTypeId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)