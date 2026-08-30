FROM maven:3.9.6-eclipse-temurin-17

RUN apt-get update && \
    apt-get install -y wget gnupg ca-certificates && \
    wget -q -O /tmp/google-chrome.deb https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb && \
    apt-get install -y /tmp/google-chrome.deb && \
    rm -f /tmp/google-chrome.deb && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY pom.xml .
COPY src ./src

CMD ["mvn", "test"]