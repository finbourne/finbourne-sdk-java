# com.finbourne.sdk.services.identity.model.SetAttachingKeyRequest
classname SetAttachingKeyRequest
Request body for setting the Attaching Key on a child cell. The three values together identify the parent admin domain, the parent's cell database row, and the PAT used to authenticate the attachment handshake.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pat** | **String** | Attaching Key PAT issued by the parent admin portal&#39;s &#x60;BeginCellRegistration&#x60; endpoint. Length bounds match admin-ui&#39;s &#x60;RegisterDomainPatRequest&#x60;. We apply &#x60;StringSecurityCheck&#x60; (the Finbourne.Validation catch-all that the recorded baseline tolerates for opaque strings) AND a stricter regex restricting the value to the opaque-token character set so the request body cannot smuggle in HTML/SQL/ script content even if the catch-all is later relaxed. | [default to String]
**parentDomainName** | **String** | Parent admin domain name (as entered alongside the Attaching Key by the user). Used only as the initial proposal value; the admin domain stored in the DB is the source of truth for all later operations (anti-redirection). | [default to String]
**parentAssignedCellId** | **Long** | Database identifier of this cell in the parent admin-ui&#39;s &#x60;cell&#x60; table. Returned alongside the Attaching Key by the parent&#39;s &#x60;BeginCellRegistration&#x60; response and required to call &#x60;POST /admin-ui/api/domains/{cellId}/register&#x60; during the Finbourne.Lydia.Postgres.Database.DTO.RegistrationStep.PatPushed step. | [optional] [default to Long]

```java
import com.finbourne.sdk.services.identity.model.SetAttachingKeyRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String pat = "example pat";
String parentDomainName = "example parentDomainName";
Long parentAssignedCellId = new Long("100.00");


SetAttachingKeyRequest setAttachingKeyRequestInstance = new SetAttachingKeyRequest()
    .pat(pat)
    .parentDomainName(parentDomainName)
    .parentAssignedCellId(parentAssignedCellId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)