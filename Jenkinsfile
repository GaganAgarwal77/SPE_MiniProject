pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven"
    }
    environment
    {
        registry = "gaganagarwal77/spe-calculator"
        registryCredential = "docker-spe"
        dockerImage = ""
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', credentialsId: '20323', url: 'https://github.com/GaganAgarwal77/SPE_MiniProject.git'
                // Run Maven on a Unix agent.
                bat "mvn clean install"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }

        stage('build docker image') {
            steps {
                script {
                    dockerImage = docker.build(registry + ":latest")
                }
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }   
    }
}
