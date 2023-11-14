pipeline {
    environment {
        registry = "mrunmayee96/hw3final"
        registryCredential = 'dockerhub'
        dockerImage = ''
        kubeconfig = "/home/ubuntu/.kube/config"  
        deploymentName = "swe642-hw2-deployment"  
    }
    agent any
    
    stages {
        stage('Cloning Git') {
            steps {
                git 'https://github.com/MrunmayeeBhagwat/swe645homework3.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker buildx create --use'
                    sh 'docker buildx inspect --bootstrap'
                    dockerImage = docker.build("${registry}:${BUILD_NUMBER}", "--platform linux/amd64,linux/arm64 .")
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                // Add your testing steps here
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
                // You can add any pre-deployment steps here
            }
        }

        stage('Deploy Image') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) { 
                        dockerImage.push()
                    }
                }
            }
        }

        stage('Redeploy') {
            steps {
                script {
                    env.KUBECONFIG = '/home/ubuntu/.kube/config'
                    sh("kubectl --kubeconfig=${env.KUBECONFIG} set image deployment/${deploymentName} container-0=${registry}:${BUILD_NUMBER} -n default")
                }           
            }
        }

        stage('Remove Unused Docker Image') {
            steps {
                sh "docker rmi ${registry}:${BUILD_NUMBER}"
            }
        }
    }
}
