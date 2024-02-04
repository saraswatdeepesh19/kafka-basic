# Bat file to active the zookeeper
.\bin\windows\zookeeper-server-start.bat config/zookeeper.properties
# Bat file to run kafka server
.\bin\windows\kafka-server-start.bat .\config\server.properties

# execute both the bat files parallely with one bat
@echo off

start cmd /c zookeeper-run.bat

start cmd /c kafka-starter-run.bat

echo Both batch files started in parallel.
