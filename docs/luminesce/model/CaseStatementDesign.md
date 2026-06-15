# com.finbourne.sdk.services.luminesce.model.CaseStatementDesign
classname CaseStatementDesign
Representation of the selected field and a list of: filter, source, and target.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selectedField** | **String** | Selected field in the SQL query. | [optional] [default to String]
**caseStatementItems** | [**List&lt;CaseStatementItem&gt;**](CaseStatementItem.md) | A list containing the filter, source, and target. | [optional] [default to List<CaseStatementItem>]

```java
import com.finbourne.sdk.services.luminesce.model.CaseStatementDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String selectedField = "example selectedField";
@javax.annotation.Nullable List<CaseStatementItem> caseStatementItems = new List<CaseStatementItem>();


CaseStatementDesign caseStatementDesignInstance = new CaseStatementDesign()
    .selectedField(selectedField)
    .caseStatementItems(caseStatementItems);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)