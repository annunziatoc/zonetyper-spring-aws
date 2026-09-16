FROM node:20-slim as BUILD
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
CMD ["npm", "start"]

FROM nginx:alpine
COPY --from=build /app/dist /usr/share/nginx/html
EXPOSE 80



