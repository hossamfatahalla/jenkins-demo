def call(){
pipeline 
     agent any
    parameters {
        booleanParam(name:'project', defaultValue: true, description:'this paramater help you to know project name')
        choice(name: 'namespace', choices:['dev','prod','stage'], description: '' ) 
    }

    stages {
        stage('check') {
            steps {
                echo "checking your code"
                echo "${params.namespace}"
               
            }
        }
    }
}