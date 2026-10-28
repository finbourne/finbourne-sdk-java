# com.finbourne.sdk.services.luminesce.model.MultiQueryExportState
classname MultiQueryExportState
What became of the export of a custom multi-query once its queries were done (persisted in its shared state, so known to every pod).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driveLocationAndFileName** | **String** | Where it was to be saved, its placeholders filled in | [optional] [default to String]
**savedTo** | **String** | The Drive path (and file name, with its extension) it was saved to, once it has been | [optional] [default to String]
**error** | **String** | Why it was not saved, if it was not | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.MultiQueryExportState;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String driveLocationAndFileName = "example driveLocationAndFileName";
@javax.annotation.Nullable String savedTo = "example savedTo";
@javax.annotation.Nullable String error = "example error";


MultiQueryExportState multiQueryExportStateInstance = new MultiQueryExportState()
    .driveLocationAndFileName(driveLocationAndFileName)
    .savedTo(savedTo)
    .error(error);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)