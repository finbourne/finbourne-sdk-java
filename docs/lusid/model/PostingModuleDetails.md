# com.finbourne.sdk.services.lusid.model.PostingModuleDetails
classname PostingModuleDetails
A posting Module request definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Posting Module. | [default to String]
**description** | **String** | A description for the Posting Module. | [optional] [default to String]
**status** | **String** | The Posting Module status. Default value: Active. Available values: Active, Inactive. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PostingModuleDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String status = "example status";


PostingModuleDetails postingModuleDetailsInstance = new PostingModuleDetails()
    .displayName(displayName)
    .description(description)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)