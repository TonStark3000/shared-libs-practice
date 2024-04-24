def call(Credentials, ip){
   sshagent(["${Credentials}"]) {
                        sh "scp -o StrictHostKeyChecking=no target/myweb.war  ec2-user@${ip}:/opt/tomcat-9/webapps/" 
                        
   }
}
 
