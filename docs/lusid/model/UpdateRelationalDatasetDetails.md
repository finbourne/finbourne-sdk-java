# com.finbourne.sdk.services.lusid.model.UpdateRelationalDatasetDetails
classname UpdateRelationalDatasetDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A user-friendly display name for the relational dataset definition. | [default to String]
**description** | **String** | A detailed description of the relational dataset definition and its purpose. | [optional] [default to String]
**applicableEntityTypes** | [**ApplicableEntityTypes**](ApplicableEntityTypes.md) |  | [optional] [default to ApplicableEntityTypes]

```java
import com.finbourne.sdk.services.lusid.model.UpdateRelationalDatasetDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ApplicableEntityTypes applicableEntityTypes = new ApplicableEntityTypes();


UpdateRelationalDatasetDetails updateRelationalDatasetDetailsInstance = new UpdateRelationalDatasetDetails()
    .displayName(displayName)
    .description(description)
    .applicableEntityTypes(applicableEntityTypes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)