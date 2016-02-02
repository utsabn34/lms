databaseChangeLog = {

    changeSet(author: "utsabn34 (generated)", id: "1453859647895-1") {
        createIndex(indexName: "FK_it77eq964jhfqtu54081ebtio", tableName: "user_role") {
            column(name: "role_id")
        }
    }
}
