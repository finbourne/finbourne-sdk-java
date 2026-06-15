# com.finbourne.sdk.services.lusid.model.UpdateCheckDefinitionRequest
classname UpdateCheckDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Check Definition. | [default to String]
**description** | **String** | A description for the Check Definition. | [default to String]
**datasetSchema** | [**CheckDefinitionDatasetSchema**](CheckDefinitionDatasetSchema.md) |  | [optional] [default to CheckDefinitionDatasetSchema]
**ruleSets** | [**List&lt;UpdateCheckDefinitionRuleSet&gt;**](UpdateCheckDefinitionRuleSet.md) | A collection of rule sets for the Check Definition. | [default to List<UpdateCheckDefinitionRuleSet>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Check Definition. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateCheckDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
String description = "example description";
CheckDefinitionDatasetSchema datasetSchema = new CheckDefinitionDatasetSchema();
List<UpdateCheckDefinitionRuleSet> ruleSets = new List<UpdateCheckDefinitionRuleSet>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


UpdateCheckDefinitionRequest updateCheckDefinitionRequestInstance = new UpdateCheckDefinitionRequest()
    .displayName(displayName)
    .description(description)
    .datasetSchema(datasetSchema)
    .ruleSets(ruleSets)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)