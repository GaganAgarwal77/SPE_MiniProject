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
                bat 'docker login -u gaganagarwal77 -p dckr_pat_GIJCZ92exoQLudph1E8OUSe2Aeg https://index.docker.io/v1/'
                bat 'docker push gaganagarwal77/spe-calculator:latest'
            }
        }
        stage('Clean Up') {
            steps {
                bat "docker rmi gaganagarwal77/spe-calculator:latest" 
            }
        } 
        
        // stage('Ansible pull image') {
        //     steps {
        //         ansiblePlaybook colorized: true,
        //         installation: 'Ansible',
        //         inventory: 'inventory',
        //         playbook: 'playbook.yml'
        //     }
        // }
    }
}
