# com.finbourne.sdk.services.identity.model.DetachParentCellRequest
classname DetachParentCellRequest
Request body for `DetachParentCell`. The endpoint uses a double-invoke pattern: the first call (Finbourne.Lydia.WebApi.Dtos.CellManagement.DetachParentCellRequest.Confirm=false) transitions the cell into Finbourne.Lydia.Postgres.Database.DTO.AttachmentStatus.Detaching; the second call (Finbourne.Lydia.WebApi.Dtos.CellManagement.DetachParentCellRequest.Confirm=true) performs the actual detach.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**confirm** | **Boolean** | False to mark the cell as &#x60;Detaching&#x60;; true to execute the detach. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.identity.model.DetachParentCellRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean confirm = true;


DetachParentCellRequest detachParentCellRequestInstance = new DetachParentCellRequest()
    .confirm(confirm);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)