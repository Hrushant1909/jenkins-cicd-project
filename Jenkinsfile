pipeline{
    agent any

    stages{
        stage('Backend build and test'){
            steps{
                dir('cicd-backend'){
                    sh './mvnw clean test'
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
    }


}