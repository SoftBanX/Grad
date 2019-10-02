pipeline {
     agent any
     stages {
          stage("Compile") {
               steps {
                    checkout scm
                    sh "./app/gradlew build"
               }
          }
          stage("Unit test") {
               steps {
                    checkout scm
                    sh "cd app"
                    sh "./app/gradlew test"
               }
          }
     }
}
