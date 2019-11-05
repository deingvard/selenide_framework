## Quick Setup Instruction

### Configuration

For safari browser -> need enable option "Develop/Allow remote automation"
For firefox browser -> Note that with this release the minimum recommended Firefox version
                       has changed to Firefox ≥60.
                       
List of Chromium Command Line Switches -> https://peter.sh/experiments/chromium-command-line-switches/ 

### First Run
1. Go to the project folder `cd <project_folder>`

2. Start test execution `mvn clean test`

### Test Results

Test results will be collected into the following folders:

* build/reports/tests/xxxxxxxxxxxxx.x.png will contain failed screenshots
* target/surefire-reports folder will contain testNG report 