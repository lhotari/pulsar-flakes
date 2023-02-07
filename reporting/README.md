# pulsar-test-reporting

Flaky test reporting for Apache Pulsar

### Reporting solution

The reporting gather CI exceptions using the GitHub Actions APIs.

The scripts are written in Groovy. There are 2 scripts: [download_test_exceptions.groovy](src/main/groovy/download_test_exceptions.groovy) to download logs from builds and [format_flaky_test_issue.groovy](src/main/groovy/format_flaky_test_issue.groovy) to create MarkDown files and a statistics files report_counts.json and report_counts.csv . The report_counts.csv file can be imported to Google Sheets.

#### How are flakes detected?

Evaluates Pull Requests that were merged. The logs will be checked for builds where the SHA of the head of the PR
matches the SHA which got merged. This ensures that all found exceptions are real flakes since no changes
were made to the PR to make the tests pass later so that the PR was merged successfully.

#### Report archive

https://github.com/nicoloboschi/pulsar-flakes

### Setting up credentials

[download_test_exceptions.groovy](src/main/groovy/download_test_exceptions.groovy) requires a GitHub token and the value of the "Cookie" header in `~/.github_download_tokens.json` file. The GitHub token doesn't require any special permissions / scopes. 

### Running the script

```bash
./gradlew runReport formatReport
```





