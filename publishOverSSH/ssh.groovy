pipeline {
    agent any
    stages {
        stage('publish') {
            steps {
                sh 'scp /tmp/test.test jalonso@192.168.20.100:/tmp'
                sh 'nohup ssh jalonso@192.168.20.100'
                sh 'cd /tmp'
                sh 'touch prueba'
            }
        }

    }
}