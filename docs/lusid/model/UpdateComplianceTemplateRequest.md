# com.finbourne.sdk.services.lusid.model.UpdateComplianceTemplateRequest
classname UpdateComplianceTemplateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Compliance Template | [default to String]
**description** | **String** | The description of the Compliance Template | [default to String]
**variations** | [**List&lt;ComplianceTemplateVariationRequest&gt;**](ComplianceTemplateVariationRequest.md) | Variation details of a Compliance Template | [default to List<ComplianceTemplateVariationRequest>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateComplianceTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String description = "example description";
List<ComplianceTemplateVariationRequest> variations = new List<ComplianceTemplateVariationRequest>();


UpdateComplianceTemplateRequest updateComplianceTemplateRequestInstance = new UpdateComplianceTemplateRequest()
    .code(code)
    .description(description)
    .variations(variations);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)