# pulsar-flakes
Pulsar Flaky test report details and [reporting script](./reporting/src/main/groovy).

You can find the [summary report in a Google sheet](https://docs.google.com/spreadsheets/d/1gtu-XrLumjBFPk9kDKcJOQfxsvIE2EiuZO7IB7ab6q0/edit#gid=1446387426).

[Search for Pulsar flaky tests](https://github.com/apache/pulsar/issues?q=is%3Aopen+flaky+sort%3Aupdated-desc).

## Generating a new report

1. Fork this repository
2. Set the following secrets in your forked repository:
    * `PULSAR_TOKEN` - A GitHub token with workflow access to the Apache Pulsar repository. Requires Apache Pulsar committer access.
    * `PULSAR_TOKEN_USER` - The Github username of the user that owns the token.
3. Navigate to the `Actions` tab in your forked repository
4. Select the `Run Report` workflow
5. Click `Run workflow` setting the desired date range
6. The report will be generated in the root directory of the repository

## Troubleshooting

If the script fails with `Forbidden` error it's likely that you hit the GitHub API rate limit. It's suggested to reduce the date range to a smaller period of time (7 days usually works)  and wait 1 hour to let Github reset your limits. Another possible reason is that the token doesn't have workflow access for `apache/pulsar` repository.
