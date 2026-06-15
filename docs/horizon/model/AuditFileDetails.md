# com.finbourne.sdk.services.horizon.model.AuditFileDetails
classname AuditFileDetails
Holds information about Horizon Audit Files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileType** | **String** | The type of the audit file | [default to String]
**filePathAndName** | **String** | The file path and name | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.AuditFileDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fileType = "example fileType";
String filePathAndName = "example filePathAndName";


AuditFileDetails auditFileDetailsInstance = new AuditFileDetails()
    .fileType(fileType)
    .filePathAndName(filePathAndName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)