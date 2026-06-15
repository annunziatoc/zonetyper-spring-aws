# Zonetyper
A competitive typing application with real-time WPM tracking, leaderboards, and detailed session analytics.

## Tech Stack
- **Frontend:** React 19, TypeScript, Framer Motion, React Router
- **Backend:** Java 21, Spring Boot 3
- **Database:** PostgreSQL
- **Infrastructure:** AWS (Elastic Beanstalk, RDS, S3, CloudFront, ECR), Docker, GitHub Actions

## Getting Started

### Prerequisites
- Node.js 20+
- Java 21+
- Docker / Docker Compose
- PostgreSQL (or use the provided Docker Compose setup)

### Local Development
```bash
# Clone the repo
git clone https://github.com/annunziatoc/zonetyper.git
cd zonetyper

# Start the database
docker compose up -d db

# Run the API
cd api
./mvnw spring-boot:run

# Run the frontend
cd ../client
npm install
npm run dev
```

The app will be available at `http://localhost:5173` and the API at `http://localhost:8080`.

## Features
- Typing tests with real-time WPM and accuracy tracking
- Session history and WPM trend charts
- Leaderboard stats
- User accounts and personal stats *(in development)*

## Deployment
CI/CD via GitHub Actions. Pushes to `main` build and deploy to AWS automatically.