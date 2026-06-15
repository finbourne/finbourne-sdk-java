# com.finbourne.sdk.services.horizon.model.LusidPropertyToVendorFieldMapping
classname LusidPropertyToVendorFieldMapping
The mapping of a LUSID Property from the Vendor Field that would populate it

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**property** | [**LusidPropertyDefinition**](LusidPropertyDefinition.md) |  | [default to LusidPropertyDefinition]
**vendorField** | **String** |  | [default to String]
**vendorPackage** | **String** |  | [default to String]
**vendorNamespace** | **String** |  | [default to String]
**optionality** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.LusidPropertyToVendorFieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidPropertyDefinition property = new LusidPropertyDefinition();
String vendorField = "example vendorField";
String vendorPackage = "example vendorPackage";
String vendorNamespace = "example vendorNamespace";
String optionality = "example optionality";


LusidPropertyToVendorFieldMapping lusidPropertyToVendorFieldMappingInstance = new LusidPropertyToVendorFieldMapping()
    .property(property)
    .vendorField(vendorField)
    .vendorPackage(vendorPackage)
    .vendorNamespace(vendorNamespace)
    .optionality(optionality);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)