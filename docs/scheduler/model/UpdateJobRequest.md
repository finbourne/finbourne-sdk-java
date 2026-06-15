# com.finbourne.sdk.services.scheduler.model.UpdateJobRequest
classname UpdateJobRequest
A request to update a job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the job | [default to String]
**author** | **String** | Author of the job | [optional] [default to String]
**description** | **String** | Description of this job | [default to String]
**imageName** | **String** | The name of the Docker image that contains this job | [default to String]
**imageTag** | **String** | The tag of the Docker image that contains this job | [default to String]
**ttl** | **Integer** | Time To Live of the job run in seconds Defaults to 5 minutes(300) | [optional] [default to Integer]
**minCpu** | **String** | Specifies  minimum number of CPUs to be allocated for the job Default to 2 | [optional] [default to String]
**maxCpu** | **String** | Specifies  maximum number of CPUs to be allocated for the job | [optional] [default to String]
**minMemory** | **String** | Specifies the minimum amount of memory  to be allocated for the job | [optional] [default to String]
**maxMemory** | **String** | Specifies the maximum amount of memory to be allocated for the job | [optional] [default to String]
**argumentDefinitions** | [**Map&lt;String, ArgumentDefinition&gt;**](ArgumentDefinition.md) | All arguments for this job to run | [default to Map<String, ArgumentDefinition>]
**commandLineArgumentSeparator** | **String** | Value to separate command line arguments e.g : If a job has a command line argument named &#39;folder&#39; and the runtime value is &#39;s3://path&#39; then this would be supplied to the command as &#39;folder{separatorValue}s3://path&#39; Default to a space | [optional] [default to String]
**requiredResources** | [**RequiredResources**](RequiredResources.md) |  | [optional] [default to RequiredResources]

```java
import com.finbourne.sdk.services.scheduler.model.UpdateJobRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable String author = "example author";
String description = "example description";
String imageName = "example imageName";
String imageTag = "example imageTag";
Integer ttl = new Integer("100.00");
@javax.annotation.Nullable String minCpu = "example minCpu";
@javax.annotation.Nullable String maxCpu = "example maxCpu";
@javax.annotation.Nullable String minMemory = "example minMemory";
@javax.annotation.Nullable String maxMemory = "example maxMemory";
Map<String, ArgumentDefinition> argumentDefinitions = new Map<String, ArgumentDefinition>();
@javax.annotation.Nullable String commandLineArgumentSeparator = "example commandLineArgumentSeparator";
RequiredResources requiredResources = new RequiredResources();


UpdateJobRequest updateJobRequestInstance = new UpdateJobRequest()
    .name(name)
    .author(author)
    .description(description)
    .imageName(imageName)
    .imageTag(imageTag)
    .ttl(ttl)
    .minCpu(minCpu)
    .maxCpu(maxCpu)
    .minMemory(minMemory)
    .maxMemory(maxMemory)
    .argumentDefinitions(argumentDefinitions)
    .commandLineArgumentSeparator(commandLineArgumentSeparator)
    .requiredResources(requiredResources);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)