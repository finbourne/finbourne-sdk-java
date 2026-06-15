# com.finbourne.sdk.services.lusid.model.FeeTransactionTemplateSpecification
classname FeeTransactionTemplateSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**specificationTypeName** | **String** |  | [default to String]
**supportedTemplateFields** | [**List&lt;TemplateField&gt;**](TemplateField.md) |  | [default to List<TemplateField>]

```java
import com.finbourne.sdk.services.lusid.model.FeeTransactionTemplateSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String specificationTypeName = "example specificationTypeName";
List<TemplateField> supportedTemplateFields = new List<TemplateField>();


FeeTransactionTemplateSpecification feeTransactionTemplateSpecificationInstance = new FeeTransactionTemplateSpecification()
    .specificationTypeName(specificationTypeName)
    .supportedTemplateFields(supportedTemplateFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)