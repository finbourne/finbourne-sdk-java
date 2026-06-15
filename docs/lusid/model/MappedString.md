# com.finbourne.sdk.services.lusid.model.MappedString
classname MappedString

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftValue** | **String** |  | [optional] [default to String]
**rightValue** | **String** |  | [optional] [default to String]
**mappingDirection** | **String** |  | [optional] [default to String]
**isCaseSensitive** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.MappedString;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String leftValue = "example leftValue";
@javax.annotation.Nullable String rightValue = "example rightValue";
@javax.annotation.Nullable String mappingDirection = "example mappingDirection";
Boolean isCaseSensitive = true;


MappedString mappedStringInstance = new MappedString()
    .leftValue(leftValue)
    .rightValue(rightValue)
    .mappingDirection(mappingDirection)
    .isCaseSensitive(isCaseSensitive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)