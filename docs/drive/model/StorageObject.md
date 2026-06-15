# com.finbourne.sdk.services.drive.model.StorageObject
classname StorageObject
An object representation of a drive file or folder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | File or folder identifier | [default to String]
**path** | **String** | Path of the folder or file | [default to String]
**name** | **String** | Name of the folder or file | [default to String]
**createdBy** | **String** | Identifier of the user who created the file or folder | [default to String]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | Date of file/folder creation | [default to OffsetDateTime]
**updatedBy** | **String** | Identifier of the last user to modify the file or folder | [default to String]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | Date of file/folder modification | [default to OffsetDateTime]
**type** | **String** | Type of storage object (file or folder) | [default to String]
**size** | **Integer** | Size of the file in bytes | [optional] [default to Integer]
**status** | **String** | File status corresponding to virus scan status. (Active, Available, Checking, MalwareDetected, Failed) | [optional] [default to String]
**statusDetail** | **String** | Detailed description describing any negative terminal state of file | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.drive.model.StorageObject;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String path = "example path";
String name = "example name";
String createdBy = "example createdBy";
OffsetDateTime createdOn = OffsetDateTime.now();
String updatedBy = "example updatedBy";
OffsetDateTime updatedOn = OffsetDateTime.now();
String type = "example type";
@javax.annotation.Nullable Integer size = new Integer("100.00");
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String statusDetail = "example statusDetail";
@javax.annotation.Nullable List<Link> links = new List<Link>();


StorageObject storageObjectInstance = new StorageObject()
    .id(id)
    .path(path)
    .name(name)
    .createdBy(createdBy)
    .createdOn(createdOn)
    .updatedBy(updatedBy)
    .updatedOn(updatedOn)
    .type(type)
    .size(size)
    .status(status)
    .statusDetail(statusDetail)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)