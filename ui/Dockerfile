FROM node:10.13-alpine
WORKDIR /var/www/ui
COPY package.json ./
COPY package-lock.json ./
RUN npm ci
COPY . .
CMD ["npx", "react-scripts", "start"]