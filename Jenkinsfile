pipeline {
    agent any

    tools {
        maven 'Maven_3.8.1'
    }

    stages {
        stage('build') {
            steps {
              withMaven {
                 sh "mvn clean verify"
              }
            }
        }
    }
}
