# Projet 
    ## (D) .mvn
    ## (D) .vscode
    ## (D) src\main
                (D) java
                       (D) com\highfive\demo (groupeId : com.highfive | artefactd : demo) 
                                            (D) config
                                            (D) domain (
                                                fichier qui contient les entités. les entités sont des classes java qui définissent les relations entre les différentes tables de notre bdd. NB: on ne crée pas d'entités pour les tables relationnelles. de plus, pour la relation ManyToMany, pas besoin de la définir dans les deux tables)
                                            (D) repository (
                                                permettent de faire le pont entre les entités et les services
                                            )
                                            (F) NomProjetApplication.java (fichier qui contient la méthode main)
                                            (F) HelloWorldService.java
                (D) ressources
    ## (D) target
        (F) .gitignore
        (F) mvnw
        (F) mvnw.cmd
        (F) pom.xml

