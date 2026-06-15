# com.finbourne.sdk.services.luminesce.model.CertificateStatus
classname CertificateStatus
Which System(s) have been updated with a given request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CertificateStatus** | [**String**](.md) | **Which System(s) have been updated with a given request** | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.CertificateStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of CertificateStatus:
CertificateStatus method = CertificateStatus.NONE;
CertificateStatus method = CertificateStatus.WEB_API_PERSISTENCE;
CertificateStatus method = CertificateStatus.VAULT;
CertificateStatus method = CertificateStatus.WEB_API_PERSISTENCE_VAULT;
CertificateStatus method = CertificateStatus.RABBIT;
CertificateStatus method = CertificateStatus.WEB_API_PERSISTENCE_RABBIT;
CertificateStatus method = CertificateStatus.VAULT_RABBIT;
CertificateStatus method = CertificateStatus.WEB_API_PERSISTENCE_VAULT_RABBIT;
CertificateStatus method = CertificateStatus.CONFIG_STORE;
CertificateStatus method = CertificateStatus.WEB_API_PERSISTENCE_CONFIG_STORE;
CertificateStatus method = CertificateStatus.VAULT_CONFIG_STORE;
CertificateStatus method = CertificateStatus.WEB_API_PERSISTENCE_VAULT_CONFIG_STORE;
CertificateStatus method = CertificateStatus.RABBIT_CONFIG_STORE;
CertificateStatus method = CertificateStatus.WEB_API_PERSISTENCE_RABBIT_CONFIG_STORE;
CertificateStatus method = CertificateStatus.VAULT_RABBIT_CONFIG_STORE;
CertificateStatus method = CertificateStatus.ALL_SYSTEMS;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)