grails {
    neo4j {
        type = "embedded"
        location = "data/neo4j"
        params = [:]

        type = "ha"
        location = "data/neo4j_" + System.properties['ha.machine_id']
        params = [
                'ha.machine_id': System.properties['ha.machine_id'],
                'ha.zoo_keeper_servers': 'localhost:2181,localhost:2182,localhost:2183'
        ]

    }
}
/*
dataSource {
    pooled = true
    driverClassName = "org.hsqldb.jdbcDriver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            url = "jdbc:hsqldb:mem:devDB"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:mem:testDb"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:file:prodDb;shutdown=true"
        }
    }
}
*/