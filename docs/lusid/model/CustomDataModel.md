# com.finbourne.sdk.services.lusid.model.CustomDataModel
classname CustomDataModel

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataModelSummary** | [**DataModelSummary**](DataModelSummary.md) |  | [optional] [default to DataModelSummary]
**inherited** | [**CustomDataModelCriteria**](CustomDataModelCriteria.md) |  | [optional] [default to CustomDataModelCriteria]
**incremental** | [**CustomDataModelCriteria**](CustomDataModelCriteria.md) |  | [optional] [default to CustomDataModelCriteria]
**applied** | [**CustomDataModelCriteria**](CustomDataModelCriteria.md) |  | [optional] [default to CustomDataModelCriteria]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.CustomDataModel;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataModelSummary dataModelSummary = new DataModelSummary();
CustomDataModelCriteria inherited = new CustomDataModelCriteria();
CustomDataModelCriteria incremental = new CustomDataModelCriteria();
CustomDataModelCriteria applied = new CustomDataModelCriteria();
Version version = new Version();


CustomDataModel customDataModelInstance = new CustomDataModel()
    .dataModelSummary(dataModelSummary)
    .inherited(inherited)
    .incremental(incremental)
    .applied(applied)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)