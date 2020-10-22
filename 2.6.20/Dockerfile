FROM openjdk:8

RUN echo "deb http://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list

RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823

RUN apt-get update && apt-get install -y \
  unzip \
  bash \
  openssh-client \
  nodejs \
  git \
  ca-certificates \
  fontconfig \
  xvfb \
  libpango1.0-0 \
  libxss1 \
  fonts-liberation \
  libappindicator1 \
  xdg-utils \
  libgtk-3-0 \
  lsb-release \
  libnss3 \
  libappindicator3-1 \
  sbt=1.3.6 \
  libasound2 \
  libxtst6 \
  && rm -rf /var/lib/apt/lists/*

RUN ln -sf /usr/bin/nodejs /usr/bin/node

RUN cd /opt \
  && wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb \
  && dpkg -i google-chrome-stable_current_amd64.deb \
  && rm -f google-chrome-stable_current_amd64.deb

RUN cd /opt \
  && wget https://chromedriver.storage.googleapis.com/86.0.4240.22/chromedriver_linux64.zip \
  && unzip chromedriver_linux64.zip \
  && rm -f chromedriver_linux64.zip

COPY play /tmp/play

RUN cd /tmp/play && sbt test && rm -Rf /tmp/play

VOLUME /src
