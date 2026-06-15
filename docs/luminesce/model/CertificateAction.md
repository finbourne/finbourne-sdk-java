# com.finbourne.sdk.services.luminesce.model.CertificateAction
classname CertificateAction
The action to take with a certificate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CertificateAction** | [**String**](.md) | **The action to take with a certificate** | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.CertificateAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of CertificateAction:
CertificateAction method = CertificateAction.CREATE;
CertificateAction method = CertificateAction.CREATE_AND_ALLOW_MULTIPLE_WHICH_ARE_VALID;
CertificateAction method = CertificateAction.RENEW;
CertificateAction method = CertificateAction.REVOKE;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)