# com.finbourne.sdk.services.lusid.model.ComplianceTemplateVariation
classname ComplianceTemplateVariation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | Label of a Compliance Template Variation | [default to String]
**description** | **String** | The description of the Compliance Template Variation | [default to String]
**requiredParameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | A parameter required by a Compliance Template Variation | [default to List<ComplianceTemplateParameter>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties associated with the Compliance Template Variation | [default to Map<String, PerpetualProperty>]
**acceptedAddressKeys** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**steps** | [**List&lt;ComplianceStep&gt;**](ComplianceStep.md) | The steps expressed in this template, with their required parameters | [default to List<ComplianceStep>]
**referencedGroupLabel** | **String** | The label of a given referenced group in a Compliance Rule Template Variation | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceTemplateVariation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String label = "example label";
String description = "example description";
List<ComplianceTemplateParameter> requiredParameters = new List<ComplianceTemplateParameter>();
Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
ResourceId acceptedAddressKeys = new ResourceId();
List<ComplianceStep> steps = new List<ComplianceStep>();
@javax.annotation.Nullable String referencedGroupLabel = "example referencedGroupLabel";


ComplianceTemplateVariation complianceTemplateVariationInstance = new ComplianceTemplateVariation()
    .label(label)
    .description(description)
    .requiredParameters(requiredParameters)
    .properties(properties)
    .acceptedAddressKeys(acceptedAddressKeys)
    .steps(steps)
    .referencedGroupLabel(referencedGroupLabel);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)