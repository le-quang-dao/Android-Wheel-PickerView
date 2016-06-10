#!/usr/bin/env bash

NOTE_FILE_NAME="release_notes.txt"
rm "$NOTE_FILE_NAME"

#Get last pull request
LAST_PULL_REQUEST_ID="$(git log -1 --merges --pretty=format:%s | cut -d "#" -f2 | cut -d " " -f1)"
echo "Pull request id: ${LAST_PULL_REQUEST_ID}"

#Get last pull request url
REQUEST_URL="https://api.github.com/repos/AsianTechInc/Travel-Heroes_Android/pulls/${LAST_PULL_REQUEST_ID}"
echo "$REQUEST_URL"

#Request api
curl -H "Authorization: token $GITHUB_ACCESS_TOKEN" "${REQUEST_URL}" \
| python -c 'import json,sys;obj=json.load(sys.stdin);print "Owner: "+obj["user"]["login"];print "Reviewer: "+("No assignee",obj["assignee"]["login"])[obj["assignee"] is not None];print obj["body"]' > "$NOTE_FILE_NAME"
#Upload fabric beta
./gradlew crashlyticsUploadDistributionDebug
