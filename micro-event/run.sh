 #!/usr/bin/env bash

set -e

# Build the project and docker images
mvn clean install

# Remove existing containers
docker-compose stop
docker-compose rm -f

docker-compose up -d mysql

sleep 150

# Start the discovery service next and wait
docker-compose up -d discovery-service

while [ -z ${DISCOVERY_SERVICE_READY} ]; do
  echo "Waiting for discovery service..."
  if [ "$(curl --silent localhost:8761/actuator/health 2>&1 | grep -q '\"status\":\"UP\"'; echo $?)" = 0 ]; then
      DISCOVERY_SERVICE_READY=true;
  fi
  sleep 2
done


docker-compose up -d customer-service

sleep 50

docker-compose up -d edge-service







# Attach to the log output of the cluster
docker-compose logs