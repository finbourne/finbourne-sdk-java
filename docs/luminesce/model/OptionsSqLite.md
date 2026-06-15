# com.finbourne.sdk.services.luminesce.model.OptionsSqLite
classname OptionsSqLite
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**table** | **String** | Table name to read.  If missing then an error will be raised if there is any number of tables other than one. | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.OptionsSqLite;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String table = "example table";


OptionsSqLite optionsSqLiteInstance = new OptionsSqLite()
    .table(table);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)