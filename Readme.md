# LetGo Automation Test
## Introduction
This project tries to solve questions sent by mail as part of interview process in LetGo
Text question are resolved in this document and code questions are stored in their own 
corresponding folders.

## Requeriments
To execute test code you only need Java 8 and a connection to internet to download dependencies.
You don't need any further setup after extract the code.

## Question 1
From the text found in the question 4, I could guest that I must sign up a new user and make a search. Text is:
"You are in charge of automate the email (make sure to use the email option) account creation process and the products search"
TC1: Try to sign up with a existing user
TC2: Try to sign up with a non existing user
TC3: Insert an incorrect email
TC4: Insert a correct email
TC5: Insert correct password (more thant 4 chars)
TC6: Insert incorrect password (wrong chars, short, too long)
TC7: Search for an existing item
TC8: Search for an inexisting item
TC9: Search for an item with a high number of results
TC10: Search for different patterns of malicious code like "DROP TABLE *"

## Question 2
"To: Laura
Hi Laura,
I think I cannot make much with the information you gave me. Please, could you clarify
 - The url to test
 - The final localization to go (Need I change from US to Spain?)
 - Do I need to filter search?
 
 Regards
"


## Question 3 Automated API testing
#### Approach
Purgomalum is a simple API but it could have some caveats. To test this API I would recommend to separate by method 
(contains, json, text and xml) and for each method define tests for each functionality (fill_char, add, fill_text..). 
Additionally, is a good idea to make specific test for encodings, as some character fails when API is called from linux 
console but not from MacosX console.

As a test matrix, I left a sample in project root (testmatrix_purgomalum.xlsx). Personally, I don't like excel test matrix
because is an OK documentation but requires maintenance. The best way I found to maintain an automatized set of test to text an API,
and also manage evolutions, is BDD(Behaviour Driven Development ). I left an example that uses cucumber + junit + gradle to execute test.  

#### Execution
In project root type:
```
./gradlew purgomalum_test
```

#### Technologies used:
Cucumber to test definition
Gradle for dependency management
JUnit as utility class for assertions. 


## Question 4
