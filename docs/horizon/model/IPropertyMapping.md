# com.finbourne.sdk.services.horizon.model.IPropertyMapping
classname IPropertyMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitySubType** | **String** |  | [optional] [default to String]
**entityType** | **String** |  | [default to String]
**optionality** | **String** |  | [default to String]
**property** | [**LusidPropertyDefinition**](LusidPropertyDefinition.md) |  | [default to LusidPropertyDefinition]
**transformationDescription** | **String** |  | [optional] [default to String]
**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) |  | [default to List<VendorField>]
**versions** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.IPropertyMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String entitySubType = "example entitySubType";
String entityType = "example entityType";
String optionality = "example optionality";
LusidPropertyDefinition property = new LusidPropertyDefinition();
@javax.annotation.Nullable String transformationDescription = "example transformationDescription";
List<VendorField> vendorFields = new List<VendorField>();
List<String> versions = new List<String>();


IPropertyMapping iPropertyMappingInstance = new IPropertyMapping()
    .entitySubType(entitySubType)
    .entityType(entityType)
    .optionality(optionality)
    .property(property)
    .transformationDescription(transformationDescription)
    .vendorFields(vendorFields)
    .versions(versions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)