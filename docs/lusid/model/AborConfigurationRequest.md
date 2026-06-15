# com.finbourne.sdk.services.lusid.model.AborConfigurationRequest
classname AborConfigurationRequest
The request used to create an AborConfiguration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Abor Configuration. | [default to String]
**displayName** | **String** | The name of the Abor Configuration. | [optional] [default to String]
**description** | **String** | A description for the Abor Configuration. | [optional] [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**postingModuleCodes** | **List&lt;String&gt;** | The Posting Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**cleardownModuleCodes** | **List&lt;String&gt;** | The Cleardown Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor Configuration. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.AborConfigurationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId recipeId = new ResourceId();
ResourceId chartOfAccountsId = new ResourceId();
@javax.annotation.Nullable List<String> postingModuleCodes = new List<String>();
@javax.annotation.Nullable List<String> cleardownModuleCodes = new List<String>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


AborConfigurationRequest aborConfigurationRequestInstance = new AborConfigurationRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .recipeId(recipeId)
    .chartOfAccountsId(chartOfAccountsId)
    .postingModuleCodes(postingModuleCodes)
    .cleardownModuleCodes(cleardownModuleCodes)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)