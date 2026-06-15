# com.finbourne.sdk.services.horizon.model.OnboardInstrumentRequest
classname OnboardInstrumentRequest
The full structure of a instrument creation / onboarding request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataResults** | [**List&lt;OpenFigiPermIdResult&gt;**](OpenFigiPermIdResult.md) | Enumerable packed OpenFigi/PermId information used to create instruments | [default to List<OpenFigiPermIdResult>]
**primaryVendorKey** | **String** | Primary vendor used to master instrument from Unknown to an asset type | [optional] [default to String]
**secondaryVendorKeys** | **List&lt;String&gt;** | Secondary vendors used to decorate additional properties | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.OnboardInstrumentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OpenFigiPermIdResult> dataResults = new List<OpenFigiPermIdResult>();
@javax.annotation.Nullable String primaryVendorKey = "example primaryVendorKey";
@javax.annotation.Nullable List<String> secondaryVendorKeys = new List<String>();


OnboardInstrumentRequest onboardInstrumentRequestInstance = new OnboardInstrumentRequest()
    .dataResults(dataResults)
    .primaryVendorKey(primaryVendorKey)
    .secondaryVendorKeys(secondaryVendorKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)