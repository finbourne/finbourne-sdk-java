# com.finbourne.sdk.services.lusid.model.PartnerStatementDiff
classname PartnerStatementDiff
The differences between two of a partner's statements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statementId** | **String** | The identifier of the statement. | [default to String]
**againstStatementId** | **String** | The identifier of the statement to compare against. | [default to String]
**identical** | **Boolean** | Whether the two statements carry the same figures. | [default to Boolean]
**differences** | [**List&lt;PartnerStatementLineDifference&gt;**](PartnerStatementLineDifference.md) | The figures that differ between the two statements. | [default to List<PartnerStatementLineDifference>]

```java
import com.finbourne.sdk.services.lusid.model.PartnerStatementDiff;
import java.util.*;
import java.lang.System;
import java.net.URI;

String statementId = "example statementId";
String againstStatementId = "example againstStatementId";
Boolean identical = true;
List<PartnerStatementLineDifference> differences = new List<PartnerStatementLineDifference>();


PartnerStatementDiff partnerStatementDiffInstance = new PartnerStatementDiff()
    .statementId(statementId)
    .againstStatementId(againstStatementId)
    .identical(identical)
    .differences(differences);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)