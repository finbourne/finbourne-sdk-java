# com.finbourne.sdk.services.lusid.model.ComplianceTemplateVariationDto
classname ComplianceTemplateVariationDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**outcomeDescription** | **String** |  | [optional] [default to String]
**referencedGroupLabel** | **String** |  | [optional] [default to String]
**steps** | [**List&lt;ComplianceStep&gt;**](ComplianceStep.md) |  | [default to List<ComplianceStep>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceTemplateVariationDto;
import java.util.*;
import java.lang.System;
import java.net.URI;

String label = "example label";
String description = "example description";
@javax.annotation.Nullable String outcomeDescription = "example outcomeDescription";
@javax.annotation.Nullable String referencedGroupLabel = "example referencedGroupLabel";
List<ComplianceStep> steps = new List<ComplianceStep>();


ComplianceTemplateVariationDto complianceTemplateVariationDtoInstance = new ComplianceTemplateVariationDto()
    .label(label)
    .description(description)
    .outcomeDescription(outcomeDescription)
    .referencedGroupLabel(referencedGroupLabel)
    .steps(steps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)