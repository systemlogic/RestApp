FROM ubuntu
MAINTAINER Kimbro Staken

RUN  apt-get  update  && \
echo "Y" | apt-get install software-properties-common && \
echo "Y" | add-apt-repository ppa:webupd8team/java && \
apt-get update && apt install oracle-java8-installer  python maven \
