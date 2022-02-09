package TestNG_Basics;

/*
TestNG [Test Next Generation]:
TestNG is one of the most widely used open source testing framework used in automation testing suite. TestNG provides you
full control over the test cases and the execution of the test cases. Due to this reason, TestNG is also known as a testing
framework.
1)  TestNG framework eliminates the limitations of the older framework by providing more powerful and flexible test cases
    with help of easy annotations, grouping, sequencing and parameterizing.
2)  If you want to run a test case A before that as a pre-request you need to run multiple test cases before you begin a
    test case A. You can set and map with the help of TestNG so that pre-request test cases run first and then only it will
    trigger test case A. In such way, you can control the test cases.
3)  Using TestNG, you can generate a proper report and you can easily come to know how many test cases are passed, failed, 
    and skipped. You can execute the failed test cases separately. Default Selenium tests do not generate a proper format
    for the test results. Using TestNG in Selenium, we can generate test results.
4)  Suppose, you have five test cases, one method is written for each test case (Assume that the program is written using
    the main method without using testNG). When you run this program first, three methods are executed successfully, and 
    the fourth method is failed. Then correct the errors present in the fourth method, now you want to run only fourth 
    method because first three methods are anyway executed successfully. This is not possible without using TestNG.
5)  TestNG in Selenium provides an option, i.e., testng-failed.xml file in test-output folder. If you want to run only 
    failed test cases means you run this XML file. It will execute only failed test cases.

key features of Selenium TestNG:
1)  Generate the report in a proper format including a number of test cases runs, the number of test cases passed, the number
    of test cases failed, and the number of test cases skipped.
2)  Multiple test cases can be grouped more easily by converting them into testng.xml file. In which you can make priorities
    which test case should be executed first.
3)  The same test case can be executed multiple times without loops just by using keyword called ‘invocation count'.
4)  Using testng, you can execute multiple test cases on multiple browsers, i.e., cross browser testing.
5)  TestNG framework can be easily integrated with tools like TestNG Maven, Jenkins, etc.
6)  Annotations used in the testing are very easy to understand ex: @BeforeMethod, @AfterMethod, @BeforeTest, @AfterTest
7)  WebDriver has no native mechanism for generating reports. TestNG can generate the report in a readable format.
8)  TestNG simplifies the way the tests are coded. There is no more need for a static main method in our tests. Sequence
    of actions is regulated by easy-to-understand annotations that do not require methods to be static.
    
Instead of creating test cases in different classes, we recommend you to use TestNG framework that allows you to create
multiple test cases in a single class. You can create multiple test cases with the help of @Test annotation.

Advantages of TestNG over JUnit: There are three major advantages of TestNG over JUnit:
1) Annotations are easier to understand
2) Test cases can be grouped more easily
3) Parallel testing is possible

XML file in TestNG: Xml file is the heart of TestNG framework.You can trigger all the test cases from a single file known
as xml file. 
testng.xml file has the numerous uses as listed below:
1) Test cases are executed in groups.
2) Test methods can be included or excluded in the execution.
3) Execution of multiple test cases from multiple java class files can be triggered.
4) Comprises names of the folder, class, method.
5) Capable of triggering parallel execution.
6) Test methods belonging to groups can be included or excluded in the execution.

testng.xml Structure: 
[suite-> Test name-> Classes-> Methods (Test cases)]
suite is at the higher hierarchy in TestNG. Inside it, you have to define the test name folder. This test name folder is
the name of the folder. For example, In a loan company, there are three different types of modules such as personal loan, 
home loan and car loan and each module contain its own test cases. All these test cases are defined in the test name folder.

Let's consider personal loan module [Test name], it comprises 3 java class files (module1, module2, module3), each module 
having 3 methods (test cases) in it so testng.xml file format for this will be-->

<?xml version="1.0" encoding="UTF-8"?>  
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">  
<suite name="loan_department">  
  <test name="Personal_loan">  
    <classes>  
      <class name="TestNG.module1"/>  
      <class name="TestNG.module2"/>
      <class name="TestNG.module3"/> 
    </classes>  
  </test> <!-- Test -->  
</suite> <!-- Suite -->  

TestNG is the package name and module1, module2 and module3 are the classes. like this, we can also create the other 
modules (home loan and car loan) [Test name] and incorporate their test cases in this suite. */
 
