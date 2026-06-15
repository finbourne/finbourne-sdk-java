# com.finbourne.sdk.services.lusid.model.UpsertFundBookmarkRequest
classname UpsertFundBookmarkRequest
A definition for the period you wish to close

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmarkCode** | **String** | Unique code for the Bookmark. | [default to String]
**displayName** | **String** | Identifiable Name assigned to the Bookmark. | [default to String]
**description** | **String** | Description assigned to the Bookmark. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the Bookmark. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the Bookmark. Defaults to latest. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Bookmark. | [optional] [default to Map<String, Property>]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Bookmark. Defaults to Latest. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Bookmark. Defaults to Latest. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.UpsertFundBookmarkRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bookmarkCode = "example bookmarkCode";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime queryAsAt = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable OffsetDateTime holdingsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime valuationsAsAtOverride = OffsetDateTime.now();


UpsertFundBookmarkRequest upsertFundBookmarkRequestInstance = new UpsertFundBookmarkRequest()
    .bookmarkCode(bookmarkCode)
    .displayName(displayName)
    .description(description)
    .effectiveAt(effectiveAt)
    .queryAsAt(queryAsAt)
    .properties(properties)
    .holdingsAsAtOverride(holdingsAsAtOverride)
    .valuationsAsAtOverride(valuationsAsAtOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)