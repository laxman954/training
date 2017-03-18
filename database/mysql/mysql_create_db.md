[Go to Home Page](/training)

***

## MySQL

### [Create Database](http://dev.mysql.com/doc/refman/5.5/en/create-database.html)

  ```
  CREATE {DATABASE | SCHEMA} [IF NOT EXISTS] db_name
    [create_specification] ...

    create_specification:
      [DEFAULT] CHARACTER SET [=] charset_name
    | [DEFAULT] COLLATE [=] collation_name

  ```

  * CREATE DATABASE creates a database with the given name
  * CREATE SCHEMA is a synonym for CREATE DATABASE.
  * Error occure if db already exists, so use _IF NOT EXISTS_

  * **create_specification** - specify db characteristics , these characterstics are stored in _db.opt_ file in db directiory
    * _CHARACTER SET_ clause specifies default character set
    * _COLLATE_ clause specifies default database collation _(Collect and combine (texts, information, or sets of figures) in proper order.)_
    * [Different Character Set and Collation info](http://dev.mysql.com/doc/refman/5.5/en/charset.html)

    > Why Character Set & Collate?

    > MySQL Character set support that enables you _store data_ using of _character set_
        - Use at server, database, table, and column level
        - used for the MyISAM, MEMORY, NDBCLUSTER, InnoDB storage engine
    > Perform _comparisons_ according to variety of _collation_

  ##### Req:
    * need create privilege for the db
    *


***

[Go to Home Page](/training)

***
