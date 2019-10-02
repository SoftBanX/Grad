pipeline {
     agent any
     stages {
          stage("Compile") {
               steps {
                    checkout scm
                    sh "./app/gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    checkout scm
                    sh "./app/gradlew test"
               }
          }
     }
}
