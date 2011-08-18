import org.codehaus.groovy.grails.commons.ApplicationHolder
import org.codehaus.groovy.runtime.typehandling.GroovyCastException
import org.neo4j.graphdb.GraphDatabaseService

beans = {
    def neo4jConfig = ApplicationHolder.application.config?.grails?.neo4j

    try {
        Class graphDatabaseServiceClass = neo4jConfig.type as Class
        assert GraphDatabaseService.isAssignableFrom(graphDatabaseServiceClass)
        // override the bean definition from neo4j plugin if 'type' is a valid clazz
        graphDatabaseService(graphDatabaseServiceClass, neo4jConfig.location, neo4jConfig.params) { bean ->
            bean.destroyMethod = "shutdown"
        }
    } catch (GroovyCastException e) {
        log.info "using ${ref('graphDatabaseService')} as configured from plugin"
    }

}
