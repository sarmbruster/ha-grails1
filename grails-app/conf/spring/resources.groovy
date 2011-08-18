import org.codehaus.groovy.grails.commons.ApplicationHolder

beans = {
    def neo4jConfig = ApplicationHolder.application.config?.grails?.neo4j

    if (neo4jConfig.type == 'ha-workaround') {
        // override the bean definition from neo4j plugin
        graphDatabaseService(org.neo4j.wrap.workaround.HABugWorkaroundGraphDatabaseWrapper, neo4jConfig.location, neo4jConfig.params) { bean ->
            bean.destroyMethod = "shutdown"
        }
    }

}
