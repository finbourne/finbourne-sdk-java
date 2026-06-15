# com.finbourne.sdk.services.identity.model.SetParentCellRequest
classname SetParentCellRequest
Request body for setting the parent cell.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminDomainName** | **String** | The name of the admin domain in the parent cell. | [default to String]
**confirm** | **Boolean** | Whether to confirm the parent cell attachment (second invocation). First call with false creates a Proposed state; second call with true transitions to Attaching. | [default to Boolean]

```java
import com.finbourne.sdk.services.identity.model.SetParentCellRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String adminDomainName = "example adminDomainName";
Boolean confirm = true;


SetParentCellRequest setParentCellRequestInstance = new SetParentCellRequest()
    .adminDomainName(adminDomainName)
    .confirm(confirm);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)