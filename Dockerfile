FROM java:8

COPY danmaku.jar /danmaku.jar

CMD ["--server.port=443"]

EXPOSE 443

ENTRYPOINT ["java","-jar","/danmaku.jar"]

# docker build -t danmaku .
# docker run -d -e TZ="Asia/Shanghai" -p 443:443 --name danmaku danmaku