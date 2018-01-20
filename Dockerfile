FROM ubuntu
MAINTAINER Kimbro Staken

RUN add-apt-repository ppa:webupd8team/java && \
apt-add-repository universe && \
apt-get update && apt install oracle-java8-installer  python mvn \
