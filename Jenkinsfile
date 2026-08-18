pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'gradlew.bat clean build'
            }
        }

        stage('Test') {
            steps {
                bat 'gradlew.bat test'
            }
        }

        stage('Run Application') {
            steps {
                bat '''
                    if exist app.log del /F /Q app.log
                    start "Job Portal API" /B cmd /c "java -jar build\\libs\\Job-Portal-API-0.0.1-SNAPSHOT.jar --server.port=8081 > app.log 2>&1"
                    timeout /t 10 /nobreak
                '''
            }
        }

        stage('Health Check') {
            steps {
                bat '''
                    curl --fail http://localhost:8081/jobs
                '''
            }
        }
    }
}
