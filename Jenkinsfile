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

        stage('Deploy backend'){
            steps{
                sh '''
                    cp cicd-backend/target/*.jar /opt/cicd-app/app.jar

                    pkill -f "java -jar /opt/cicd-app/app.jar" || true

                    nohup java -jar /opt/cicd-app/app.jar \
                        > /opt/cicd-app/app.log 2>&1 &
                '''
            }
        }
    }


}