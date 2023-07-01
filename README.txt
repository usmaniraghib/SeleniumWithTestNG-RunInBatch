# DOWNLOAD JENKINS.
# INSTALL  JENKINS.
# CONFIGURE JENKINS.
# Create Selenium Script.
# Create Batch File.
# Execute Batch Job

set classpath=C:\Users\raghi\automation-workspace\SeleniumWithTestNGProject\bin;C:\Users\raghi\automation-workspace\SeleniumWithTestNGProject\lib\*;
java org.testng.TestNG testng.xml

## Batch File Command
java -cp bin;lib/* org.testng.TestNG testng.xml