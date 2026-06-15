# com.finbourne.sdk.services.lusid.model.ComplianceTemplateVariationRequest
classname ComplianceTemplateVariationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**outcomeDescription** | **String** |  | [optional] [default to String]
**referencedGroupLabel** | **String** |  | [optional] [default to String]
**steps** | [**List&lt;ComplianceStepRequest&gt;**](ComplianceStepRequest.md) |  | [default to List<ComplianceStepRequest>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceTemplateVariationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String label = "example label";
String description = "example description";
@javax.annotation.Nullable String outcomeDescription = "example outcomeDescription";
@javax.annotation.Nullable String referencedGroupLabel = "example referencedGroupLabel";
List<ComplianceStepRequest> steps = new List<ComplianceStepRequest>();


ComplianceTemplateVariationRequest complianceTemplateVariationRequestInstance = new ComplianceTemplateVariationRequest()
    .label(label)
    .description(description)
    .outcomeDescription(outcomeDescription)
    .referencedGroupLabel(referencedGroupLabel)
    .steps(steps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)