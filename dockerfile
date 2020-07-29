FROM centos
MAINTAINER "bhargav"
RUN mkdir /opt/bhargav1
RUN yum install git -y
RUN cd /opt/bhargav1 && git clone https://github.com/p-bhargavendra/mproject.git
RUN yum install wget -y
RUN mkdir /opt/tomcat
RUN cd /opt/tomcat "tar -xvf apache-tomcat-10.0.0-M6-src.tar.gz"
EXPOSE 8080


