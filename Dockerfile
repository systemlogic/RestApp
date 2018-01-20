FROM ubuntu
MAINTAINER Kimbro Staken

RUN apt-get update && \
apt-get install software-properties-common && \
add-apt-repository ppa:webupd8team/java && \
apt-get update && apt install oracle-java8-installer  python mvn \
