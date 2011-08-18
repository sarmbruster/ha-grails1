// this is an example for an externalized config of a grails application
grails {
    neo4j {

//        type = "embedded"
//        location = "data/neo4j"
//        params = [:]

//        type = "ha"
//        location = "data/neo4j_" + System.properties['ha.machine_id']
//        params = [
//                'ha.machine_id': System.properties['ha.machine_id'],
//                'ha.zoo_keeper_servers': 'localhost:2181,localhost:2182,localhost:2183'
//        ]

        type = 'org.neo4j.wrap.workaround.HABugWorkaroundGraphDatabaseWrapper'
        location = "/home/stefan/Programming/mindblast/neoha/ha-grails1/data/neo4j"
        params = [
                'ha.machine_id': '1',
                'ha.zoo_keeper_servers': 'localhost:2181,localhost:2182,localhost:2183'
        ]
    }
}