pipeline {
    agent any
    environment {
        registry = "arshithpakalapati/studentsurvey_gmu"
        registryCredential = 'Docker'
        Git_repository = ''
    }
    stages {
        stage('Preprocessing') {
            steps {
                script {
                    env.date = new Date().format("yyyyMMdd-HHmmss")
                    git url:Git_repository
                    sh 'mvn clean package'
                }
            }
        }
        stage('Building') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        def image = docker.build("${registry}:${env.date}", ". --no-cache --platform=linux/amd64")
                    }
                }
            }
        }
        stage('Pushing') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        def image = docker.image("${registry}:${env.date}")
                        image.push()
                    }
                }
            }
        }
        stage('Deploying') {
            steps {
                script {
                    sh "kubectl set image deployment/ss container-0=${registry}:${env.date}"
                    sh "kubectl set image deployment/lb container-0=${registry}:${env.date}"
                }
            }
        }
    }
    post {
        always {
            sh 'docker logout'
            echo 'success'
        }
        failure {echo 'failure'}
    }
}
