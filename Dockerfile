FROM ubuntu
MAINTAINER Kimbro Staken

RUN echo "0.2" > /version
apt-get update
apt-get install java python mvn
