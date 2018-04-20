pipeline {
    agent any
    stages {
        stage('publish') {
            steps {
                sh 'scp /tmp/test.test jalonso@192.168.20.100:/tmp'
            }
        }

    }
}