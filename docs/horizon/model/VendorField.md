# com.finbourne.sdk.services.horizon.model.VendorField
classname VendorField
Reference to a specific vendor field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_package** | **String** | The vendor package it is included in | [default to String]
**field** | **String** | The name of the field | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.VendorField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String package = "example package";
String field = "example field";


VendorField vendorFieldInstance = new VendorField()
    .package(package)
    .field(field);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)