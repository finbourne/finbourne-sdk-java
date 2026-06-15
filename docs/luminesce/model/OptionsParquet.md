# com.finbourne.sdk.services.luminesce.model.OptionsParquet
classname OptionsParquet
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnNamesWanted** | **String** | Column (by Name) that should be returned (comma delimited list) | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.OptionsParquet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String columnNamesWanted = "example columnNamesWanted";


OptionsParquet optionsParquetInstance = new OptionsParquet()
    .columnNamesWanted(columnNamesWanted);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)