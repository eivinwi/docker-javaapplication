## Docker javaapplication

Java-applikasjon for bruk under Docker workshops.

Prosjektet inneholder både mapper med filer relatert til oppgaver i workshoppen, samt en liten Java-basert serverapplikasjon
som skal brukes i enkelte av oppgavene

### Bygge og kjøre servere-programmet:
Denne kan bygges og kjøres med kommandoene:
```
mvn clean install
java -jar target/docker-client-1.0-SNAPSHOT.jar
```

Applikasjonen starter opp SpringBoot, leser konfigurasjonsfilen 'team.properties'
og starter opp et endpoint på '/test'. For å teste at applikasjonen kjører som den skal kan man
gå til [http://localhost/8080:test](http://localhost/8080:test).
Merk at applikasjonen vil feile dersom noe allerede kjører på 8080
(kan byttes ved å sende med '-Dserver.port=<port>' som parameter ved kjøring).