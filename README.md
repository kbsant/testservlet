# Writing a bare-bones servlet 2/3 project

These are notes on writing a bare-bones project targeting the servlet 2/3 api.

I've tested these steps on jetty 9 in server mode, but it should be container-agnostic.

# Dependencies

Use the servlet api: `javax.servlet:javax.servlet-api`

# Writing web xml

Most tutorials have got dependencies on other frameworks, so I referred to the official documentation trail.
However, the official docs are quite verbose imho, so I stripped it to a minimum.

Reference links change constantly, so please search for:

    java web app deployment descriptor tutorial

# Building a war file

Include the maven war plugin in the build section of `pom.xml`.
Follow the directory structure from the maven war plugin docs.
<https://maven.apache.org/plugins/maven-war-plugin/usage.html>

Excerpt from the documentation -- source structure:

```
|-- pom.xml
`-- src
    `-- main
        |-- java
        |   `-- com
        |       `-- example
        |           `-- projects
        |               `-- SampleAction.java
        |-- resources
        |   `-- images
        |       `-- sampleimage.jpg
        `-- webapp
        |-- WEB-INF
        |   `-- web.xml
        |-- index.jsp
        `-- jsp
        `-- websource.jsp
```
Build the package using: `mvn clean package`

# Deployment

Copy the war file from the target/ directory
to the webapps/ directory of the container,
for example: `${JETTY_HOME}/webapps/`

In this example, the context root is the servlet's name, `testservlet`, and `<servlet-mapping>` is set to `hello/`,
so if jetty or tomcat is on the default port, then
the web app is accessible at: `http://localhost:8080/testservlet/hello`

# License of this documentation

Public domain.
    