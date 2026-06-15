# com.finbourne.sdk.services.workflow.model.Stack
classname Stack
Information pertaining to the Tasks Stack if one is present

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberAddedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the Task was added to the Stack | [optional] [default to OffsetDateTime]
**stackOpenedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the Stack was opened | [optional] [default to OffsetDateTime]
**stackClosedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the Stack was closed | [optional] [default to OffsetDateTime]
**stackMembershipType** | **String** | Whether the task is the Lead task of the Stack or a Member within the Stack | [optional] [default to String]
**stackStatus** | **String** | Status of the Stack (Open/Closed) | [optional] [default to String]
**leadTaskId** | [**UUID**](UUID.md) | ID of the Lead Task | [optional] [default to UUID]
**leadTaskState** | **String** | State of the Lead Task | [optional] [default to String]
**tasksInStack** | **Integer** | Number of Tasks in the Stack | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.workflow.model.Stack;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime memberAddedAsAt = OffsetDateTime.now();
OffsetDateTime stackOpenedAsAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime stackClosedAsAt = OffsetDateTime.now();
@javax.annotation.Nullable String stackMembershipType = "example stackMembershipType";
@javax.annotation.Nullable String stackStatus = "example stackStatus";
UUID leadTaskId = "example leadTaskId";
@javax.annotation.Nullable String leadTaskState = "example leadTaskState";
Integer tasksInStack = new Integer("100.00");


Stack stackInstance = new Stack()
    .memberAddedAsAt(memberAddedAsAt)
    .stackOpenedAsAt(stackOpenedAsAt)
    .stackClosedAsAt(stackClosedAsAt)
    .stackMembershipType(stackMembershipType)
    .stackStatus(stackStatus)
    .leadTaskId(leadTaskId)
    .leadTaskState(leadTaskState)
    .tasksInStack(tasksInStack);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)