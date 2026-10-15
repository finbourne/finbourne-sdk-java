# com.finbourne.sdk.services.lusid.model.WhtParameters
classname WhtParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**whtConfig** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taxCountry** | **String** | The holder&#39;s country of tax residence, matched against the taxCountry field of the rate datasets. | [default to String]
**profileType** | **String** | The holder&#39;s tax profile, matched against the profileType field of the rate datasets. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WhtParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId whtConfig = new ResourceId();
String taxCountry = "example taxCountry";
String profileType = "example profileType";


WhtParameters whtParametersInstance = new WhtParameters()
    .whtConfig(whtConfig)
    .taxCountry(taxCountry)
    .profileType(profileType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)