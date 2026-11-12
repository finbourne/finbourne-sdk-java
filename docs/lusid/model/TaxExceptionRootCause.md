# com.finbourne.sdk.services.lusid.model.TaxExceptionRootCause
classname TaxExceptionRootCause

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | A stable code for the cause, for example PoolOutOfSync or MissingTreatmentLeaf. | [default to String]
**label** | **String** | A display label for the cause. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxExceptionRootCause;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String label = "example label";


TaxExceptionRootCause taxExceptionRootCauseInstance = new TaxExceptionRootCause()
    .code(code)
    .label(label);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)