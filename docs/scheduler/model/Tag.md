# com.finbourne.sdk.services.scheduler.model.Tag
classname Tag
Represents data of an image's tag

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the tag | [optional] [default to String]
**pullTime** | [**OffsetDateTime**](OffsetDateTime.md) | The latest pull time | [optional] [default to OffsetDateTime]
**pushTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the tag&#39;s push | [optional] [default to OffsetDateTime]
**signed** | **Boolean** | Indicates whether the tag is signed | [optional] [default to Boolean]
**immutable** | **Boolean** | Indicates whether the tag is immutable | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.scheduler.model.Tag;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
OffsetDateTime pullTime = OffsetDateTime.now();
OffsetDateTime pushTime = OffsetDateTime.now();
Boolean signed = true;
Boolean immutable = true;


Tag tagInstance = new Tag()
    .name(name)
    .pullTime(pullTime)
    .pushTime(pushTime)
    .signed(signed)
    .immutable(immutable);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)