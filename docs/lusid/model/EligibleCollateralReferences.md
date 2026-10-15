# com.finbourne.sdk.services.lusid.model.EligibleCollateralReferences
classname EligibleCollateralReferences
The eligible collateral schedule each party's posting is checked against.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wePost** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**theyPost** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.EligibleCollateralReferences;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId wePost = new ResourceId();
ResourceId theyPost = new ResourceId();


EligibleCollateralReferences eligibleCollateralReferencesInstance = new EligibleCollateralReferences()
    .wePost(wePost)
    .theyPost(theyPost);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)