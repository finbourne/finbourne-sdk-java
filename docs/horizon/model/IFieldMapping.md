# com.finbourne.sdk.services.horizon.model.IFieldMapping
classname IFieldMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultValue** | **String** |  | [optional] [default to String]
**entitySubType** | **String** |  | [optional] [default to String]
**entityType** | **String** |  | [default to String]
**fieldName** | **String** |  | [default to String]
**transformationDescription** | **String** |  | [optional] [default to String]
**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) |  | [default to List<VendorField>]
**versions** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.IFieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String defaultValue = "example defaultValue";
@javax.annotation.Nullable String entitySubType = "example entitySubType";
String entityType = "example entityType";
String fieldName = "example fieldName";
@javax.annotation.Nullable String transformationDescription = "example transformationDescription";
List<VendorField> vendorFields = new List<VendorField>();
List<String> versions = new List<String>();


IFieldMapping iFieldMappingInstance = new IFieldMapping()
    .defaultValue(defaultValue)
    .entitySubType(entitySubType)
    .entityType(entityType)
    .fieldName(fieldName)
    .transformationDescription(transformationDescription)
    .vendorFields(vendorFields)
    .versions(versions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)