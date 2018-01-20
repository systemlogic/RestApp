FROM ubuntu
MAINTAINER Kimbro Staken

RUN  apt-get  update  && \
echo "Y" | apt-get install software-properties-common && \
add-apt-repository ppa:webupd8team/java && \
apt-get update -y && apt install oracle-java8-installer  python maven \
