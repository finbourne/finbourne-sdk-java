# com.finbourne.sdk.services.luminesce.model.CertificateState
classname CertificateState
Information held about the minting / revoking of a certificate. It does *not* contain the certificate itself

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The \&quot;key\&quot; to which this belongs in the dictionary, basically the CN without any version information | [optional] [default to String]
**version** | **Integer** | The version of this certificate | [optional] [default to Integer]
**commonName** | **String** | The common Name of the Certificate | [optional] [default to String]
**type** | [**CertificateType**](CertificateType.md) |  | [optional] [default to CertificateType]
**creationStatus** | [**CertificateStatus**](CertificateStatus.md) |  | [optional] [default to CertificateStatus]
**revocationStatus** | [**CertificateStatus**](CertificateStatus.md) |  | [optional] [default to CertificateStatus]
**validityStart** | [**OffsetDateTime**](OffsetDateTime.md) | The earliest point at which a certificate can be used | [optional] [default to OffsetDateTime]
**validityEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The latest point at which a certificate can be used | [optional] [default to OffsetDateTime]
**revokedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The point at which this was revoked, if any | [optional] [default to OffsetDateTime]
**revokedBy** | **String** | The user which revoked this, if any | [optional] [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The point at which this was created | [optional] [default to OffsetDateTime]
**permissionsSetAt** | [**OffsetDateTime**](OffsetDateTime.md) | The point at which permissions were adjusted by the system | [optional] [default to OffsetDateTime]
**createdBy** | **String** | The user which created this | [optional] [default to String]
**serialNumber** | **String** | The Vault-issued serial number of the certificate, if any - used for revocation | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) | The location within Configuration Store that this is saved to | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.luminesce.model.CertificateState;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String key = "example key";
Integer version = new Integer("100.00");
@javax.annotation.Nullable String commonName = "example commonName";
CertificateType CertificateStatus CertificateStatus @javax.annotation.Nullable OffsetDateTime validityStart = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime validityEnd = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime revokedAt = OffsetDateTime.now();
@javax.annotation.Nullable String revokedBy = "example revokedBy";
@javax.annotation.Nullable OffsetDateTime createdAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime permissionsSetAt = OffsetDateTime.now();
@javax.annotation.Nullable String createdBy = "example createdBy";
@javax.annotation.Nullable String serialNumber = "example serialNumber";
@javax.annotation.Nullable List<Link> links = new List<Link>();


CertificateState certificateStateInstance = new CertificateState()
    .key(key)
    .version(version)
    .commonName(commonName)
    .type(type)
    .creationStatus(creationStatus)
    .revocationStatus(revocationStatus)
    .validityStart(validityStart)
    .validityEnd(validityEnd)
    .revokedAt(revokedAt)
    .revokedBy(revokedBy)
    .createdAt(createdAt)
    .permissionsSetAt(permissionsSetAt)
    .createdBy(createdBy)
    .serialNumber(serialNumber)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)