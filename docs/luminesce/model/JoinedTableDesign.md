# com.finbourne.sdk.services.luminesce.model.JoinedTableDesign
classname JoinedTableDesign
Treatment of a joined-to-table a QueryDesign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**joinedTableName** | **String** | Name of the table on the right side of the join | [default to String]
**joinedTableAlias** | **String** | Alias for the table on the right side of the join | [default to String]
**leftTableAlias** | **String** | Alias for the table on the left side of the join | [default to String]
**joinType** | [**DesignJoinType**](DesignJoinType.md) |  | [default to DesignJoinType]
**onClauseTerms** | [**List&lt;OnClauseTermDesign&gt;**](OnClauseTermDesign.md) | Filter clauses to apply to this join in the on clause | [default to List<OnClauseTermDesign>]
**rightTableAvailableFields** | [**List&lt;AvailableField&gt;**](AvailableField.md) | Fields that are known to be available for design when parsing SQL, of the right hand table | [optional] [default to List<AvailableField>]

```java
import com.finbourne.sdk.services.luminesce.model.JoinedTableDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String joinedTableName = "example joinedTableName";
String joinedTableAlias = "example joinedTableAlias";
String leftTableAlias = "example leftTableAlias";
DesignJoinType List<OnClauseTermDesign> onClauseTerms = new List<OnClauseTermDesign>();
@javax.annotation.Nullable List<AvailableField> rightTableAvailableFields = new List<AvailableField>();


JoinedTableDesign joinedTableDesignInstance = new JoinedTableDesign()
    .joinedTableName(joinedTableName)
    .joinedTableAlias(joinedTableAlias)
    .leftTableAlias(leftTableAlias)
    .joinType(joinType)
    .onClauseTerms(onClauseTerms)
    .rightTableAvailableFields(rightTableAvailableFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)