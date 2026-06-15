# com.finbourne.sdk.services.identity.model.RotateAttachingKeyRequest
classname RotateAttachingKeyRequest
Request body for rotating the Attaching Key on a cell that is already Attached to a parent admin domain. Carries only the new PAT value — the parent identity is already pinned on the cell from the original `SetAttachingKey` handshake and the source of truth for all later operations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pat** | **String** | New Attaching Key PAT to persist. Same length / content constraints as the original Finbourne.Lydia.WebApi.Dtos.CellManagement.SetAttachingKeyRequest.Pat: a &#x60;StringSecurityCheck&#x60; catch-all plus a strict opaque-token character set so the request body cannot smuggle in HTML / SQL / script content. | [default to String]

```java
import com.finbourne.sdk.services.identity.model.RotateAttachingKeyRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String pat = "example pat";


RotateAttachingKeyRequest rotateAttachingKeyRequestInstance = new RotateAttachingKeyRequest()
    .pat(pat);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)