# com.finbourne.sdk.services.scheduler.model.Image
classname Image
Represents the metadata of an image

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the image | [optional] [default to String]
**pushTime** | [**OffsetDateTime**](OffsetDateTime.md) | The push time of the image | [optional] [default to OffsetDateTime]
**pullTime** | [**OffsetDateTime**](OffsetDateTime.md) | The latest pull time of the image | [optional] [default to OffsetDateTime]
**digest** | **String** | The digest of the image | [optional] [default to String]
**size** | **Long** | The size of the image (in bytes) | [optional] [default to Long]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags of the image | [optional] [default to List<Tag>]
**scanReport** | [**ScanReport**](ScanReport.md) |  | [optional] [default to ScanReport]

```java
import com.finbourne.sdk.services.scheduler.model.Image;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable OffsetDateTime pushTime = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime pullTime = OffsetDateTime.now();
@javax.annotation.Nullable String digest = "example digest";
@javax.annotation.Nullable Long size = new Long("100.00");
@javax.annotation.Nullable List<Tag> tags = new List<Tag>();
ScanReport scanReport = new ScanReport();


Image imageInstance = new Image()
    .name(name)
    .pushTime(pushTime)
    .pullTime(pullTime)
    .digest(digest)
    .size(size)
    .tags(tags)
    .scanReport(scanReport);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)