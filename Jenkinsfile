pipeline{
    agent any

    stages{
        stage('Backend build and test'){
            steps{
                dir('cicd-backend'){
                    sh './mvnw clean package'
                }
            }
        }

        stage('Frontend build'){
            steps{
                dir('frontend'){
                    sh 'npm ci'
                    sh 'npm run build'
                }
            }
        }

        stage('Archive backend artifact'){
            steps{
                archiveArtifacts artifacts: 'cicd-backend/target/*.jar', fingerprint: true
            }
        }
    }


}