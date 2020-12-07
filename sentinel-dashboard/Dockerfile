FROM registry.cn-hangzhou.aliyuncs.com/dragonwell/dragonwell8:8.4.4-GA_alpine_x86_64_8u262-b10_slim
MAINTAINER wangrui

ENV TZ=Asia/Shanghai

VOLUME /tmp

COPY target/*.jar app.jar

RUN echo $(date) > /image_built_at

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]