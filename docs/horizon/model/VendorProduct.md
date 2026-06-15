# com.finbourne.sdk.services.horizon.model.VendorProduct
classname VendorProduct
Denormalised information about vendors, the products they provide and the LUSID entity types they can be used to populate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendorName** | **String** |  | [default to String]
**productName** | **String** |  | [default to String]
**vendorProductKey** | **String** |  | [default to String]
**lusidEntity** | [**LusidEntity**](LusidEntity.md) |  | [default to LusidEntity]

```java
import com.finbourne.sdk.services.horizon.model.VendorProduct;
import java.util.*;
import java.lang.System;
import java.net.URI;

String vendorName = "example vendorName";
String productName = "example productName";
String vendorProductKey = "example vendorProductKey";
LusidEntity lusidEntity = new LusidEntity();


VendorProduct vendorProductInstance = new VendorProduct()
    .vendorName(vendorName)
    .productName(productName)
    .vendorProductKey(vendorProductKey)
    .lusidEntity(lusidEntity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)