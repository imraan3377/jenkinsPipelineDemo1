pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven Home"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/imraan3377/jenkinsDemo1.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
            }
        stage('clean phase'){
            steps{
                sh "mvn clean"
            }
        }
        stage('compilation phase'){
            steps{
                sh "mvn compile"
            }
        }
        stage('Testing phase'){
            steps{
                sh "mvn test"
            }
        }

    }
}