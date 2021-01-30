IMAGE='microservice'
VERSION='v1.0.0'

mvn clean package
# shellcheck disable=SC2046
eval $(minikube docker-env)
docker build -t monsieur486/$IMAGE:$VERSION .
