# com.finbourne.sdk.services.luminesce.model.AutoDetectType
classname AutoDetectType
The method of name/type column inference being used

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoDetectType** | [**String**](.md) | **The method of name/type column inference being used** | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.AutoDetectType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of AutoDetectType:
AutoDetectType method = AutoDetectType.AUTO;
AutoDetectType method = AutoDetectType.SPECIFY_COLUMNS_YET_INFER_TYPES;
AutoDetectType method = AutoDetectType.SPECIFY_COLUMNS_AND_TYPES;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)