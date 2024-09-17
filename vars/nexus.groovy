def call(){
  nexusArtifactUploader artifacts: [[artifactId: 'my-web-app', classifier: '', file: 'target/my-web-app.war', type: 'war']], credentialsId: 'Nexus-credentials', groupId: 'Ashokit.in', nexusUrl: '13.201.186.54:8081/', nexusVersion: 'nexus3', protocol: 'http', repository: 'Artifact_Snapshot', version: '1.1-SNAPSHOT'
}
