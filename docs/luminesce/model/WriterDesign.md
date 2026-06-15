# com.finbourne.sdk.services.luminesce.model.WriterDesign
classname WriterDesign
Representation of a \"designable Query for a writer\" suitable for formatting to SQL or being built from compliant SQL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sql** | **String** | Original SQL that started this off | [default to String]
**availableToMapFrom** | [**List&lt;ExpressionWithAlias&gt;**](ExpressionWithAlias.md) | The data able to be mapped from as derived from the Sql | [optional] [default to List<ExpressionWithAlias>]
**parameter** | [**AvailableParameter**](AvailableParameter.md) |  | [optional] [default to AvailableParameter]
**availableParameters** | [**List&lt;AvailableParameter&gt;**](AvailableParameter.md) | All the parameter the user may wish to design | [optional] [default to List<AvailableParameter>]

```java
import com.finbourne.sdk.services.luminesce.model.WriterDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String sql = "example sql";
@javax.annotation.Nullable List<ExpressionWithAlias> availableToMapFrom = new List<ExpressionWithAlias>();
AvailableParameter parameter = new AvailableParameter();
@javax.annotation.Nullable List<AvailableParameter> availableParameters = new List<AvailableParameter>();


WriterDesign writerDesignInstance = new WriterDesign()
    .sql(sql)
    .availableToMapFrom(availableToMapFrom)
    .parameter(parameter)
    .availableParameters(availableParameters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)