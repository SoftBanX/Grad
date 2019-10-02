pipeline {
     agent any
     stages {
          stage("Compile") {
               steps {
                    checkout scm
                    sh "gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    checkout scm
                    sh "gradlew test"
               }
          }
     }
}
