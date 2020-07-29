FROM mhart/alpine-node:latest

MAINTAINER Your Name <you@example.com>

# Create app directory
RUN mkdir -p /my-project
WORKDIR /my-project

# Install app dependencies
COPY package.json /my-project
RUN npm install pm2 -g
RUN npm install

# Bundle app source
COPY target/release/my-project.js /my-project/my-project.js
COPY public /my-project/public

ENV HOST 0.0.0.0

EXPOSE 3000
CMD [ "pm2-docker", "/my-project/my-project.js" ]
