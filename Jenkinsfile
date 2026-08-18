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
                bat 'start "Job Portal API" /B java -jar build\\libs\\Job-Portal-API-0.0.1-SNAPSHOT.jar --server.port=8081'
            }
        }

    }
}
