pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven"
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
                bat 'docker build -t gaganagarwal77/spe-calculator:latest .'
            }
        }
        stage('push docker image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-spe', usernameVariable: 'gaganagarwal77', passwordVariable: 'dckr_pat_GIJCZ92exoQLudph1E8OUSe2Aeg')]) {
                    bat 'docker login -u $DOCKER_USER -p $DOCKER_PASS  https://index.docker.io/v1/' 
                }
                bat 'docker push gaganagarwal77/spe-calculator:latest'
            }
        }
            
    }
}
