pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/yusufsimsek07/DockerJenkins']]
                )
                bat 'mvn clean install'
            }
        }
        stage('Stop and Remove Existing Container') {
             steps {
                   script {

                               bat 'docker stop demo-container '
                               bat 'docker rm demo-container'
                               }
                           }
                    }

        stage('Build docker image'){
            steps{
                script{
                    docker.build("yusufsmsk:${env.BUILD_NUMBER}")
                }
            }
        }

    }

}