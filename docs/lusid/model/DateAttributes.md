# com.finbourne.sdk.services.lusid.model.DateAttributes
classname DateAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**irregular** | **Boolean** |  | [default to Boolean]
**irregularSession** | **Boolean** |  | [default to Boolean]
**newHours** | **Boolean** |  | [default to Boolean]
**activity** | **String** |  | [optional] [default to String]
**firstOpen** | **String** |  | [optional] [default to String]
**lastOpen** | **String** |  | [optional] [default to String]
**firstClose** | **String** |  | [optional] [default to String]
**lastClose** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DateAttributes;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean irregular = true;
Boolean irregularSession = true;
Boolean newHours = true;
@javax.annotation.Nullable String activity = "example activity";
@javax.annotation.Nullable String firstOpen = "example firstOpen";
@javax.annotation.Nullable String lastOpen = "example lastOpen";
@javax.annotation.Nullable String firstClose = "example firstClose";
@javax.annotation.Nullable String lastClose = "example lastClose";


DateAttributes dateAttributesInstance = new DateAttributes()
    .irregular(irregular)
    .irregularSession(irregularSession)
    .newHours(newHours)
    .activity(activity)
    .firstOpen(firstOpen)
    .lastOpen(lastOpen)
    .firstClose(firstClose)
    .lastClose(lastClose);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)