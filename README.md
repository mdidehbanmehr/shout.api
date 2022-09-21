# shout.api
ShoutBox
Need to delete the tmp file and build the docker images/containars from scratch to see the new schema in pg4admin:

Purge data on docker desktop

$./gradlew buildFatJar

$docker -t build shout.api

$docker compose --project-directory shoutbox/shout.api up
