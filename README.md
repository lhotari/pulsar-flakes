# pulsar-flakes
Pulsar Flaky test report details

You can find the [summary report in a Google sheet](https://docs.google.com/spreadsheets/d/106QKMFfdLa-VSFGlggs35eMw-ZnjMUjMhA3KVBjzHLI/edit#gid=944956527).

There will be a markdown file that is named after the test name. For example, org.apache.pulsar.tests.integration.functions.PulsarFunctionsProcessTest.testJavaExclamationTopicPatternFunction is at [2021-03-16-to-2021-03-24/reports/1616518616962/org.apache.pulsar.tests.integration.functions.PulsarFunctionsProcessTest.testJavaExclamationTopicPatternFunction.md](2021-03-16-to-2021-03-24/reports/1616518616962/org.apache.pulsar.tests.integration.functions.PulsarFunctionsProcessTest.testJavaExclamationTopicPatternFunction.md)
Navigating to the file can be done with the file search feature by clicking `t` on the keyboard and then typing the test name.

## Generate a new report
1. Fork this repository
2. Set the following secrets in your forked repository:
    * `PULSAR_TOKEN` - A GitHub token with read access to the Apache Pulsar repository
    * `PULSAR_TOKEN_USER` - The Github username of the user that owns the token
3. Navigate to the `Actions` tab in your forked repository
4. Select the `Run Report` workflow
5. Click `Run workflow` setting the desired date range
6. The report will be generated in the root directory of the repository

## Troubleshooting
If the script fails with `Forbidden` error it's likely that your user just hit the GitHub API rate limit. It's suggested to reduce the date range to a smaller period of time (7 days usually works)  and wait 1 hour to let Github reset your limits. 