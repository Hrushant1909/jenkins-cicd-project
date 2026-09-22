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
    }

}