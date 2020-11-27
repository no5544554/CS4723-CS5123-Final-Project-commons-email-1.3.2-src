pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                mvn -B -DskipTests clean package
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'    
                mvn test
            }    
        }    
        stage('Deploy') {
            steps {
                echo 'Deploying...'    
                echo 'gdp___'
            }    
        }
    }
}

