# Patrones Adapter y Singleton: POO frente a AOP

Proyecto académico en Java 17, Maven y AspectJ (compilación con weaving).

## Requisitos
- JDK 17 o posterior compatible con la versión de AspectJ usada.
- Maven 3.9.x (o versión compatible).
- Conexión a Maven Central para descargar dependencias la primera vez.

## Ejecutar
```bash
mvn clean test
mvn exec:java -Dexec.mainClass=edu.espol.patrones.Demo
```

## Organización
- `adapter/poo`: interfaz, servicio incompatible y adaptador por composición.
- `adapter/aop`: servicio legacy, interfaz y `AdaptadorAspect.aj` con `declare parents` e introducción de método.
- `singleton/poo`: instancia de acceso global dentro de la propia clase.
- `singleton/aop`: aspecto `SingletonAspect.aj` controla instancia e introduce `getInstance()`.
- `uml`: cuatro diagramas en PlantUML.
- `src/test`: cinco verificaciones automatizadas.

## Precisión técnica
- `SingletonAspect.aj` gestiona una única instancia *por classloader* dentro de la JVM. No impide otras instancias creadas por mecanismos como reflexión maliciosa o serialización manual.
- El constructor privado forma parte de la clase base AOP; el aspecto introduce el acceso estático y es el propietario de la instancia. Es una variante AOP deliberadamente conservadora y segura.
- El adaptador AOP requiere weaving AspectJ; `javac` sin weaving no reconoce los miembros introducidos.
- En UML, las relaciones «introduced» pertenecen al resultado del weaving, no al código Java original.

## Publicación
Crear repositorio público GitHub, hacer commit por rama, fusionar por pull requests y sustituir esta línea por el enlace real:
**Repositorio:** PENDIENTE_DE_COMPLETAR

## Referencias
- https://refactoring.guru/design-patterns/adapter
- https://refactoring.guru/design-patterns/singleton
- https://eclipse.dev/aspectj/doc/latest/progguide/progguide.html
- https://dev-aspectj.github.io/aspectj-maven-plugin/
