# com.finbourne.sdk.services.identity.model.CellParentStatusResponse
classname CellParentStatusResponse
Response containing the current cell parent status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The current attachment status of the cell. | [optional] [default to String]
**adminDomainName** | **String** | The name of the admin domain in the parent cell, if any. | [optional] [default to String]
**primaryDomainName** | **String** | The domain designated as the primary domain for this cell, if any. | [optional] [default to String]
**registrationStep** | **String** | The most recently reached registration checkpoint, or null if no registration has started. One of &#x60;UserEnsured&#x60;, &#x60;PATGenerated&#x60;, &#x60;PATPushed&#x60;. | [optional] [default to String]
**registrationError** | **String** | Operator-readable message describing the most recent registration failure, or null on success. | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.CellParentStatusResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String adminDomainName = "example adminDomainName";
@javax.annotation.Nullable String primaryDomainName = "example primaryDomainName";
@javax.annotation.Nullable String registrationStep = "example registrationStep";
@javax.annotation.Nullable String registrationError = "example registrationError";


CellParentStatusResponse cellParentStatusResponseInstance = new CellParentStatusResponse()
    .status(status)
    .adminDomainName(adminDomainName)
    .primaryDomainName(primaryDomainName)
    .registrationStep(registrationStep)
    .registrationError(registrationError);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)