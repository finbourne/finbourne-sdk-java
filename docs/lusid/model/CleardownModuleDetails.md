# com.finbourne.sdk.services.lusid.model.CleardownModuleDetails
classname CleardownModuleDetails
A Cleardown Module request definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Cleardown Module. | [default to String]
**description** | **String** | A description for the Cleardown Module. | [optional] [default to String]
**status** | **String** | The Cleardown Module status. Default value: Active. Available values: Active, Inactive. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CleardownModuleDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String status = "example status";


CleardownModuleDetails cleardownModuleDetailsInstance = new CleardownModuleDetails()
    .displayName(displayName)
    .description(description)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)