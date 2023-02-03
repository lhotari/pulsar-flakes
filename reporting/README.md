# pulsar-test-reporting

Flaky test reporting for Apache Pulsar

### Reporting solution

I have some scripts to gather exceptions using the GitHub Actions APIs.

The scripts are written in Groovy. There are 2 scripts: [download_test_exceptions.groovy](src/main/groovy/download_test_exceptions.groovy) to download logs from builds and [format_flaky_test_issue.groovy](src/main/groovy/format_flaky_test_issue.groovy) to create MarkDown files and a statistics files report_counts.json and report_counts.csv . The report_counts.csv file can be imported to Google Sheets.

There are quite a few gotchas with the GitHub Actions API to get the information about builds and re-runs. 
The scripts require a GitHub token and also a GitHub cookie from the browser. The token doesn't need any special claims. 
Some API methods are not available for anonymous access and the rate limiting is really constrained for public API calls. 
The GitHub cookie from the browser is a workaround some gaps in the GitHub Actions API. 
Some operations are only available via the UI, but by copying the GitHub cookies from the browser, it's possible to access the same undocumented APIs that the UI uses. 
This is used to access the logs for the builds.

This current script cannot be automated because of the hacks for downloading the logs with the cookie. However it's possible that an API token created with an account that has write access to a GitHub repository might be able to download the logs via APIs. I created the script when I wasn't yet a committer and I haven't checked if I would now be able to use the official APIs.
I'm not publicly sharing the current script version since it uses a hack to get access to the build logs using the same API as the browser UI does. This might be against GitHub policies.
I made a few different experiments for creating statistics about the flaky tests and this approach that simply downloads and parses build logs and creates stats of the exceptions found in the logs seems to be what works the best.

#### How are flakes detected?

Evaluates Pull Requests that were merged. The logs will be checked for builds where the SHA of the head of the PR
matches the SHA which got merged. This ensures that all found exceptions are real flakes since no changes
were made to the PR to make the tests pass later so that the PR was merged successfully.

#### Report archive

https://github.com/lhotari/pulsar-flakes

### Setting up credentials

[download_test_exceptions.groovy](src/main/groovy/download_test_exceptions.groovy) requires a GitHub token and the value of the "Cookie" header in `~/.github_download_tokens.json` file. The GitHub token doesn't require any special permissions / scopes. 

Instructions:
1. Run the script once. That will create a template for `~/.github_download_tokens.json`.
2. Edit the user name and token in the file.
3. Open developer console in the browser. 
4. Go to https://github.com when the developer console is active.
5. In the network tab of developer console, locate the request.
6. View the headers and locate the "cookie:" header in the request and right-click "Copy value"
7. Update the GitHub cookie with this command (to ensure that the cookie value gets properly escaped in json):
   ```bash
   # on macos, installs "sponge" which is used in the following command
   brew install moreutils
   jq --arg cookie 'paste cookie value here' '.githubCookie=$cookie' ~/.github_download_tokens.json | sponge ~/.github_download_tokens.json
   ```
   

### Setting up the environment for running the script

Install groovy 3.0.x with sdkman: 
```bash
sdk i groovy 3.0.11
```

### Running the script

```bash
# switch to use groovy 3.0.x
sdk u groovy 3.0.11
# rename possible existing ~/pulsar-flakes directory
mv ~/pulsar-flakes ~/pulsar-flakes-pre-`date -I`
# run the download_test_exceptions.groovy script
groovy src/main/download_test_exceptions.groovy
# run the format_flay_test_issue.groovy script
groovy src/main/format_flay_test_issue.groovy
```




