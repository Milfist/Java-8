pipeline {
    agent any
    tools { 
        maven 'Maven_3.8.1' 
        jdk 'JDK16' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

        stage ('Version') {
            steps {
                sh 'mvn -v'
                sh 'java -version'
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn install'
            }
        }
    }
}
