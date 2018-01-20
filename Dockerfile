FROM ubuntu
MAINTAINER Harish Arora

#RUN  apt-get  update  && \
#echo "Y" | apt-get install software-properties-common && \
#echo "Y" | add-apt-repository ppa:webupd8team/java && \
#echo "Y" | apt-get update && \
#echo "Y" | apt install oracle-java8-installer python maven

RUN maven clean install
