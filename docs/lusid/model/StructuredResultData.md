# com.finbourne.sdk.services.lusid.model.StructuredResultData
classname StructuredResultData
An item of structured result data that is to be inserted into Lusid. This will typically be a Json or Xml document that  contains a set of result data appropriate to a specific entity such as an instrument or potentially an index.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentFormat** | **String** | The format of the accompanying document. | [default to String]
**version** | **String** | The semantic version of the document format; MAJOR.MINOR.PATCH | [optional] [default to String]
**name** | **String** | The name or description for the document | [optional] [default to String]
**document** | **String** | The document that will be stored (or retrieved) and which describes a unit result data entity such as a set of prices or yields | [default to String]
**dataMapKey** | [**DataMapKey**](DataMapKey.md) |  | [optional] [default to DataMapKey]

```java
import com.finbourne.sdk.services.lusid.model.StructuredResultData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String documentFormat = "example documentFormat";
@javax.annotation.Nullable String version = "example version";
@javax.annotation.Nullable String name = "example name";
String document = "example document";
DataMapKey dataMapKey = new DataMapKey();


StructuredResultData structuredResultDataInstance = new StructuredResultData()
    .documentFormat(documentFormat)
    .version(version)
    .name(name)
    .document(document)
    .dataMapKey(dataMapKey);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)