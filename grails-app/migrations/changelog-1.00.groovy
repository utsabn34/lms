databaseChangeLog = {

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-1") {
        createTable(tableName: "department") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "is_active", type: "BIT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-2") {
        createTable(tableName: "designation") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "is_active", type: "BIT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-3") {
        createTable(tableName: "employee") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true")
            }

            column(name: "avatar_url", type: "VARCHAR(255)")

            column(name: "date_of_birth", type: "DATETIME")

            column(name: "department_id", type: "BIGINT")

            column(name: "designation_id", type: "BIGINT")

            column(name: "email", type: "VARCHAR(255)")

            column(name: "employee_id", type: "VARCHAR(255)")

            column(name: "employee_status", type: "VARCHAR(255)")

            column(name: "first_name", type: "VARCHAR(255)")

            column(name: "gender", type: "VARCHAR(255)")

            column(name: "home_phone", type: "BIGINT")

            column(name: "is_active", type: "BIT")

            column(name: "joined_date", type: "DATETIME")

            column(name: "last_name", type: "VARCHAR(255)")

            column(name: "maritial_status", type: "VARCHAR(255)")

            column(name: "middle_name", type: "VARCHAR(255)")

            column(name: "mobile_phone", type: "BIGINT")

            column(name: "permanent_address", type: "VARCHAR(255)")

            column(name: "resigned_date", type: "DATETIME")

            column(name: "temporary_address", type: "VARCHAR(255)")

            column(name: "work_phone", type: "BIGINT")
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-4") {
        createTable(tableName: "leave_application") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "employee_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "end_date", type: "DATETIME") {
                constraints(nullable: "false")
            }

            column(name: "leave_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "leave_reason", type: "VARCHAR(255)")

            column(name: "leave_type", type: "VARCHAR(255)")

            column(name: "start_date", type: "DATETIME") {
                constraints(nullable: "false")
            }

            column(name: "status", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "total_days", type: "DOUBLE")
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-5") {
        createTable(tableName: "role") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "authority", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-6") {
        createTable(tableName: "user") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "account_expired", type: "BIT") {
                constraints(nullable: "false")
            }

            column(name: "account_locked", type: "BIT") {
                constraints(nullable: "false")
            }

            column(name: "enabled", type: "BIT") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "password_expired", type: "BIT") {
                constraints(nullable: "false")
            }

            column(name: "username", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-7") {
        createTable(tableName: "user_role") {
            column(name: "role_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-8") {
        addPrimaryKey(columnNames: "role_id, user_id", tableName: "user_role")
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-15") {
        createIndex(indexName: "UK_mc5x07dj0uft9opsxchp0uwji", tableName: "employee", unique: "true") {
            column(name: "employee_id")
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-16") {
        createIndex(indexName: "UK_irsamgnera6angm0prq1kemt2", tableName: "role", unique: "true") {
            column(name: "authority")
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-17") {
        createIndex(indexName: "UK_sb8bbouer5wak8vyiiy4pf2bx", tableName: "user", unique: "true") {
            column(name: "username")
        }
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-9") {
        addForeignKeyConstraint(baseColumnNames: "department_id", baseTableName: "employee", baseTableSchemaName: "new_lms", constraintName: "FK_hr5ovw667hkx0jl5cmyo66wb8", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "department", referencedTableSchemaName: "new_lms", referencesUniqueColumn: "false")
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-10") {
        addForeignKeyConstraint(baseColumnNames: "designation_id", baseTableName: "employee", baseTableSchemaName: "new_lms", constraintName: "FK_fvanju2gyowte98s1drrw2g2s", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "designation", referencedTableSchemaName: "new_lms", referencesUniqueColumn: "false")
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-11") {
        addForeignKeyConstraint(baseColumnNames: "id", baseTableName: "employee", baseTableSchemaName: "new_lms", constraintName: "FK_nhli7owi6ferubmgll5umph0", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "user", referencedTableSchemaName: "new_lms", referencesUniqueColumn: "false")
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-12") {
        addForeignKeyConstraint(baseColumnNames: "employee_id", baseTableName: "leave_application", baseTableSchemaName: "new_lms", constraintName: "FK_5g4ynuutg3ktfieekwsnvrr64", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "employee", referencedTableSchemaName: "new_lms", referencesUniqueColumn: "false")
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-13") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", baseTableSchemaName: "new_lms", constraintName: "FK_it77eq964jhfqtu54081ebtio", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "role", referencedTableSchemaName: "new_lms", referencesUniqueColumn: "false")
    }

    changeSet(author: "utsabn34 (generated)", id: "1453859396353-14") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", baseTableSchemaName: "new_lms", constraintName: "FK_apcc8lxk2xnug8377fatvbn04", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "user", referencedTableSchemaName: "new_lms", referencesUniqueColumn: "false")
    }
}
