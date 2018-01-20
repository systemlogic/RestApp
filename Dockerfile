FROM ubuntu
MAINTAINER Kimbro Staken

RUN echo "0.2" > /version
apt update
apt install java python mvn
