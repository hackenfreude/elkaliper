FROM debian:wheezy

RUN apt-get update

RUN apt-get install -y curl

COPY rabbitset about /bin/

RUN chmod -R +x /bin

CMD [ "about" ]
