# com.finbourne.sdk.services.horizon.model.FieldMapping
classname FieldMapping
Mapping from a set of Vendor Fields to a LUSID core entity field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The LUSID core entity field | [default to String]
**defaultValue** | **String** | Default value if needed | [optional] [default to String]
**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) | Fields that will be used to map to this field | [default to List<VendorField>]
**transformationDescription** | **String** | The transformation, if required, to map from VendorFields to the LUSID Property | [optional] [default to String]
**entityType** | **String** | The LUSID Entity this is valid for | [default to String]
**entitySubType** | **String** | The LUSID Entity sub type this is valid for | [optional] [default to String]
**versions** | **List&lt;String&gt;** | The versions of the Vendor integration this mapping is valid for | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.FieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fieldName = "example fieldName";
@javax.annotation.Nullable String defaultValue = "example defaultValue";
List<VendorField> vendorFields = new List<VendorField>();
@javax.annotation.Nullable String transformationDescription = "example transformationDescription";
String entityType = "example entityType";
@javax.annotation.Nullable String entitySubType = "example entitySubType";
List<String> versions = new List<String>();


FieldMapping fieldMappingInstance = new FieldMapping()
    .fieldName(fieldName)
    .defaultValue(defaultValue)
    .vendorFields(vendorFields)
    .transformationDescription(transformationDescription)
    .entityType(entityType)
    .entitySubType(entitySubType)
    .versions(versions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)