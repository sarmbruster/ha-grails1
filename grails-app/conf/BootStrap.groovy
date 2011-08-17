import org.neo4j.graphdb.GraphDatabaseService
// import org.neo4j.server.WrappingNeoServerBootstrapper

class BootStrap {
    GraphDatabaseService graphDatabaseService
//    WrappingNeoServerBootstrapper bootstrapper

    def init = { servletContext ->
//        bootstrapper = new WrappingNeoServerBootstrapper(graphDatabaseService)
//        bootstrapper.start()
    }

    def destroy = {
//        bootstrapper.stop()
    }
}
