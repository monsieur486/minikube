IMAGE='service-dummy'
VERSION='1.1.5'

mvn clean package
# shellcheck disable=SC2046
eval $(minikube docker-env)
docker build -t $IMAGE:$VERSION .
