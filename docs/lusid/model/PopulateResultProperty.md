# com.finbourne.sdk.services.lusid.model.PopulateResultProperty
classname PopulateResultProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The property the formula populates. Must be an existing, single-valued property in the RecResult domain, and may appear only once. | [default to String]
**formula** | **String** | The formula whose value populates the property; a null value means the property has no value. | [default to String]
**overwriteManualEditsOnReRun** | **Boolean** | Whether a value edited since the property was last populated is replaced. Defaults to false, so manual edits are kept. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.PopulateResultProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String propertyKey = "example propertyKey";
String formula = "example formula";
@javax.annotation.Nullable Boolean overwriteManualEditsOnReRun = true;


PopulateResultProperty populateResultPropertyInstance = new PopulateResultProperty()
    .propertyKey(propertyKey)
    .formula(formula)
    .overwriteManualEditsOnReRun(overwriteManualEditsOnReRun);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)