# com.finbourne.sdk.services.horizon.model.PropertyMapping
classname PropertyMapping
Mapping from a set of VendorFields to a LUSID Property

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**property** | [**LusidPropertyDefinition**](LusidPropertyDefinition.md) |  | [default to LusidPropertyDefinition]
**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) | Fields that will be used to map to this Property Definition | [default to List<VendorField>]
**optionality** | **String** | Whether the Property is Mandatory, Suggested or Optional | [default to String]
**entityType** | **String** | The LUSID Entity this is valid for | [default to String]
**entitySubType** | **String** | The LUSID Entity sub type this is valid for | [optional] [default to String]
**transformationDescription** | **String** | The transformation, if required, to map from VendorFields to the LUSID Property | [optional] [default to String]
**versions** | **List&lt;String&gt;** | The versions of the Vendor integration this mapping is valid for | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.PropertyMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidPropertyDefinition property = new LusidPropertyDefinition();
List<VendorField> vendorFields = new List<VendorField>();
String optionality = "example optionality";
String entityType = "example entityType";
@javax.annotation.Nullable String entitySubType = "example entitySubType";
@javax.annotation.Nullable String transformationDescription = "example transformationDescription";
List<String> versions = new List<String>();


PropertyMapping propertyMappingInstance = new PropertyMapping()
    .property(property)
    .vendorFields(vendorFields)
    .optionality(optionality)
    .entityType(entityType)
    .entitySubType(entitySubType)
    .transformationDescription(transformationDescription)
    .versions(versions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)