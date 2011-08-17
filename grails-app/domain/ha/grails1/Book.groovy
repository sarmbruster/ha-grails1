package ha.grails1

class Book {
    static mapWith = "neo4j"

    String title
    String author

    static constraints = {
        title(blank: false)
        author(blank: false)
    }
}
