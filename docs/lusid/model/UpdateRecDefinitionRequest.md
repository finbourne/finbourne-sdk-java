# com.finbourne.sdk.services.lusid.model.UpdateRecDefinitionRequest
classname UpdateRecDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the rec definition. | [default to String]
**description** | **String** | A description of the rec definition. | [optional] [default to String]
**sideNames** | [**RecDefSideNames**](RecDefSideNames.md) |  | [optional] [default to RecDefSideNames]
**details** | [**RecDefinitionDetails**](RecDefinitionDetails.md) |  | [default to RecDefinitionDetails]
**reviewConfiguration** | [**RecReviewConfiguration**](RecReviewConfiguration.md) |  | [optional] [default to RecReviewConfiguration]
**datePolicy** | [**RecDatePolicy**](RecDatePolicy.md) |  | [optional] [default to RecDatePolicy]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecDefinition domain. On update, a property with a null value is deleted and omitted properties are left unchanged. Filterable and sortable. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateRecDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
RecDefSideNames sideNames = new RecDefSideNames();
RecDefinitionDetails details = new RecDefinitionDetails();
RecReviewConfiguration reviewConfiguration = new RecReviewConfiguration();
RecDatePolicy datePolicy = new RecDatePolicy();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


UpdateRecDefinitionRequest updateRecDefinitionRequestInstance = new UpdateRecDefinitionRequest()
    .displayName(displayName)
    .description(description)
    .sideNames(sideNames)
    .details(details)
    .reviewConfiguration(reviewConfiguration)
    .datePolicy(datePolicy)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)