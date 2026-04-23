def call() {
    stage('build using shared library') {
        echo "running maven build from shared library..."
	sh 'mvn clean package'

    }
}
