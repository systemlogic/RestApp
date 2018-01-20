FROM ubuntu
MAINTAINER Harish Arora

RUN  apt-get  update  && \
echo "Y" | apt-get install software-properties-common && \
echo "Y" | apt-get update && \
echo "Y" | apt python maven

#RUN cd ~/systemlogic/RestApp && mvn clean install
