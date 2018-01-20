FROM ubuntu
MAINTAINER Kimbro Staken

RUN echo "0.2" > /version
sudo apt-get update
sudo apt-get install java python mvn
