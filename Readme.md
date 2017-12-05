# LetGo Automation Test
## Introduction
This project tries to solve questions sent by mail as part of interview process in LetGo
Text question are resolved in this document and code questions are stored in their own 
corresponding folders.

## Requeriments
To execute test code you only need Java 8 and a connection to internet to download dependencies.
You don't need any further setup after extract the code.

## Question 1

## Question 2
To: Laura
Hi Laura,
I think I cannot make much with the information you gave me. Please, could you clarify
 - The url to test
 - The final localization to go (Need I change from US to Spain?)
 - Do I need to filter search?



## Question 3 Automated API testing
#### Execution
In project root type:
```
./gradlew purgomalum_test
```
#### Approach
As purgomalum is a simple API, I defined two different approaches to test them. First one is
to test each method (API has 4 methods but for conciseness purposes I only *containsprofanity* and *json* ). 
The second approach is to test features like add, fill_char, ...

To test the API I defined scenarios with Cucumber and I used the *scenario outline* feature to define 
the scenario data provider as *example* section.

#### Technologies used:
Cucumber to test definition
Gradle for dependency management
JUnit as utility class for assertions. 


## Question 4
