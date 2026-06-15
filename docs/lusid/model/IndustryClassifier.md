# com.finbourne.sdk.services.lusid.model.IndustryClassifier
classname IndustryClassifier
Object describing a particular industry classifier,  which comprises a classification code and the name of the classification system to which the code belongs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classificationSystemName** | **String** | The name of the classification system to which the classification code belongs (e.g. GICS). Available values: GICS2018. | [default to String]
**classificationCode** | **String** | The specific industry classification code assigned to the legal entity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.IndustryClassifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String classificationSystemName = "example classificationSystemName";
String classificationCode = "example classificationCode";


IndustryClassifier industryClassifierInstance = new IndustryClassifier()
    .classificationSystemName(classificationSystemName)
    .classificationCode(classificationCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)