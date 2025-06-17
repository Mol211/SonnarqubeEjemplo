pipeline {
    agent any
    tools {
        maven 'MiMaven'
    }

    stages {
        stage('Compilación y pruebas unitarias') {
            steps {
                sh 'mvn clean verify'
            }
        }
        stage('Lanzar el analisis de sonarqube') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
        stage('Esperar la respuesta de SonarQube') {
            steps {
                timeout(time: 1,unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}