# Comando para mandar el codigo a Sonar.
Utilizamos analizador de SonarQube que trabaja con Maven
Hay que introducir algunos parámetros de configuracion.
Hay que introducir el puerto, el token de acceso.
mvn sonar:sonar -Dsonar.login=squ_f4af30e61fbe9672a833298e14e749e1dade7d78 -Dsonar.host.url=http://localhost:8080

